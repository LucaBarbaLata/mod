
package net.mcreator.mod.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.mod.init.ModModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class VictorEntityProjectile extends AbstractArrow implements ItemSupplier {
	public VictorEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(ModModEntities.VICTOR_PROJECTILE.get(), world);
	}

	public VictorEntityProjectile(EntityType<? extends VictorEntityProjectile> type, Level world) {
		super(type, world);
	}

	public VictorEntityProjectile(EntityType<? extends VictorEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public VictorEntityProjectile(EntityType<? extends VictorEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Items.DIAMOND_SWORD);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Items.DIAMOND_SWORD);
	}
}
