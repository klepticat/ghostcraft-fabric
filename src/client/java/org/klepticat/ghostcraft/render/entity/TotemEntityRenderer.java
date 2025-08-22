package org.klepticat.ghostcraft.render.entity;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import org.klepticat.ghostcraft.entity.TotemEntity;

public class TotemEntityRenderer<T extends TotemEntity> extends EntityRenderer<T> {
    private final ItemRenderer itemRenderer;

    public TotemEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.itemRenderer = context.getItemRenderer();
    }

    @Override
    public Identifier getTexture(T entity) {
        return SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE;
    }

    @Override
    public void render(T totemEntity, float yaw, float tickDelta, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int light) {
        totemEntity.setCustomName(Text.literal(Double.toString(totemEntity.currentRadius)));

        // render item
        matrixStack.push();

        matrixStack.translate(0.0f, 0.0f, 0.0f);
        matrixStack.multiply(RotationAxis.NEGATIVE_Y.rotation(((float) Math.PI) * (yaw + 180.0f) / 180.0f));
        matrixStack.multiply(RotationAxis.POSITIVE_X.rotation((float) Math.PI / 2.0f));
        matrixStack.scale(0.5f, 0.5f, 0.5f);

        this.itemRenderer
                .renderItem(
                        totemEntity.getItemStack(),
                        ModelTransformationMode.FIXED,
                        light,
                        OverlayTexture.DEFAULT_UV,
                        matrixStack,
                        vertexConsumerProvider,
                        totemEntity.getWorld(),
                        totemEntity.getId()
                );

        matrixStack.pop();

//        RegistryEntry<StatusEffect> statusEffect = totemEntity.getComponent(GCCardinalComponents.TOTEM_DATA).getEffect();

//        if (statusEffect != null) {
//            // draw status effect sprite(s?)
//            matrixStack.push();
//
//            matrixStack.multiply(RotationAxis.POSITIVE_Y.rotation((float) (0.5f * Math.PI - (Math.atan2(totemEntity.getZ() - dispatcher.camera.getPos().getZ(), totemEntity.getX() - dispatcher.camera.getPos().getX())))));
//
//            MatrixStack.Entry stackEntry = matrixStack.peek();
//
//            // POSITION, COLOR, TEXTURE, OVERLAY, LIGHT, NORMAL
//            Sprite effectSprite = MinecraftClient.getInstance().getStatusEffectSpriteManager().getSprite(statusEffect);
//            vertexConsumerProvider.getBuffer(RenderLayer.getEntityCutout(effectSprite.getAtlasId()))
//                    .vertex(stackEntry.getPositionMatrix(), -0.5f, 4.0f, 0.0f)
//                    .color(0xFFFFFFFF)
//                    .texture(effectSprite.getMaxU(), effectSprite.getMinV())
//                    .overlay(OverlayTexture.DEFAULT_UV)
//                    .light(light)
//                    .normal(stackEntry, 0.0f, 1.0f, 0.0f)
//
//                    .vertex(stackEntry.getPositionMatrix(), 0.5f, 4.0f, 0.0f)
//                    .color(0xFFFFFFFF)
//                    .texture(effectSprite.getMinU(), effectSprite.getMinV())
//                    .overlay(OverlayTexture.DEFAULT_UV)
//                    .light(light)
//                    .normal(stackEntry, 0.0f, 1.0f, 0.0f)
//
//                    .vertex(stackEntry.getPositionMatrix(), 0.5f, 3.0f, 0.0f)
//                    .color(0xFFFFFFFF)
//                    .texture(effectSprite.getMinU(), effectSprite.getMaxV())
//                    .overlay(OverlayTexture.DEFAULT_UV)
//                    .light(light)
//                    .normal(stackEntry, 0.0f, 1.0f, 0.0f)
//
//                    .vertex(stackEntry.getPositionMatrix(), -0.5f, 3.0f, 0.0f)
//                    .color(0xFFFFFFFF)
//                    .texture(effectSprite.getMaxU(), effectSprite.getMaxV())
//                    .overlay(OverlayTexture.DEFAULT_UV)
//                    .light(light)
//                    .normal(stackEntry, 0.0f, 1.0f, 0.0f);
//
//            matrixStack.pop();
//        }
    }
}
