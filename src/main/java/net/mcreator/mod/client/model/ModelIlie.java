package net.mcreator.mod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelIlie<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("mod", "model_ilie"), "main");
	public final ModelPart PD;
	public final ModelPart MD;
	public final ModelPart MS;
	public final ModelPart PS;
	public final ModelPart TORSTO;
	public final ModelPart CAP;

	public ModelIlie(ModelPart root) {
		this.PD = root.getChild("PD");
		this.MD = root.getChild("MD");
		this.MS = root.getChild("MS");
		this.PS = root.getChild("PS");
		this.TORSTO = root.getChild("TORSTO");
		this.CAP = root.getChild("CAP");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition PD = partdefinition.addOrReplaceChild("PD",
				CubeListBuilder.create().texOffs(0, 38).addBox(-3.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 24).addBox(-3.0F, -20.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition MD = partdefinition.addOrReplaceChild("MD",
				CubeListBuilder.create().texOffs(32, 12).addBox(-6.0F, -37.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 0).addBox(-6.0F, -27.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition MS = partdefinition.addOrReplaceChild("MS",
				CubeListBuilder.create().texOffs(24, 28).addBox(4.0F, -37.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 16).addBox(4.0F, -27.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition PS = partdefinition.addOrReplaceChild("PS",
				CubeListBuilder.create().texOffs(8, 38).addBox(1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 36).addBox(1.0F, -20.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition TORSTO = partdefinition.addOrReplaceChild("TORSTO", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -38.0F, -2.0F, 8.0F, 18.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition CAP = partdefinition.addOrReplaceChild("CAP", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -46.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		PD.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		MD.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		MS.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		PS.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		TORSTO.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		CAP.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.PS.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.CAP.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.CAP.xRot = headPitch / (180F / (float) Math.PI);
		this.PD.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.MS.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.MD.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
