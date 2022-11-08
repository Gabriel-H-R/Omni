package net.mcreator.omni.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.omni.init.OmniModParticleTypes;

public class DragonChargeFlyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (!immediatesourceentity.isNoGravity()) {
			immediatesourceentity.setNoGravity((true));
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (OmniModParticleTypes.YELLOW_SMOKE.get()), x, y, z, 200, 0.1, 0.1, 0.1, 0.1);
		if (!world.isEmptyBlock(new BlockPos(x, y, z)) || !world.isEmptyBlock(new BlockPos(x + 1, y, z))
				|| !world.isEmptyBlock(new BlockPos(x - 1, y, z)) || !world.isEmptyBlock(new BlockPos(x, y, z + 1))
				|| !world.isEmptyBlock(new BlockPos(x, y, z - 1))) {
			if (!immediatesourceentity.level.isClientSide())
				immediatesourceentity.discard();
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.DESTROY);
		}
	}
}
