
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mod.ModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModMod.MODID);
	public static final RegistryObject<CreativeModeTab> MOD = REGISTRY.register("mod", () -> CreativeModeTab.builder().title(Component.translatable("item_group.mod.mod")).icon(() -> new ItemStack(Blocks.BELL)).displayItems((parameters, tabData) -> {
		tabData.accept(ModModItems.SUPER_HOT.get());
		tabData.accept(ModModBlocks.TRASH.get().asItem());
	})

			.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(ModModItems.VICTOR_SPAWN_EGG.get());
			tabData.accept(ModModItems.SUBSTANA_ROZ_SPAWN_EGG.get());
		}
	}
}
