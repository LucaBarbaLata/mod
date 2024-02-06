
package net.mcreator.mod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mod.entity.IlieEntity;
import net.mcreator.mod.client.model.ModelIlie;

public class IlieRenderer extends MobRenderer<IlieEntity, ModelIlie<IlieEntity>> {
	public IlieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelIlie(context.bakeLayer(ModelIlie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(IlieEntity entity) {
		return new ResourceLocation("mod:textures/entities/texture.png");
	}
}
