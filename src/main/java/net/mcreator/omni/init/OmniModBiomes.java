
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.omni.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.omni.world.biome.SpaceBiome;
import net.mcreator.omni.OmniMod;

public class OmniModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, OmniMod.MODID);
	public static final RegistryObject<Biome> SPACE = REGISTRY.register("space", () -> SpaceBiome.createBiome());
}
