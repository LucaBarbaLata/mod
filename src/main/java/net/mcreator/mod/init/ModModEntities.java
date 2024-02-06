
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

import net.mcreator.mod.entity.IlieEntity;
import net.mcreator.mod.entity.AnghelEntity;
import net.mcreator.mod.ModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ModMod.MODID);
	public static final RegistryObject<EntityType<IlieEntity>> ILIE = register("ilie",
			EntityType.Builder.<IlieEntity>of(IlieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(IlieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AnghelEntity>> ANGHEL = register("anghel",
			EntityType.Builder.<AnghelEntity>of(AnghelEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AnghelEntity::new)

					.sized(1f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			IlieEntity.init();
			AnghelEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ILIE.get(), IlieEntity.createAttributes().build());
		event.put(ANGHEL.get(), AnghelEntity.createAttributes().build());
	}
}
