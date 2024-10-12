package com.hueae.droopys_mansion.client.renderer;

import com.hueae.droopys_mansion.client.model.GhostEntityModel;
import com.hueae.droopys_mansion.entity.GhostEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class GhostEntityRenderer extends GeoEntityRenderer<GhostEntity> {
    public GhostEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new GhostEntityModel());
    }
}
