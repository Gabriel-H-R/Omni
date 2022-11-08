package net.mcreator.omni.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.Comparator;

public class DragonChargeLvl1TargetProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity dragon_charge_target = null;
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.FOLLOW_RANGE).setBaseValue(15);
		dragon_charge_target = (Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).stream()
				.sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null);
		entity.getPersistentData().putDouble("x_target_position", (dragon_charge_target.getX() - entity.getX()));
		entity.getPersistentData().putDouble("y_target_position", (dragon_charge_target.getY() - entity.getY()));
		entity.getPersistentData().putDouble("z_target_position", (dragon_charge_target.getZ() - entity.getZ()));
	}
}
