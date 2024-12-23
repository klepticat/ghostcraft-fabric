package org.klepticat.ghostcraft.render.entity;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import org.klepticat.ghostcraft.entity.TotemEntity;

public class TotemEntityRenderer<T extends TotemEntity> extends EntityRenderer<T> {
    private EntityRenderDispatcher renderDispatcher;
    private ItemRenderer itemRenderer;

    public TotemEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.renderDispatcher = context.getRenderDispatcher();
        this.itemRenderer = context.getItemRenderer();
    }

    @Override
    public Identifier getTexture(T entity) {
        return SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE;
    }

    @Override
    public void render(T totemEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.push();
        matrixStack.translate(0.0f, 0.30f, 0.0f);
        matrixStack.multiply(RotationAxis.NEGATIVE_Y.rotation(((float) Math.PI)*(f+180.0f)/180.0f));
        matrixStack.multiply(RotationAxis.POSITIVE_X.rotation((float) Math.PI/2.0f));
        matrixStack.scale(0.5f, 0.5f, 0.5f);
        this.itemRenderer
                .renderItem(
                        totemEntity.getItemStack(),
                        ModelTransformationMode.FIXED,
                        i,
                        OverlayTexture.DEFAULT_UV,
                        matrixStack,
                        vertexConsumerProvider,
                        totemEntity.getWorld(),
                        totemEntity.getId()
                );
        matrixStack.pop();
    }
}
