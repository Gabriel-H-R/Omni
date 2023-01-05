package net.mcreator.omni.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.omni.init.OmniModEntities;
import net.mcreator.omni.entity.JadeDragonEntity;
import net.mcreator.omni.entity.DragonChargeLvl1MagicEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class JadeDragonHurt2Procedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		Entity target = null;
		Entity shooter = null;
		double distance_vector_norma = 0;
		double inaccuracy = 0;
		double z_distance = 0;
		double target_height = 0;
		double y_distance = 0;
		double shooter_height = 0;
		double projectile_speed = 0;
		double direction_dy = 0;
		double direction_dx = 0;
		double x_distance = 0;
		double direction_dz = 0;
		if (sourceentity instanceof Player) {
			shooter = entity;
			target = sourceentity;
			shooter_height = shooter.getBbHeight();
			target_height = target.getBbHeight();
			projectile_speed = 2.5;
			shooter_height = 0;
			x_distance = sourceentity.getX() - entity.getX();
			y_distance = (target.getY() + target_height) - (shooter.getY() + shooter_height);
			z_distance = sourceentity.getZ() - entity.getZ();
			distance_vector_norma = Math.sqrt(Math.pow(x_distance, 2) + Math.pow(y_distance, 2) + Math.pow(z_distance, 2));
			direction_dx = Math.sin(x_distance / distance_vector_norma);
			direction_dy = Math.sin(y_distance / distance_vector_norma);
			direction_dz = Math.sin(z_distance / distance_vector_norma);
			entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25, 0.05, 0.25));
			if (entity instanceof JadeDragonEntity) {
				((JadeDragonEntity) entity).animationprocedure = "dragon_charge";
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
						AbstractArrow entityToSpawn = new DragonChargeLvl1MagicEntity(OmniModEntities.DRAGON_CHARGE_LVL_1_MAGIC.get(), level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setPierceLevel(piercing);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, shooter, 5, 1, (byte) 1);
				_entityToSpawn.setPos((shooter.getX()), (shooter.getY() + shooter_height), (shooter.getZ()));
				_entityToSpawn.shoot(direction_dx, direction_dy, direction_dz, (float) projectile_speed, (float) inaccuracy);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
	}
}
