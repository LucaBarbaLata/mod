// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelangheloasa<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "angheloasa"), "main");
	private final ModelPart t;
	private final ModelPart pd;
	private final ModelPart ps;
	private final ModelPart c;
	private final ModelPart md;
	private final ModelPart ms;

	public Modelangheloasa(ModelPart root) {
		this.t = root.getChild("t");
		this.pd = root.getChild("pd");
		this.ps = root.getChild("ps");
		this.c = root.getChild("c");
		this.md = root.getChild("md");
		this.ms = root.getChild("ms");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition t = partdefinition.addOrReplaceChild("t",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-8.0F, -23.0F, -8.0F, 16.0F, 18.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(-2, -2)
						.addBox(-6.0F, -21.0F, -11.0F, 12.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition pd = partdefinition.addOrReplaceChild("pd", CubeListBuilder.create().texOffs(28, 34).addBox(
				-6.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition ps = partdefinition.addOrReplaceChild("ps", CubeListBuilder.create().texOffs(0, 34).addBox(4.0F,
				-5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition c = partdefinition.addOrReplaceChild("c", CubeListBuilder.create().texOffs(0, 34).addBox(-5.0F,
				-29.0F, -7.0F, 9.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition md = partdefinition.addOrReplaceChild("md", CubeListBuilder.create().texOffs(38, 34)
				.addBox(-11.0F, -19.0F, -2.0F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition ms = partdefinition.addOrReplaceChild("ms", CubeListBuilder.create().texOffs(0, 0).addBox(8.0F,
				-19.0F, -2.0F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		t.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pd.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ps.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		c.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		md.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.ps.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.c.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.c.xRot = headPitch / (180F / (float) Math.PI);
		this.pd.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.ms.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.md.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}