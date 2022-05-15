package net.chukkthedukk.heelermod.util;

import net.chukkthedukk.heelermod.entity.ModEntities;
import net.chukkthedukk.heelermod.entity.custom.HeelerEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class ModRegistries {
    public static void registerModStuffs() {

        registerAttributes();

    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.HEELER, HeelerEntity.setAttributes());
    }
}
