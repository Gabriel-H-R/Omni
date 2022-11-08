
package net.mcreator.omni.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.omni.procedures.JadeDragonModelProcedure;
import net.mcreator.omni.entity.JadeDragonEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class JadeDragonRenderer extends GeoEntityRenderer<JadeDragonEntity> {
	public JadeDragonRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new JadeDragonModelProcedure());
		this.shadowRadius = 1f;
	}

	@Override
	public RenderType getRenderType(JadeDragonEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
	}
}
