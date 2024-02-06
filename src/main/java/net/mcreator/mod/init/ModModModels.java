
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.mod.client.model.Modelvictor;
import net.mcreator.mod.client.model.ModelIlie;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelIlie.LAYER_LOCATION, ModelIlie::createBodyLayer);
		event.registerLayerDefinition(Modelvictor.LAYER_LOCATION, Modelvictor::createBodyLayer);
	}
}
