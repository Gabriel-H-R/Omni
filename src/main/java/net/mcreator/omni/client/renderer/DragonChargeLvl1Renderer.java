
package net.mcreator.omni.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.omni.procedures.DragonChargeLvl1ModelProcedure;
import net.mcreator.omni.entity.DragonChargeLvl1Entity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class DragonChargeLvl1Renderer extends GeoEntityRenderer<DragonChargeLvl1Entity> {
	public DragonChargeLvl1Renderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new DragonChargeLvl1ModelProcedure());
		this.shadowRadius = 0f;
	}

	@Override
	public RenderType getRenderType(DragonChargeLvl1Entity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
	}
}
