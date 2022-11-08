package net.mcreator.omni.procedures;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.omni.entity.DragonChargeLvl1Entity;

/**
public static void execute(
) {
execute(null);
}
private static void execute(
@Nullable Event event
) {
**/
public class DragonChargeLvl1ModelProcedure extends AnimatedGeoModel<DragonChargeLvl1Entity> {
	@Override
	public ResourceLocation getAnimationFileLocation(DragonChargeLvl1Entity entity) {
		return new ResourceLocation("omni", "animations/dragon_charge_lvl_1.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(DragonChargeLvl1Entity entity) {
		return new ResourceLocation("omni", "geo/dragon_charge_lvl_1.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(DragonChargeLvl1Entity entity) {
		return new ResourceLocation("omni", "textures/entities/dragon_charge_lvl_1.png");
		/**
		}
		@Override
		public void setLivingAnimations(DragonChargeLvl1Entity entity, Integer uniqueID, AnimationEvent customPredicate) {
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
