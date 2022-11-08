
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.omni.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OmniModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("omni", "jade_dragon_death"), new SoundEvent(new ResourceLocation("omni", "jade_dragon_death")));
		REGISTRY.put(new ResourceLocation("omni", "jade_dragon_idle"), new SoundEvent(new ResourceLocation("omni", "jade_dragon_idle")));
		REGISTRY.put(new ResourceLocation("omni", "jade_dragon_hurt"), new SoundEvent(new ResourceLocation("omni", "jade_dragon_hurt")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
