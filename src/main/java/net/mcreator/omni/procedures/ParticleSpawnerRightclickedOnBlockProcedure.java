package net.mcreator.omni.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.omni.init.OmniModParticleTypes;

public class ParticleSpawnerRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.setNoGravity((true));
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (OmniModParticleTypes.YELLOW_SMOKE.get()), x, y, z, 100, 0.1, 0.1, 0.1, 0.2);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (OmniModParticleTypes.ORANGE_SMOKE.get()), x, y, z, 80, 0.15, 0.15, 0.15, 0.2);
	}
}
