
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.omni.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.omni.item.TeleportSpaceItemItem;
import net.mcreator.omni.item.ParticleSpawnerItem;
import net.mcreator.omni.item.DragonChargeLvl1MagicItem;
import net.mcreator.omni.OmniMod;

public class OmniModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OmniMod.MODID);
	public static final RegistryObject<Item> TELEPORT_SPACE_ITEM = REGISTRY.register("teleport_space_item", () -> new TeleportSpaceItemItem());
	public static final RegistryObject<Item> PARTICLE_SPAWNER = REGISTRY.register("particle_spawner", () -> new ParticleSpawnerItem());
	public static final RegistryObject<Item> DRAGON_CHARGE_LVL_1_MAGIC = REGISTRY.register("dragon_charge_lvl_1_magic",
			() -> new DragonChargeLvl1MagicItem());
}
