package com.hueae.droopys_mansion.entity;

import com.hueae.droopys_mansion.DroopysMansion;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<GhostEntity> GHOST = registerEntity("ghost", EntityType.Builder.create(GhostEntity::new, SpawnGroup.MONSTER)
            .dimensions(0.6F, 1.95F)
            .eyeHeight(1.74F)
            .passengerAttachments(2.0125F)
            .vehicleAttachment(-0.7F)
            .maxTrackingRange(8)
    );

    private static <T extends Entity> EntityType<T> registerEntity(String name, EntityType.Builder<T> entityType) {
        return Registry.register(Registries.ENTITY_TYPE, Identifier.tryParse(DroopysMansion.MODID, name), entityType.build(name));
    }

    public static void loadModEntities() {
    }
}
