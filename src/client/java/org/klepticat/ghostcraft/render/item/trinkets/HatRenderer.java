package org.klepticat.ghostcraft.render.item.trinkets;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.client.TrinketRenderer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.ModelWithHead;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.RotationAxis;

public class HatRenderer implements TrinketRenderer {
    @Override
    public void render(ItemStack stack, SlotReference slotReference, EntityModel<? extends LivingEntity> contextModel, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, LivingEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        matrices.push();

        if(contextModel instanceof ModelWithHead) {
            ((ModelWithHead) contextModel).getHead().rotate(matrices);

            matrices.translate(0.0F, -0.25F, 0.0F);

            if(!entity.getEquippedStack(EquipmentSlot.HEAD).isEmpty()) {
                matrices.translate(0.0f, -0.125f, 0.0f);
            }

            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180.0F));
            matrices.scale(0.625F, -0.625F, -0.625F);

            itemRenderer.renderItem(entity, stack, ModelTransformationMode.HEAD, false, matrices, vertexConsumers, null, light, 0, 0);
        }

        matrices.pop();

//        TrinketRenderer.translateToFace(matrices, ((PlayerEntityModel) contextModel), (AbstractClientPlayerEntity) entity, headYaw, headPitch);
//        matrices.scale(0.65f, 0.65f, 0.65f);
//        matrices.translate(0.0f, 0.0f, 0.5f);
//        matrices.multiply(new Quaternionf(new AxisAngle4d(Math.PI, 1.0, 0.0, 0.0)));
//        matrices.multiply(new Quaternionf(new AxisAngle4d(Math.PI, 0.0, 1.0, 0.0)));
//        itemRenderer.renderItem(stack, ModelTransformationMode.HEAD, light, 1, matrices, vertexConsumers, null, 0);
    }
}
