
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.mod.client.renderer.VictorRenderer;
import net.mcreator.mod.client.renderer.IlieRenderer;
import net.mcreator.mod.client.renderer.AnghelRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ModModEntities.ILIE.get(), IlieRenderer::new);
		event.registerEntityRenderer(ModModEntities.ANGHEL.get(), AnghelRenderer::new);
		event.registerEntityRenderer(ModModEntities.VICTOR.get(), VictorRenderer::new);
	}
}
