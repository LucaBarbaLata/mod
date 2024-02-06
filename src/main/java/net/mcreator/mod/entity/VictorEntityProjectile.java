
package net.mcreator.mod.entity;

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
