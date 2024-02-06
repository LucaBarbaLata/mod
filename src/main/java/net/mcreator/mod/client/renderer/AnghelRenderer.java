
package net.mcreator.mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mod.entity.AnghelEntity;
import net.mcreator.mod.client.model.Modelangheloasa;

public class AnghelRenderer extends MobRenderer<AnghelEntity, Modelangheloasa<AnghelEntity>> {
	public AnghelRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelangheloasa(context.bakeLayer(Modelangheloasa.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(AnghelEntity entity) {
		return new ResourceLocation("mod:textures/entities/anghel.png");
	}
}
