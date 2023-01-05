
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.omni.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.omni.client.renderer.JadeDragonRenderer;
import net.mcreator.omni.client.renderer.DragonChargeLvl1MagicRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class OmniModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(OmniModEntities.DRAGON_CHARGE_LVL_1_MAGIC.get(), DragonChargeLvl1MagicRenderer::new);
		event.registerEntityRenderer(OmniModEntities.JADE_DRAGON.get(), JadeDragonRenderer::new);
	}
}
