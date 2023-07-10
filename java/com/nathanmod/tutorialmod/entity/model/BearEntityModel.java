package com.nathanmod.tutorialmod.entity.model;// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.nathanmod.tutorialmod.entity.custom.BearEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class BearEntityModel <T extends BearEntity> extends EntityModel<T> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer bone2;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r4;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightLeg;
	private final ModelRenderer backRightLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer backLeftLeg;

	public BearEntityModel() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);

		body = new ModelRenderer(this);


		rightLeg = new ModelRenderer(this);


		leftLeg = new ModelRenderer(this);


		backLeftLeg = new ModelRenderer(this);


		backRightLeg = new ModelRenderer(this);


		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, 15).addBox(-6.0F, -5.0F, -4.0F, 13.0F, 2.0F, 12.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0436F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(4.0F, -4.0F, -6.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.5708F, -1.5272F, -1.5708F);
		cube_r2.setTextureOffset(0, 15).addBox(-6.0F, -4.0F, 3.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 2.0F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 1.5708F, 0.0F);
		cube_r3.setTextureOffset(0, 29).addBox(-6.0F, -3.0F, 4.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone2);
		bone2.setTextureOffset(0, 0).addBox(-6.0F, -10.0F, -4.0F, 13.0F, 3.0F, 12.0F, 0.0F, false);
		bone2.setTextureOffset(0, 29).addBox(-6.0F, -7.0F, -4.0F, 13.0F, 2.0F, 12.0F, 0.0F, false);
		bone2.setTextureOffset(0, 35).addBox(-6.0F, -3.0F, 5.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);


		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 3.1416F, 0.0F);
		cube_r4.setTextureOffset(38, 0).addBox(-2.0F, -9.0F, 4.0F, 5.0F, 4.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
		this.head.rotateAngleX = headPitch * ((float) Math.PI / 180F);
		this.head.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);
		this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F * (float) Math.PI) * 1.4F * limbSwingAmount;
		this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F * (float) Math.PI) * 1.4F * limbSwingAmount;
		this.backRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F * (float) Math.PI) * 1.4F * limbSwingAmount;
		this.backLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F * (float) Math.PI) * 1.4F * limbSwingAmount;
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}