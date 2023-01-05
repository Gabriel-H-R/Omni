package net.mcreator.omni.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.omni.entity.DragonChargeLvl1MagicEntity;
import net.mcreator.omni.client.model.Modeldragon_charge_lvl_1;

import com.mojang.math.Vector3f;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class DragonChargeLvl1MagicRenderer extends EntityRenderer<DragonChargeLvl1MagicEntity> {
	private static final ResourceLocation texture = new ResourceLocation("omni:textures/entities/dragon_charge_lvl_1.png");
	private final Modeldragon_charge_lvl_1 model;

	public DragonChargeLvl1MagicRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modeldragon_charge_lvl_1(context.bakeLayer(Modeldragon_charge_lvl_1.LAYER_LOCATION));
	}

	@Override
	public void render(DragonChargeLvl1MagicEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn,
			int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Vector3f.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(DragonChargeLvl1MagicEntity entity) {
		return texture;
	}
}
