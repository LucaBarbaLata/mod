
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.mod.item.SuperHotItem;
import net.mcreator.mod.ModMod;

public class ModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ModMod.MODID);
	public static final RegistryObject<Item> SUPER_HOT = REGISTRY.register("super_hot", () -> new SuperHotItem());
}
