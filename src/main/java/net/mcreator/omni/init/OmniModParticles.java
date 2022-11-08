
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.omni.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import net.mcreator.omni.client.particle.YellowSmokeParticle;
import net.mcreator.omni.client.particle.RedSmokeParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class OmniModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) OmniModParticleTypes.YELLOW_SMOKE.get(), YellowSmokeParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) OmniModParticleTypes.RED_SMOKE.get(), RedSmokeParticle::provider);
	}
}
