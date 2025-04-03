package org.klepticat.ghostcraft.render.entity.model;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import org.klepticat.ghostcraft.entity.RatEntity;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class RatEntityModel<T extends Entity> extends EntityModel<T> {
    public static final EntityModelLayer modelLayer = new EntityModelLayer(Identifier.of(MOD_ID, "rat"), "rat");

    private final ModelPart[] body = new ModelPart[7];
    private final ModelPart ear1;
    private final ModelPart ear2;
    private final ModelPart feet1;
    private final ModelPart feet2;
    private final ModelPart feet3;
    private final ModelPart feet4;

    public RatEntityModel(ModelPart root) {
        this.body[0] = root.getChild("body1");
        this.body[1] = root.getChild("body2");
        this.ear1 = this.body[1].getChild("ear1");
        this.ear2 = this.body[1].getChild("ear2");
        this.body[2] = root.getChild("body3");
        this.feet1 = this.body[2].getChild("feet1");
        this.feet2 = this.body[2].getChild("feet2");
        this.feet3 = this.body[2].getChild("feet3");
        this.feet4 = this.body[2].getChild("feet4");
        this.body[3] = root.getChild("body4");
        this.body[4] = root.getChild("body5");
        this.body[5] = root.getChild("body6");
        this.body[6] = root.getChild("body7");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData body1 = modelPartData.addChild("body1", ModelPartBuilder.create().uv(0, 0).cuboid(-1.5F, 0.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 32).cuboid(-1.5F, 0.0F, -1.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(60, 32).cuboid(-0.5F, -0.25F, -1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 22.0F, -7.0F));

        ModelPartData body2 = modelPartData.addChild("body2", ModelPartBuilder.create().uv(0, 4).cuboid(-2.0F, 0.0F, -1.0F, 4.0F, 3.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 36).cuboid(-2.0F, 0.0F, -1.0F, 4.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 21.0F, -5.0F));

        ModelPartData ear1 = body2.addChild("ear1", ModelPartBuilder.create().uv(51, 39).cuboid(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, 0.0F, 0.0F, 0.0579F, 0.2555F, 0.2256F));

        ModelPartData ear2 = body2.addChild("ear2", ModelPartBuilder.create().uv(56, 39).cuboid(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 0.0F, 0.0579F, -0.2555F, -0.2256F));

        ModelPartData body3 = modelPartData.addChild("body3", ModelPartBuilder.create().uv(34, 51).cuboid(-3.0F, 0.0F, -1.5F, 6.0F, 4.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 20.0F, -2.5F));

        ModelPartData feet1 = body3.addChild("feet1", ModelPartBuilder.create().uv(49, 45).cuboid(-1.5F, -0.075F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-3.5F, 4.05F, -1.0F, 0.0F, 0.4363F, 0.0F));

        ModelPartData feet2 = body3.addChild("feet2", ModelPartBuilder.create().uv(49, 45).cuboid(-1.5F, -0.075F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-3.5F, 4.05F, 6.0F, 0.0F, 0.7854F, 0.0F));

        ModelPartData feet3 = body3.addChild("feet3", ModelPartBuilder.create().uv(49, 42).cuboid(-1.5F, -0.075F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, 4.05F, 6.0F, 0.0F, -0.7854F, 0.0F));

        ModelPartData feet4 = body3.addChild("feet4", ModelPartBuilder.create().uv(49, 42).cuboid(-1.5F, -0.075F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, 4.05F, -1.0F, 0.0F, -0.4363F, 0.0F));

        ModelPartData body4 = modelPartData.addChild("body4", ModelPartBuilder.create().uv(1, 48).cuboid(-1.0F, 1.0F, 4.5F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 21.0F, 0.5F));

        ModelPartData body5 = modelPartData.addChild("body5", ModelPartBuilder.create().uv(0, 54).cuboid(-1.0F, 0.0F, 4.5F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 22.0F, 3.5F));

        ModelPartData body6 = modelPartData.addChild("body6", ModelPartBuilder.create().uv(11, 32).cuboid(-1.0F, 0.0F, 5.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 23.0F, 6.0F));

        ModelPartData body7 = modelPartData.addChild("body7", ModelPartBuilder.create().uv(13, 36).cuboid(-0.5F, 0.0F, 5.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 23.0F, 8.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        for (ModelPart modelPart : this.body) {
            modelPart.render(matrices, vertexConsumer, light, overlay, color);
        }
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        for (int i = 0; i < this.body.length; i++) {
            this.body[i].yaw = MathHelper.cos(animationProgress * 0.9F + (float) i * 0.15F * (float) Math.PI) * (float) Math.PI * 0.05F * (float) (1 + Math.abs(i - 2));
            this.body[i].pivotX = MathHelper.sin(animationProgress * 0.9F + (float) i * 0.15F * (float) Math.PI) * (float) Math.PI * 0.2F * (float) Math.abs(i - 2);
        }

//		this.scales[0].yaw = this.body[2].yaw;
//		this.scales[1].yaw = this.body[4].yaw;
//		this.scales[1].pivotX = this.body[4].pivotX;
//		this.scales[2].yaw = this.body[1].yaw;
//		this.scales[2].pivotX = this.body[1].pivotX;
    }
}