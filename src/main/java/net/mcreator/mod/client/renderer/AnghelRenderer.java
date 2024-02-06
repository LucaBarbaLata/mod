
package net.mcreator.mod.client.renderer;

public class AnghelRenderer extends MobRenderer<AnghelEntity, Modelangheloasa<AnghelEntity>> {

	public AnghelRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelangheloasa(context.bakeLayer(Modelangheloasa.LAYER_LOCATION)), 1f);

	}

	@Override
	public ResourceLocation getTextureLocation(AnghelEntity entity) {
		return new ResourceLocation("mod:textures/entities/anghel.png");
	}

}
