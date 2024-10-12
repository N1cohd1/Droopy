package com.hueae.droopys_mansion.client;

import com.hueae.droopys_mansion.client.renderer.GhostEntityRenderer;
import com.hueae.droopys_mansion.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class DroopysMansionClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.GHOST, GhostEntityRenderer::new);
    }
}
