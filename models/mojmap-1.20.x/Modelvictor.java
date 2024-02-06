// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelvictor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "victor"), "main");
	private final ModelPart ps;
	private final ModelPart pd;
	private final ModelPart ms;
	private final ModelPart md;
	private final ModelPart t;
	private final ModelPart c;

	public Modelvictor(ModelPart root) {
		this.ps = root.getChild("ps");
		this.pd = root.getChild("pd");
		this.ms = root.getChild("ms");
		this.md = root.getChild("md");
		this.t = root.getChild("t");
		this.c = root.getChild("c");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition ps = partdefinition.addOrReplaceChild("ps", CubeListBuilder.create().texOffs(0, 12).addBox(0.0F,
				-1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition pd = partdefinition.addOrReplaceChild("pd", CubeListBuilder.create().texOffs(11, 11).addBox(
				-2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition ms = partdefinition.addOrReplaceChild("ms", CubeListBuilder.create().texOffs(9, 6).addBox(1.0F,
				-4.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition md = partdefinition.addOrReplaceChild("md", CubeListBuilder.create().texOffs(9, 0).addBox(-3.0F,
				-4.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition t = partdefinition.addOrReplaceChild("t", CubeListBuilder.create().texOffs(0, 6).addBox(-2.0F,
				-4.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition c = partdefinition.addOrReplaceChild("c", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F,
				-7.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		ps.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pd.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		md.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		t.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		c.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.ps.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.c.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.c.xRot = headPitch / (180F / (float) Math.PI);
		this.pd.zRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.t.yRot = headPitch / (180F / (float) Math.PI);
		this.ms.zRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.md.xRot = headPitch / (180F / (float) Math.PI);
	}
}