package com.hueae.droopys_mansion;

import com.hueae.droopys_mansion.block.ModBlocks;
import com.hueae.droopys_mansion.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DroopysMansion implements ModInitializer {
    public static final String MOD_ID = "droopys_mansion";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
