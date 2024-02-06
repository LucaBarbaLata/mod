
package net.mcreator.mod.client.renderer;

public class VictorRenderer extends MobRenderer<VictorEntity, Modelvictor<VictorEntity>> {

	public VictorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelvictor(context.bakeLayer(Modelvictor.LAYER_LOCATION)), 0.4f);

	}

	@Override
	public ResourceLocation getTextureLocation(VictorEntity entity) {
		return new ResourceLocation("mod:textures/entities/victor.png");
	}

}
