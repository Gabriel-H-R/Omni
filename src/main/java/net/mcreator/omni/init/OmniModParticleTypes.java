
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.omni.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.omni.OmniMod;

public class OmniModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, OmniMod.MODID);
	public static final RegistryObject<ParticleType<?>> YELLOW_SMOKE = REGISTRY.register("yellow_smoke", () -> new SimpleParticleType(true));
	public static final RegistryObject<ParticleType<?>> RED_SMOKE = REGISTRY.register("red_smoke", () -> new SimpleParticleType(true));
}
