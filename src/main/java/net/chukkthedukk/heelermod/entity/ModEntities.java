package net.chukkthedukk.heelermod.entity;

import net.chukkthedukk.heelermod.HeelerMod;
import net.chukkthedukk.heelermod.entity.custom.HeelerEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<HeelerEntity> HEELER = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(HeelerMod.MOD_ID, "heeler"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, HeelerEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.7f)).build());

}
