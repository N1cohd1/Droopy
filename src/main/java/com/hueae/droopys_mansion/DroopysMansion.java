package com.hueae.droopys_mansion;

import com.hueae.droopys_mansion.block.ModBlocks;
import com.hueae.droopys_mansion.entity.GhostEntity;
import com.hueae.droopys_mansion.entity.ModEntities;
import com.hueae.droopys_mansion.item.ModItems;
import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.attribute.EntityAttributes;
import org.slf4j.Logger;

public class DroopysMansion implements ModInitializer {
    public static final String MODID = "droopys_mansion";
    public static final Logger LOGGER = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        ModItems.loadModItems();
        ModEntities.loadModEntities();
        ModBlocks.loadModBlocks();

        FabricDefaultAttributeRegistry.register(ModEntities.GHOST, GhostEntity.createAttributes());
    }
}
