
package net.mcreator.mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mod.entity.VictorEntity;
import net.mcreator.mod.client.model.Modelvictor;

public class VictorRenderer extends MobRenderer<VictorEntity, Modelvictor<VictorEntity>> {
	public VictorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelvictor(context.bakeLayer(Modelvictor.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(VictorEntity entity) {
		return new ResourceLocation("mod:textures/entities/victor.png");
	}
}
