package com.hueae.droopys_mansion.client.model;

import com.hueae.droopys_mansion.DroopysMansion;
import com.hueae.droopys_mansion.entity.GhostEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class GhostEntityModel extends DefaultedEntityGeoModel<GhostEntity> {
    public GhostEntityModel() {
        super(Identifier.of(DroopysMansion.MODID, "ghost"));
    }
}
