package net.chukkthedukk.heelermod.entity.client;

import com.google.common.collect.Maps;
import net.chukkthedukk.heelermod.HeelerMod;
import net.chukkthedukk.heelermod.entity.custom.HeelerEntity;
import net.chukkthedukk.heelermod.entity.variant.HeelerVariant;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class HeelerRenderer extends GeoEntityRenderer<HeelerEntity> {
    public static final Map<HeelerVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(HeelerVariant.class), (map) -> {
                map.put(HeelerVariant.BLUE,
                        new Identifier(HeelerMod.MOD_ID, "textures/entity/heeler/heeler_blue.png"));
                map.put(HeelerVariant.BLUE1A,
                        new Identifier(HeelerMod.MOD_ID, "textures/entity/heeler/heeler_blue1a.png"));
                map.put(HeelerVariant.BLUE1B,
                        new Identifier(HeelerMod.MOD_ID, "textures/entity/heeler/heeler_blue1b.png"));
                map.put(HeelerVariant.BLUE2,
                        new Identifier(HeelerMod.MOD_ID, "textures/entity/heeler/heeler_blue2.png"));
                map.put(HeelerVariant.RED,
                        new Identifier(HeelerMod.MOD_ID, "textures/entity/heeler/heeler_red.png"));
                map.put(HeelerVariant.RED1A,
                        new Identifier(HeelerMod.MOD_ID, "textures/entity/heeler/heeler_red1a.png"));
                map.put(HeelerVariant.RED1B,
                        new Identifier(HeelerMod.MOD_ID, "textures/entity/heeler/heeler_red1b.png"));
                map.put(HeelerVariant.RED2,
                        new Identifier(HeelerMod.MOD_ID, "textures/entity/heeler/heeler_red2.png"));
            });

    public HeelerRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new HeelerModel());
    }

    @Override
    public Identifier getTextureLocation(HeelerEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderLayer getRenderType(HeelerEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {
        if(animatable.isBaby()) {
            stack.scale(0.5f, 0.5f, 0.5f);
        } else {
            stack.scale(1f, 1f, 1f);
        }

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
