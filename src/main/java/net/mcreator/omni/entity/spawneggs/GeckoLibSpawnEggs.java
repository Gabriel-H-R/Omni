package net.mcreator.omni.entity.spawneggs;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.omni.init.OmniModEntities;
import net.mcreator.omni.OmniMod;

public class GeckoLibSpawnEggs {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OmniMod.MODID);

	public static final RegistryObject<Item> JADE_DRAGON = REGISTRY.register("jade_dragon_spawn_egg",
			() -> new ForgeSpawnEggItem(OmniModEntities.JADE_DRAGON, -16711834, -3394816, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
