package com.hueae.droopys_mansion.block;

import com.hueae.droopys_mansion.DroopysMansion;
import com.hueae.droopys_mansion.block.custom.CustomTestBlock;
import com.hueae.droopys_mansion.block.custom.RubyLampBlock;
import com.hueae.droopys_mansion.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static void loadModBlocks() {
        DroopysMansion.LOGGER.info("Registering Mod Blocks for " + DroopysMansion.MODID);
    }

    //BLOCKS ======================
    //Die slipperiness war keine gute idee tbh
    public static final Block PALE_PLANKS = registerBlock("pale_planks",
            new Block (AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable().slipperiness(5f)));

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block (AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(4.0F, 3.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block (AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F).sounds(BlockSoundGroup.STONE)));

   //Joa, der komische Testblock
    public static final Block CUSTOM_TEST_BLOCK = registerBlock("custom_test_block",
            new CustomTestBlock(AbstractBlock.Settings.create().strength(1).slipperiness(0.9f).requiresTool()));

    public static final Block RUBY_LAMP = registerBlock("ruby_lamp",
            new RubyLampBlock(AbstractBlock.Settings.create().strength(0.8f).luminance(state -> state.get(RubyLampBlock.CLICKED) ? 15:0).sounds(BlockSoundGroup.GLASS)));

    //Helper Method for Blocks
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(DroopysMansion.MODID, name), block);
    }
    //Helper Method for Blockitems
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(DroopysMansion.MODID, name), new BlockItem(block, new Item.Settings()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.PALE_PLANKS);
            entries.add(ModBlocks.CUSTOM_TEST_BLOCK);
            entries.add(ModBlocks.RUBY_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.RUBY_ORE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> {
            entries.add(ModBlocks.RUBY_LAMP);
        });
    }
}

