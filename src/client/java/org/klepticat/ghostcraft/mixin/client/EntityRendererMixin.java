package org.klepticat.ghostcraft.mixin.client;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
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
import net.minecraft.util.Colors;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.ColorHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Vector3f;
import org.klepticat.ghostcraft.AllCardinalComponents;
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

    private static Vector3f FORWARD_SHIFT = new Vector3f(0.0f, 0.0f, 0.03f);

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
                matrices.translate(vec3d.x, vec3d.y + 0.5f, vec3d.z);
                matrices.multiply(getDispatcher().getRotation());
                matrices.scale(0.025F, -0.025F, 0.025F);

                drawHeartContainer(playerEntity, matrices, vertexConsumerProvider, light, thisRenderer.getTextRenderer(), text);

                Sprite effectBackground = MinecraftClient.getInstance().getGuiAtlasManager().getSprite(Identifier.ofVanilla("hud/effect_background"));

                for (StatusEffectInstance effect : statusEffectList.values()) {
                    if (effect.getDuration() <= 0 && !effect.isInfinite()) continue;

                    float w = 7.0f;
                    float h = 7.0f;
                    float offset = 2.0f;

                    matrices.push();
                    matrices.translate((-thisRenderer.getTextRenderer().getWidth(text) / 2.0f) + ((w + offset) * index) - 1.0f, -(h + offset) - 1.0f, 0.0f);

                    Sprite effectSprite = MinecraftClient.getInstance().getStatusEffectSpriteManager().getSprite(effect.getEffectType());

                    MatrixStack.Entry stackEntry = matrices.peek();

                    vertexConsumerProvider.getBuffer(RenderLayer.getText(effectBackground.getAtlasId()))
                            .vertex(stackEntry.getPositionMatrix(), 0.0f, h, 0.0f)
                            .color(0xFFFFFFFF)
                            .texture(effectBackground.getMaxU(), effectBackground.getMaxV())
                            .light(light)

                            .vertex(stackEntry.getPositionMatrix(), w, h, 0.0f)
                            .color(0xFFFFFFFF)
                            .texture(effectBackground.getMinU(), effectBackground.getMaxV())
                            .light(light)

                            .vertex(stackEntry.getPositionMatrix(), w, 0.0f, 0.0f)
                            .color(0xFFFFFFFF)
                            .texture(effectBackground.getMinU(), effectBackground.getMinV())
                            .light(light)

                            .vertex(stackEntry.getPositionMatrix(), 0.0f, 0.0f, 0.0f)
                            .color(0xFFFFFFFF)
                            .texture(effectBackground.getMaxU(), effectBackground.getMinV())
                            .light(light);

                    matrices.push();
                    matrices.translate(FORWARD_SHIFT.x, FORWARD_SHIFT.y, FORWARD_SHIFT.z);

                    stackEntry = matrices.peek();

                    float offX = w * 0.125f;
                    float offY = h * 0.125f;

                    vertexConsumerProvider.getBuffer(RenderLayer.getText(effectSprite.getAtlasId()))
                            .vertex(stackEntry.getPositionMatrix(), offX, h * 0.75f + offY, 0.0f)
                            .color(0xFFFFFFFF)
                            .texture(effectSprite.getMaxU(), effectSprite.getMaxV())
                            .light(light)

                            .vertex(stackEntry.getPositionMatrix(), w * 0.75f + offX, h * 0.75f + offY, 0.0f)
                            .color(0xFFFFFFFF)
                            .texture(effectSprite.getMinU(), effectSprite.getMaxV())
                            .light(light)

                            .vertex(stackEntry.getPositionMatrix(), w * 0.75f + offX, offY, 0.0f)
                            .color(0xFFFFFFFF)
                            .texture(effectSprite.getMinU(), effectSprite.getMinV())
                            .light(light)

                            .vertex(stackEntry.getPositionMatrix(), offX, offY, 0.0f)
                            .color(0xFFFFFFFF)
                            .texture(effectSprite.getMaxU(), effectSprite.getMinV())
                            .light(light);

                    index++;

                    matrices.pop();
                    matrices.pop();
                }

                matrices.pop();
            }
        }
    }

    static private void drawHeartContainer(PlayerEntity entity, MatrixStack matrixStack, VertexConsumerProvider provider, int light, TextRenderer textRenderer, Text labelText) {
        matrixStack.push();

        Text health = Text.literal(Integer.toString(Math.round(entity.getHealth())));
        Text souls = Text.literal(Integer.toString(entity.getComponent(AllCardinalComponents.PLAYER_SOULS).get()));

        float y = 0.0f;
        float healthX = (-textRenderer.getWidth(health)) - textRenderer.getWidth(labelText) / 2.0f - 2.0f;
        float soulsX = textRenderer.getWidth(labelText) / 2.0f + 3.0f;

//        textRenderer.draw(health, healthX - 1, y, Colors.BLACK, false, matrixStack.peek().getPositionMatrix(), provider, TextRenderer.TextLayerType.NORMAL, 0, light);
//        textRenderer.draw(health, healthX + 1, y, Colors.BLACK, false, matrixStack.peek().getPositionMatrix(), provider, TextRenderer.TextLayerType.NORMAL, 0, light);
//        textRenderer.draw(health, healthX,  y + 1, Colors.BLACK, false, matrixStack.peek().getPositionMatrix(), provider, TextRenderer.TextLayerType.NORMAL, 0, light);
//        textRenderer.draw(health, healthX, y - 1, Colors.BLACK, false, matrixStack.peek().getPositionMatrix(), provider, TextRenderer.TextLayerType.NORMAL, 0, light);

//        textRenderer.draw(souls, 1 + soulsX, y, Colors.BLACK, false, matrixStack.peek().getPositionMatrix(), provider, TextRenderer.TextLayerType.NORMAL, 0, light);
//        textRenderer.draw(souls, 1 + soulsX, y, Colors.BLACK, false, matrixStack.peek().getPositionMatrix(), provider, TextRenderer.TextLayerType.NORMAL, 0, light);
//        textRenderer.draw(souls, soulsX, y + 1, Colors.BLACK, false, matrixStack.peek().getPositionMatrix(), provider, TextRenderer.TextLayerType.NORMAL, 0, light);
//        textRenderer.draw(souls, soulsX, y - 1, Colors.BLACK, false, matrixStack.peek().getPositionMatrix(), provider, TextRenderer.TextLayerType.NORMAL, 0, light);

        matrixStack.translate(FORWARD_SHIFT.x, FORWARD_SHIFT.y, FORWARD_SHIFT.z);

        textRenderer.drawWithOutline(health.asOrderedText(), healthX, y, Colors.RED, Colors.BLACK, matrixStack.peek().getPositionMatrix(), provider, light);
        textRenderer.drawWithOutline(souls.asOrderedText(), soulsX, y, ColorHelper.Argb.fromFloats(1.0f, 0.0f, 0.66f, 0.66f), Colors.BLACK, matrixStack.peek().getPositionMatrix(), provider, light);

        matrixStack.pop();
    }
}
