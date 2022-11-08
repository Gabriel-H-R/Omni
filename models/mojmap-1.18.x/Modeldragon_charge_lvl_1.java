// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldragon_charge_lvl_1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "dragon_charge_lvl_1"), "main");
	private final ModelPart Charge;

	public Modeldragon_charge_lvl_1(ModelPart root) {
		this.Charge = root.getChild("Charge");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Charge = partdefinition.addOrReplaceChild("Charge", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 16.0F, 0.0F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition Body = Charge.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.6F, 0.0F, 24.2667F));

		PartDefinition CentralBody = Body.addOrReplaceChild("CentralBody",
				CubeListBuilder.create().texOffs(100, 116)
						.addBox(-10.6F, -6.0F, -22.2667F, 2.0F, 12.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(72, 66)
						.addBox(-6.6F, -10.0F, -22.2667F, 12.0F, 2.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.6F, -8.0F, -22.2667F, 16.0F, 16.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(0, 114)
						.addBox(7.4F, -6.0F, -22.2667F, 2.0F, 12.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(-6.6F, 8.0F, -22.2667F, 12.0F, 2.0F, 48.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -4.0F));

		PartDefinition CentralBody2 = Body.addOrReplaceChild("CentralBody2",
				CubeListBuilder.create().texOffs(100, 116)
						.addBox(-10.6F, -6.0F, -24.2667F, 2.0F, 12.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(72, 66)
						.addBox(-6.6F, -10.0F, -24.2667F, 12.0F, 2.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.6F, -8.0F, -24.2667F, 16.0F, 16.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(0, 114)
						.addBox(7.4F, -6.0F, -24.2667F, 2.0F, 12.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(-6.6F, 8.0F, -24.2667F, 12.0F, 2.0F, 48.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 46.0F));

		PartDefinition CentralBody3 = Body.addOrReplaceChild("CentralBody3",
				CubeListBuilder.create().texOffs(100, 116)
						.addBox(-10.6F, -6.0F, -34.2667F, 2.0F, 12.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(72, 66)
						.addBox(-6.6F, -10.0F, -34.2667F, 12.0F, 2.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.6F, -8.0F, -34.2667F, 16.0F, 16.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(0, 114)
						.addBox(7.4F, -6.0F, -34.2667F, 2.0F, 12.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(-6.6F, 8.0F, -34.2667F, 12.0F, 2.0F, 48.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 104.0F));

		PartDefinition CentralBody4 = Body.addOrReplaceChild("CentralBody4",
				CubeListBuilder.create().texOffs(100, 116)
						.addBox(-10.6F, -6.0F, -49.2667F, 2.0F, 12.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(72, 66)
						.addBox(-6.6F, -10.0F, -49.2667F, 12.0F, 2.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.6F, -8.0F, -49.2667F, 16.0F, 16.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(0, 114)
						.addBox(7.4F, -6.0F, -49.2667F, 2.0F, 12.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(-6.6F, 8.0F, -49.2667F, 12.0F, 2.0F, 48.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 167.0F));

		PartDefinition CentralBody5 = Body.addOrReplaceChild("CentralBody5",
				CubeListBuilder.create().texOffs(100, 116)
						.addBox(-10.6F, -6.0F, -58.2667F, 2.0F, 12.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(72, 66)
						.addBox(-6.6F, -10.0F, -58.2667F, 12.0F, 2.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.6F, -8.0F, -58.2667F, 16.0F, 16.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(0, 114)
						.addBox(7.4F, -6.0F, -58.2667F, 2.0F, 12.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(-6.6F, 8.0F, -58.2667F, 12.0F, 2.0F, 48.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 224.0F));

		PartDefinition VeticalFIre = Charge.addOrReplaceChild("VeticalFIre", CubeListBuilder.create(),
				PartPose.offset(0.0F, 8.0F, 26.0F));

		PartDefinition bone = VeticalFIre.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(140, 0).addBox(-15.0F, -29.5F, 0.0F, 30.0F, 30.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, -33.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition bone3 = VeticalFIre.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -7.0F, -33.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone3.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(140, 0).mirror()
						.addBox(-15.0F, -15.0F, 0.0F, 30.0F, 30.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 14.5F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition HorizontalFIre = Charge.addOrReplaceChild("HorizontalFIre", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition bone5 = HorizontalFIre.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone5.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(140, 0).mirror()
						.addBox(-15.0F, -30.0F, 0.0F, 30.0F, 30.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, -3.1416F));

		PartDefinition bone6 = HorizontalFIre.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone6
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(140, 0).addBox(-15.0F, -15.0F, 0.0F, 30.0F, 30.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 14.0F, 0.0F, 0.0F, 0.0F, 3.1416F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Charge.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Charge.yRot = ageInTicks;
	}
}