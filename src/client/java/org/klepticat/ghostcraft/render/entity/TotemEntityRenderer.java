package org.klepticat.ghostcraft.render.entity;

import io.wispforest.owo.particles.ClientParticles;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Colors;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.ColorHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.joml.Vector3f;
import org.klepticat.ghostcraft.AllCardinalComponents;
import org.klepticat.ghostcraft.entity.TotemEntity;

public class TotemEntityRenderer<T extends TotemEntity> extends EntityRenderer<T> {
    private EntityRenderDispatcher renderDispatcher;
    private ItemRenderer itemRenderer;

    private float prevTickDelta = 0.0f;

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
    public void render(T totemEntity, float yaw, float tickDelta, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int light) {
        RegistryEntry<StatusEffect> statusEffect = totemEntity.getComponent(AllCardinalComponents.TOTEM_STATUS_EFFECT).getEffect();

        if (tickDelta < prevTickDelta) {
            double radius = totemEntity.currentRadius;
            int stepSize = 15;
            double maxRadius = totemEntity.getComponent(AllCardinalComponents.TOTEM_RADIUS).get();
            int particleColor = Colors.WHITE;

            if (statusEffect != null) particleColor = ColorHelper.Argb.withAlpha(255, statusEffect.value().getColor());

            Vec3d lastParticlePos = new Vec3d(totemEntity.getX() + radius, totemEntity.getY(), totemEntity.getZ());

            for (int angle = stepSize - 1; angle < 360; angle += stepSize) {
                double angleRadians = (2 * Math.PI) * angle / 360;

                Vec3d particlePos = new Vec3d((radius) * Math.cos(angleRadians) + totemEntity.getX(), totemEntity.getY(), (radius) * Math.sin(angleRadians) + totemEntity.getZ());

                if (maxRadius != 0.0) {
                    ClientParticles.setParticleCount(10);
                    ClientParticles.spawnLine(
                            new DustParticleEffect(new Vector3f(ColorHelper.Argb.getRed(particleColor) / 255.0f, ColorHelper.Argb.getGreen(particleColor) / 255.0f, ColorHelper.Argb.getBlue(particleColor) / 255.0f), (float) (totemEntity.currentRadius / maxRadius)),
                            totemEntity.getWorld(),
                            lastParticlePos,
                            particlePos,
                            0.0f
                    );
                }

                lastParticlePos = particlePos;
            }
        }

        totemEntity.setCustomName(Text.literal(Double.toString(totemEntity.currentRadius)));

        prevTickDelta = tickDelta;

        // render item
        matrixStack.push();

        matrixStack.translate(0.0f, 0.30f, 0.0f);
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

        if (statusEffect != null) {
            // draw status effect sprite(s?)
            matrixStack.push();

            matrixStack.multiply(RotationAxis.POSITIVE_Y.rotation((float) (0.5f * Math.PI - (Math.atan2(totemEntity.getZ() - dispatcher.camera.getPos().getZ(), totemEntity.getX() - dispatcher.camera.getPos().getX())))));

            MatrixStack.Entry stackEntry = matrixStack.peek();

            // POSITION, COLOR, TEXTURE, OVERLAY, LIGHT, NORMAL
            Sprite effectSprite = MinecraftClient.getInstance().getStatusEffectSpriteManager().getSprite(statusEffect);
            vertexConsumerProvider.getBuffer(RenderLayer.getEntityCutout(effectSprite.getAtlasId()))
                    .vertex(stackEntry.getPositionMatrix(), -0.5f, 4.0f, 0.0f)
                    .color(0xFFFFFFFF)
                    .texture(effectSprite.getMinU(), effectSprite.getMinV())
                    .overlay(OverlayTexture.DEFAULT_UV)
                    .light(light)
                    .normal(stackEntry, 0.0f, 1.0f, 0.0f)

                    .vertex(stackEntry.getPositionMatrix(), 0.5f, 4.0f, 0.0f)
                    .color(0xFFFFFFFF)
                    .texture(effectSprite.getMaxU(), effectSprite.getMinV())
                    .overlay(OverlayTexture.DEFAULT_UV)
                    .light(light)
                    .normal(stackEntry, 0.0f, 1.0f, 0.0f)

                    .vertex(stackEntry.getPositionMatrix(), 0.5f, 3.0f, 0.0f)
                    .color(0xFFFFFFFF)
                    .texture(effectSprite.getMaxU(), effectSprite.getMaxV())
                    .overlay(OverlayTexture.DEFAULT_UV)
                    .light(light)
                    .normal(stackEntry, 0.0f, 1.0f, 0.0f)

                    .vertex(stackEntry.getPositionMatrix(), -0.5f, 3.0f, 0.0f)
                    .color(0xFFFFFFFF)
                    .texture(effectSprite.getMinU(), effectSprite.getMaxV())
                    .overlay(OverlayTexture.DEFAULT_UV)
                    .light(light)
                    .normal(stackEntry, 0.0f, 1.0f, 0.0f);

            matrixStack.pop();
        }
    }
}
