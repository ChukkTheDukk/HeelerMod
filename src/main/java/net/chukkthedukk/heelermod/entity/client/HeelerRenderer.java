package net.chukkthedukk.heelermod.entity.client;

import net.chukkthedukk.heelermod.HeelerMod;
import net.chukkthedukk.heelermod.entity.custom.HeelerEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class HeelerRenderer extends GeoEntityRenderer<HeelerEntity> {
    public HeelerRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new HeelerModel());
    }

    @Override
    public Identifier getTextureLocation(HeelerEntity instance) {
        return new Identifier(HeelerMod.MOD_ID, "textures/entity/heeler/heeler_blue.png");
    }
}
