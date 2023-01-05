package net.mcreator.omni.init;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.mcreator.omni.entity.spawneggs.GeckoLibSpawnEggs;
import net.mcreator.omni.entity.JadeDragonEntity;
import net.mcreator.omni.OmniMod;

@Mod.EventBusSubscriber(modid = OmniMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OmniModGeckoLibEntities {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			GeckoLibSpawnEggs.REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
		});
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			JadeDragonEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(OmniModEntities.JADE_DRAGON.get(), JadeDragonEntity.createAttributes().build());
	}
}
