package net.mcreator.omni.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.omni.entity.DragonChargeLvl1Entity;

public class DragonChargeLvl1FollowTargetProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof DragonChargeLvl1Entity) {
			((DragonChargeLvl1Entity) entity).animationprocedure = "charge";
		}
		if (!(x == entity.getPersistentData().getDouble("x_target_position"))) {
			{
				Entity _ent = entity;
				_ent.teleportTo((x + 1), y, z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((x + 1), y, z, _ent.getYRot(), _ent.getXRot());
			}
		}
		if (!(y == entity.getPersistentData().getDouble("y_target_position"))) {
			{
				Entity _ent = entity;
				_ent.teleportTo(x, (y + 1), z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, (y + 1), z, _ent.getYRot(), _ent.getXRot());
			}
		}
		if (!(z == entity.getPersistentData().getDouble("z_target_position"))) {
			{
				Entity _ent = entity;
				_ent.teleportTo(x, y, (z + 1));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, y, (z + 1), _ent.getYRot(), _ent.getXRot());
			}
		}
	}
}
