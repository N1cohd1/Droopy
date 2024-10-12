package com.hueae.droopys_mansion.block;

import com.hueae.droopys_mansion.DroopysMansion;
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
        });
    }


}

