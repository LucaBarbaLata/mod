package net.mcreator.mod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mod.entity.SubstanaRozEntity;

public class SubstanaRozModel extends GeoModel<SubstanaRozEntity> {
	@Override
	public ResourceLocation getAnimationResource(SubstanaRozEntity entity) {
		return new ResourceLocation("mod", "animations/model.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SubstanaRozEntity entity) {
		return new ResourceLocation("mod", "geo/model.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SubstanaRozEntity entity) {
		return new ResourceLocation("mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
