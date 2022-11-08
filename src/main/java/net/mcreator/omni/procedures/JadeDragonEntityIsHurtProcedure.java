package net.mcreator.omni.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.omni.init.OmniModEntities;
import net.mcreator.omni.entity.JadeDragonEntity;
import net.mcreator.omni.entity.DragonChargeLvl1MagicEntity;

public class JadeDragonEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player) {
			entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25, 0.05, 0.25));
			if (entity instanceof JadeDragonEntity) {
				((JadeDragonEntity) entity).animationprocedure = "dragon_charge";
			}
			class JadeDragonEntityIsHurtWait18 {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					this.world = world;
					MinecraftForge.EVENT_BUS.register(JadeDragonEntityIsHurtWait18.this);
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						JadeDragonEntityIsHurtWait18.this.ticks += 1;
						if (JadeDragonEntityIsHurtWait18.this.ticks >= JadeDragonEntityIsHurtWait18.this.waitTicks)
							run();
					}
				}

				private void run() {
					MinecraftForge.EVENT_BUS.unregister(JadeDragonEntityIsHurtWait18.this);
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level;
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
									AbstractArrow entityToSpawn = new DragonChargeLvl1MagicEntity(OmniModEntities.DRAGON_CHARGE_LVL_1_MAGIC.get(),
											level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 5, 1);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					class JadeDragonEntityIsHurtWait7 {
						private int ticks = 0;
						private float waitTicks;
						private LevelAccessor world;

						public void start(LevelAccessor world, int waitTicks) {
							this.waitTicks = waitTicks;
							this.world = world;
							MinecraftForge.EVENT_BUS.register(JadeDragonEntityIsHurtWait7.this);
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								JadeDragonEntityIsHurtWait7.this.ticks += 1;
								if (JadeDragonEntityIsHurtWait7.this.ticks >= JadeDragonEntityIsHurtWait7.this.waitTicks)
									run();
							}
						}

						private void run() {
							MinecraftForge.EVENT_BUS.unregister(JadeDragonEntityIsHurtWait7.this);
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level;
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
											AbstractArrow entityToSpawn = new DragonChargeLvl1MagicEntity(
													OmniModEntities.DRAGON_CHARGE_LVL_1_MAGIC.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, 5, 1);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						}
					}
					new JadeDragonEntityIsHurtWait7().start(world, 5);
					class JadeDragonEntityIsHurtWait10 {
						private int ticks = 0;
						private float waitTicks;
						private LevelAccessor world;

						public void start(LevelAccessor world, int waitTicks) {
							this.waitTicks = waitTicks;
							this.world = world;
							MinecraftForge.EVENT_BUS.register(JadeDragonEntityIsHurtWait10.this);
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								JadeDragonEntityIsHurtWait10.this.ticks += 1;
								if (JadeDragonEntityIsHurtWait10.this.ticks >= JadeDragonEntityIsHurtWait10.this.waitTicks)
									run();
							}
						}

						private void run() {
							MinecraftForge.EVENT_BUS.unregister(JadeDragonEntityIsHurtWait10.this);
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level;
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
											AbstractArrow entityToSpawn = new DragonChargeLvl1MagicEntity(
													OmniModEntities.DRAGON_CHARGE_LVL_1_MAGIC.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, 5, 1);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						}
					}
					new JadeDragonEntityIsHurtWait10().start(world, 5);
					class JadeDragonEntityIsHurtWait13 {
						private int ticks = 0;
						private float waitTicks;
						private LevelAccessor world;

						public void start(LevelAccessor world, int waitTicks) {
							this.waitTicks = waitTicks;
							this.world = world;
							MinecraftForge.EVENT_BUS.register(JadeDragonEntityIsHurtWait13.this);
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								JadeDragonEntityIsHurtWait13.this.ticks += 1;
								if (JadeDragonEntityIsHurtWait13.this.ticks >= JadeDragonEntityIsHurtWait13.this.waitTicks)
									run();
							}
						}

						private void run() {
							MinecraftForge.EVENT_BUS.unregister(JadeDragonEntityIsHurtWait13.this);
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level;
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
											AbstractArrow entityToSpawn = new DragonChargeLvl1MagicEntity(
													OmniModEntities.DRAGON_CHARGE_LVL_1_MAGIC.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, 5, 1);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						}
					}
					new JadeDragonEntityIsHurtWait13().start(world, 5);
					class JadeDragonEntityIsHurtWait16 {
						private int ticks = 0;
						private float waitTicks;
						private LevelAccessor world;

						public void start(LevelAccessor world, int waitTicks) {
							this.waitTicks = waitTicks;
							this.world = world;
							MinecraftForge.EVENT_BUS.register(JadeDragonEntityIsHurtWait16.this);
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								JadeDragonEntityIsHurtWait16.this.ticks += 1;
								if (JadeDragonEntityIsHurtWait16.this.ticks >= JadeDragonEntityIsHurtWait16.this.waitTicks)
									run();
							}
						}

						private void run() {
							MinecraftForge.EVENT_BUS.unregister(JadeDragonEntityIsHurtWait16.this);
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level;
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
											AbstractArrow entityToSpawn = new DragonChargeLvl1MagicEntity(
													OmniModEntities.DRAGON_CHARGE_LVL_1_MAGIC.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, 5, 1);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						}
					}
					new JadeDragonEntityIsHurtWait16().start(world, 5);
					if (sourceentity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Dragon Cannon!!"), (true));
				}
			}
			new JadeDragonEntityIsHurtWait18().start(world, 110);
		}
	}
}
