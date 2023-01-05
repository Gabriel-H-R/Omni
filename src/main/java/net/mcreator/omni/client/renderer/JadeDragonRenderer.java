
package net.mcreator.omni.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.omni.entity.model.JadeDragonModel;
import net.mcreator.omni.entity.JadeDragonEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class JadeDragonRenderer extends GeoEntityRenderer<JadeDragonEntity> {
	public JadeDragonRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new JadeDragonModel());
		this.shadowRadius = 2f;
	}

	@Override
	public RenderType getRenderType(JadeDragonEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		if (!animatable.isBaby())
			stack.scale(1.0F, 1.0F, 1.0F);
		else
			stack.scale(0.5F, 0.5F, 0.5F);
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	protected float getDeathMaxRotation(JadeDragonEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
