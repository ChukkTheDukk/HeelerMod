package net.chukkthedukk.heelermod.entity.client;

import net.chukkthedukk.heelermod.HeelerMod;
import net.chukkthedukk.heelermod.entity.custom.HeelerEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class HeelerModel extends AnimatedGeoModel<HeelerEntity> {
    @Override
    public Identifier getModelLocation(HeelerEntity object) {
        return new Identifier(HeelerMod.MOD_ID, "geo/heeler.geo.json");
    }

    @Override
    public Identifier getTextureLocation(HeelerEntity object) {
        return new Identifier(HeelerMod.MOD_ID, "textures/entity/heeler/heeler_blue.png");
    }

    @Override
    public Identifier getAnimationFileLocation(HeelerEntity animatable) {
        return new Identifier(HeelerMod.MOD_ID, "animations/heeler.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(HeelerEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180f));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180f));
        }
    }
}
