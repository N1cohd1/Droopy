package com.hueae.droopys_mansion.client.renderer;

import com.hueae.droopys_mansion.client.model.GhostEntityModel;
import com.hueae.droopys_mansion.entity.GhostEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;

public class GhostEntityRenderer extends MobEntityRenderer<GhostEntity, GhostEntityModel> {
    public GhostEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new GhostEntityModel(context.getPart(EntityModelLayers.ZOMBIE)), 5);
    }

    @Override
    public Identifier getTexture(GhostEntity entity) {
        return Identifier.ofVanilla("entity/zombie");
    }
}
