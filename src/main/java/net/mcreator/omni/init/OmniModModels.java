
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.omni.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.omni.client.model.Modelinvisible_power;
import net.mcreator.omni.client.model.Modeldragon_charge_lvl_1;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class OmniModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeldragon_charge_lvl_1.LAYER_LOCATION, Modeldragon_charge_lvl_1::createBodyLayer);
		event.registerLayerDefinition(Modelinvisible_power.LAYER_LOCATION, Modelinvisible_power::createBodyLayer);
	}
}
