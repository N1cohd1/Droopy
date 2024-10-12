package com.hueae.droopys_mansion.client.model;

import com.hueae.droopys_mansion.entity.GhostEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.AbstractZombieModel;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class GhostEntityModel extends AbstractZombieModel<GhostEntity> {
    public GhostEntityModel(ModelPart modelPart) {
        super(modelPart);
    }

    @Override
    public boolean isAttacking(GhostEntity entity) {
        return false;
    }
}
