
package net.mcreator.omni.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.omni.procedures.ParticleSpawnerRightclickedOnBlockProcedure;
import net.mcreator.omni.procedures.DragonChargeLvl1MagicHitProcedure;
import net.mcreator.omni.init.OmniModItems;
import net.mcreator.omni.init.OmniModEntities;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class DragonChargeLvl1MagicEntity extends AbstractArrow implements ItemSupplier {
	public DragonChargeLvl1MagicEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(OmniModEntities.DRAGON_CHARGE_LVL_1_MAGIC.get(), world);
	}

	public DragonChargeLvl1MagicEntity(EntityType<? extends DragonChargeLvl1MagicEntity> type, Level world) {
		super(type, world);
	}

	public DragonChargeLvl1MagicEntity(EntityType<? extends DragonChargeLvl1MagicEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public DragonChargeLvl1MagicEntity(EntityType<? extends DragonChargeLvl1MagicEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(OmniModItems.TELEPORT_SPACE_ITEM.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void playerTouch(Player entity) {
		super.playerTouch(entity);
		DragonChargeLvl1MagicHitProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		DragonChargeLvl1MagicHitProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		DragonChargeLvl1MagicHitProcedure.execute(this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(),
				blockHitResult.getBlockPos().getZ());
	}

	@Override
	public void tick() {
		super.tick();
		ParticleSpawnerRightclickedOnBlockProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this.getOwner());
		if (this.inGround)
			this.discard();
	}

	public static DragonChargeLvl1MagicEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		DragonChargeLvl1MagicEntity entityarrow = new DragonChargeLvl1MagicEntity(OmniModEntities.DRAGON_CHARGE_LVL_1_MAGIC.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("")),
				SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static DragonChargeLvl1MagicEntity shoot(LivingEntity entity, LivingEntity target) {
		DragonChargeLvl1MagicEntity entityarrow = new DragonChargeLvl1MagicEntity(OmniModEntities.DRAGON_CHARGE_LVL_1_MAGIC.get(), entity,
				entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 5f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(30);
		entityarrow.setKnockback(3);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("")),
				SoundSource.PLAYERS, 1, 1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
