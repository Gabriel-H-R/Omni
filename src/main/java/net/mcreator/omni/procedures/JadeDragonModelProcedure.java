package net.mcreator.omni.procedures;

import software.bernie.geckolib3.model.provider.data.EntityModelData;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.omni.entity.JadeDragonEntity;

/**
public static void execute(
) {
execute(null);
}
private static void execute(
@Nullable Event event
) {
**/
public class JadeDragonModelProcedure extends AnimatedGeoModel<JadeDragonEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(JadeDragonEntity entity) {
		return new ResourceLocation("omni", "animations/jade_dragon.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(JadeDragonEntity entity) {
		return new ResourceLocation("omni", "geo/jade_dragon.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(JadeDragonEntity entity) {
		return new ResourceLocation("omni", "textures/entities/jade_dragon.png");
	}

	@Override
	public void setLivingAnimations(JadeDragonEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
		super.setLivingAnimations(entity, uniqueID, customPredicate);
		IBone head = this.getAnimationProcessor().getBone("head");
		EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
		AnimationData manager = entity.getFactory().getOrCreateAnimationData(uniqueID);
		int unpausedMultiplier = !Minecraft.getInstance().isPaused() || manager.shouldPlayWhilePaused ? 1 : 0;
		head.setRotationX(head.getRotationX() + extraData.headPitch * ((float) Math.PI / 180F) * unpausedMultiplier);
		head.setRotationY(head.getRotationY() + extraData.netHeadYaw * ((float) Math.PI / 180F) * unpausedMultiplier);
		/** **/
	}
}
