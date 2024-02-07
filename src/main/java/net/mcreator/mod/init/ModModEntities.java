
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.mod.entity.VictorEntity;
import net.mcreator.mod.entity.SubstanaRozEntity;
import net.mcreator.mod.entity.IlieEntity;
import net.mcreator.mod.ModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ModMod.MODID);
	public static final RegistryObject<EntityType<IlieEntity>> ILIE = register("ilie",
			EntityType.Builder.<IlieEntity>of(IlieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(IlieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VictorEntity>> VICTOR = register("victor",
			EntityType.Builder.<VictorEntity>of(VictorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VictorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SubstanaRozEntity>> SUBSTANA_ROZ = register("substana_roz",
			EntityType.Builder.<SubstanaRozEntity>of(SubstanaRozEntity::new, MobCategory.AXOLOTLS).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SubstanaRozEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			IlieEntity.init();
			VictorEntity.init();
			SubstanaRozEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ILIE.get(), IlieEntity.createAttributes().build());
		event.put(VICTOR.get(), VictorEntity.createAttributes().build());
		event.put(SUBSTANA_ROZ.get(), SubstanaRozEntity.createAttributes().build());
	}
}
