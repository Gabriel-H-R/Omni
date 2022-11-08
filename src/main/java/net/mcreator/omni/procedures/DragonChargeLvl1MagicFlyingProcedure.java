package net.mcreator.omni.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.omni.init.OmniModParticleTypes;

public class DragonChargeLvl1MagicFlyingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (OmniModParticleTypes.YELLOW_SMOKE.get()), x, y, z, 50, 0.2, 0.2, 0.2, 0.2);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (OmniModParticleTypes.YELLOW_SMOKE.get()), x, y, z, 30, 0.3, 0.3, 0.3, 0.2);
	}
}
