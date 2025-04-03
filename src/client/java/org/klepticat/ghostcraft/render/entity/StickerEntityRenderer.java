package org.klepticat.ghostcraft.render.entity;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import org.jetbrains.annotations.NotNull;
import org.klepticat.ghostcraft.entity.stickers.StickerEntity;

public class StickerEntityRenderer<T extends StickerEntity> extends EntityRenderer<T> {
    public StickerEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
    }

    @Override
    public Identifier getTexture(@NotNull StickerEntity entity) {
        return entity.getSticker().getTexture();
    }

    @Override
    public void render(T stickerEntity, float yaw, float tickDelta, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int light) {
        matrixStack.push();

        MatrixStack.Entry stackEntry = matrixStack.peek();

        matrixStack.translate(0.0f, 0.5f, 0.0f);

        matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(stickerEntity.getPitch()));
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180.0F - stickerEntity.getYaw()));

        matrixStack.translate(0.0f, 0.0f, -0.01f);

        // POSITION, COLOR, TEXTURE, OVERLAY, LIGHT, NORMAL
        vertexConsumerProvider.getBuffer(RenderLayer.getEntityCutout(getTexture(stickerEntity)))
                .vertex(stackEntry.getPositionMatrix(), -0.5f, 0.5f, 0.0f)
                .color(0xFFFFFFFF)
                .texture(1, 0)
                .overlay(OverlayTexture.DEFAULT_UV)
                .light(light)
                .normal(stackEntry, 0.0f, 1.0f, 0.0f)

                .vertex(stackEntry.getPositionMatrix(), 0.5f, 0.5f, 0.0f)
                .color(0xFFFFFFFF)
                .texture(0, 0)
                .overlay(OverlayTexture.DEFAULT_UV)
                .light(light)
                .normal(stackEntry, 0.0f, 1.0f, 0.0f)

                .vertex(stackEntry.getPositionMatrix(), 0.5f, -0.5f, 0.0f)
                .color(0xFFFFFFFF)
                .texture(0, 1)
                .overlay(OverlayTexture.DEFAULT_UV)
                .light(light)
                .normal(stackEntry, 0.0f, 1.0f, 0.0f)

                .vertex(stackEntry.getPositionMatrix(), -0.5f, -0.5f, 0.0f)
                .color(0xFFFFFFFF)
                .texture(1, 1)
                .overlay(OverlayTexture.DEFAULT_UV)
                .light(light)
                .normal(stackEntry, 0.0f, 1.0f, 0.0f);

        matrixStack.pop();
    }
}
