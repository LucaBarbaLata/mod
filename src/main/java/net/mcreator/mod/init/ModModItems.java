
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mod.item.SuperHotItem;
import net.mcreator.mod.ModMod;

public class ModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ModMod.MODID);
	public static final RegistryObject<Item> SUPER_HOT = REGISTRY.register("super_hot", () -> new SuperHotItem());
	public static final RegistryObject<Item> ILIE_SPAWN_EGG = REGISTRY.register("ilie_spawn_egg", () -> new ForgeSpawnEggItem(ModModEntities.ILIE, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> TRASH = block(ModModBlocks.TRASH);
	public static final RegistryObject<Item> ANGHEL_SPAWN_EGG = REGISTRY.register("anghel_spawn_egg", () -> new ForgeSpawnEggItem(ModModEntities.ANGHEL, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> VICTOR_SPAWN_EGG = REGISTRY.register("victor_spawn_egg", () -> new ForgeSpawnEggItem(ModModEntities.VICTOR, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> SUBSTANA_ROZ_SPAWN_EGG = REGISTRY.register("substana_roz_spawn_egg", () -> new ForgeSpawnEggItem(ModModEntities.SUBSTANA_ROZ, -1, -1, new Item.Properties()));

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
