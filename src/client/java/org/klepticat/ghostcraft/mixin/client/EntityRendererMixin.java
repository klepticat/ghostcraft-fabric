package org.klepticat.ghostcraft.mixin.client;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAttachmentType;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtList;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import org.joml.AxisAngle4f;
import org.joml.Quaternionf;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(EntityRenderer.class)
public abstract class EntityRendererMixin {
    @Accessor("dispatcher")
    abstract EntityRenderDispatcher getDispatcher();

    @Inject(method = "Lnet/minecraft/client/render/entity/EntityRenderer;renderLabelIfPresent(Lnet/minecraft/entity/Entity;Lnet/minecraft/text/Text;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;IF)V", at = @At("HEAD"))
    protected void renderLabelIfPresent(
            Entity entity,
            Text text,
            MatrixStack matrices,
            VertexConsumerProvider vertexConsumerProvider,
            int light,
            float tickDelta,
            CallbackInfo callbackInfo
    ) {
        if (entity.isPlayer()) {
            PlayerEntity playerEntity = (PlayerEntity) entity;
            EntityRenderer thisRenderer = (EntityRenderer) ((Object) this);

            MinecraftClient.getInstance().getNetworkHandler().getDataQueryHandler().queryEntityNbt(entity.getId(), nbtCompound -> {
                NbtList effectList = nbtCompound.getList("active_effects", NbtElement.COMPOUND_TYPE);

                int index = 0;

                for (NbtElement effect : effectList) {
                    RegistryEntry<StatusEffect> statusEffectRegistryEntry = Registries.STATUS_EFFECT.getEntry(Identifier.of(((NbtCompound) effect).getString("id"))).get();
                    playerEntity.setStatusEffect(new StatusEffectInstance(statusEffectRegistryEntry, ((NbtCompound) effect).getInt("duration"), ((NbtCompound) effect).getInt("amplifier")), playerEntity);
                }
            });

            Map<RegistryEntry<StatusEffect>, StatusEffectInstance> statusEffectList = playerEntity.getActiveStatusEffects();

            int index = 0;

            Vec3d vec3d = entity.getAttachments().getPointNullable(EntityAttachmentType.NAME_TAG, 0, entity.getYaw(tickDelta));

            if (vec3d != null) {
                matrices.push();
                matrices.translate(vec3d.x, vec3d.y + 0.5, vec3d.z);
                matrices.multiply(getDispatcher().getRotation());
                matrices.multiply(new Quaternionf(new AxisAngle4f((float) Math.toRadians(180), 0.0f, 1.0f, 0.0f)));
                matrices.scale(1.0f, 1.0f, -1.0f);

                for (StatusEffectInstance effect : statusEffectList.values()) {
                    if (effect.getDuration() <= 0 && !effect.isInfinite()) continue;

                    matrices.push();
                    matrices.translate((thisRenderer.getTextRenderer().getWidth(text) / 100.0f) - index * 0.2f, 0.15f, 0.0f);

                    Sprite effectSprite = MinecraftClient.getInstance().getStatusEffectSpriteManager().getSprite(effect.getEffectType());

                    MatrixStack.Entry stackEntry = matrices.peek();

                    vertexConsumerProvider.getBuffer(RenderLayer.getEntityCutout(effectSprite.getAtlasId()))
                            .vertex(stackEntry.getPositionMatrix(), -0.1f, 0.1f, 0.0f)
                            .color(0xFFFFFFFF)
                            .texture(effectSprite.getMinU(), effectSprite.getMinV())
                            .overlay(OverlayTexture.DEFAULT_UV)
                            .light(light)
                            .normal(stackEntry, 0.0f, 1.0f, 0.0f)

                            .vertex(stackEntry.getPositionMatrix(), 0.1f, 0.1f, 0.0f)
                            .color(0xFFFFFFFF)
                            .texture(effectSprite.getMaxU(), effectSprite.getMinV())
                            .overlay(OverlayTexture.DEFAULT_UV)
                            .light(light)
                            .normal(stackEntry, 0.0f, 1.0f, 0.0f)

                            .vertex(stackEntry.getPositionMatrix(), 0.1f, -0.1f, 0.0f)
                            .color(0xFFFFFFFF)
                            .texture(effectSprite.getMaxU(), effectSprite.getMaxV())
                            .overlay(OverlayTexture.DEFAULT_UV)
                            .light(light)
                            .normal(stackEntry, 0.0f, 1.0f, 0.0f)

                            .vertex(stackEntry.getPositionMatrix(), -0.1f, -0.1f, 0.0f)
                            .color(0xFFFFFFFF)
                            .texture(effectSprite.getMinU(), effectSprite.getMaxV())
                            .overlay(OverlayTexture.DEFAULT_UV)
                            .light(light)
                            .normal(stackEntry, 0.0f, 1.0f, 0.0f);

                    index++;

                    matrices.pop();
                }

                matrices.pop();
            }
        }
    }
}
