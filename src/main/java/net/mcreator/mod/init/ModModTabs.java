
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mod.ModMod;

public class ModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModMod.MODID);
	public static final RegistryObject<CreativeModeTab> MOD = REGISTRY.register("mod", () -> CreativeModeTab.builder().title(Component.translatable("item_group.mod.mod")).icon(() -> new ItemStack(Blocks.BELL)).displayItems((parameters, tabData) -> {
		tabData.accept(ModModItems.SUPER_HOT.get());
	})

			.build());
}
