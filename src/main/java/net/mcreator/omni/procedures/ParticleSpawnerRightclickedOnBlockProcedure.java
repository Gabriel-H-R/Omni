package net.mcreator.omni.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.omni.init.OmniModParticleTypes;

public class ParticleSpawnerRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (OmniModParticleTypes.YELLOW_SMOKE.get()), x, (y + 1), z, 200, 0.2, 0.2, 0.2, 0.2);
	}
}
