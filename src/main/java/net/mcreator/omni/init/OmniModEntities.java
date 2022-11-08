
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.omni.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.omni.entity.JadeDragonEntity;
import net.mcreator.omni.entity.DragonChargeLvl1MagicEntity;
import net.mcreator.omni.entity.DragonChargeLvl1Entity;
import net.mcreator.omni.OmniMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OmniModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, OmniMod.MODID);
	public static final RegistryObject<EntityType<JadeDragonEntity>> JADE_DRAGON = register("jade_dragon",
			EntityType.Builder.<JadeDragonEntity>of(JadeDragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(JadeDragonEntity::new)

					.sized(6f, 8f));
	public static final RegistryObject<EntityType<DragonChargeLvl1Entity>> DRAGON_CHARGE_LVL_1 = register("dragon_charge_lvl_1",
			EntityType.Builder.<DragonChargeLvl1Entity>of(DragonChargeLvl1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DragonChargeLvl1Entity::new)

					.sized(1f, 1.5f));
	public static final RegistryObject<EntityType<DragonChargeLvl1MagicEntity>> DRAGON_CHARGE_LVL_1_MAGIC = register(
			"projectile_dragon_charge_lvl_1_magic",
			EntityType.Builder.<DragonChargeLvl1MagicEntity>of(DragonChargeLvl1MagicEntity::new, MobCategory.MISC)
					.setCustomClientFactory(DragonChargeLvl1MagicEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			JadeDragonEntity.init();
			DragonChargeLvl1Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(JADE_DRAGON.get(), JadeDragonEntity.createAttributes().build());
		event.put(DRAGON_CHARGE_LVL_1.get(), DragonChargeLvl1Entity.createAttributes().build());
	}
}
