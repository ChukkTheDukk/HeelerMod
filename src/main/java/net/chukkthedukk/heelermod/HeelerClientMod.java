package net.chukkthedukk.heelermod;

import net.chukkthedukk.heelermod.entity.ModEntities;
import net.chukkthedukk.heelermod.entity.client.HeelerRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class HeelerClientMod implements ClientModInitializer {
    private Object HeelerRenderer;

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.HEELER, HeelerRenderer::new);
    }
}