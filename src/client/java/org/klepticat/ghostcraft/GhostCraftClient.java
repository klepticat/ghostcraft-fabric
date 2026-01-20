package org.klepticat.ghostcraft;

import dev.emi.trinkets.api.client.TrinketRendererRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.entity.ArmorStandEntityRenderer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FishingRodItem;
import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.block.BlockType;
import org.klepticat.ghostcraft.entity.GCPlayerEntityStickers;
import org.klepticat.ghostcraft.render.WeehEntityRenderer;
import org.klepticat.ghostcraft.render.entity.*;
import org.klepticat.ghostcraft.render.entity.feature.ExtendedElytraFeatureRenderer;
import org.klepticat.ghostcraft.render.entity.model.RatEntityModel;
import org.klepticat.ghostcraft.render.item.trinkets.HatRenderer;

import static org.klepticat.ghostcraft.GCBlocks.*;
import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class GhostCraftClient implements ClientModInitializer {
    private static void onHudRender(DrawContext drawContext, RenderTickCounter renderTickCounter) {
        GCPlayerEntityStickers player = ((GCPlayerEntityStickers) MinecraftClient.getInstance().player);

        assert player != null;
        if (player.hasStickerSelected()) {
            MatrixStack matrixStack = drawContext.getMatrices();

            Identifier texture = Identifier.of(MOD_ID, "textures/gui/sticker_hud.png");

            matrixStack.push();

            matrixStack.translate(((float) drawContext.getScaledWindowWidth() / 2), ((float) drawContext.getScaledWindowHeight() / 2), 0);
            matrixStack.scale(0.5f, 0.5f, 1.0f);

            drawContext.drawTexture(texture, 12, 3, 0, 14, 73, 13, 73, 27);
            drawContext.drawTexture(texture, 12, -15, 0, 0, 73, 13, 73, 27);

            matrixStack.pop();
        }
    }

    @Override
    public void onInitializeClient() {
        GCKeyBindings.initialize();

        EntityRendererRegistry.register(GCEntityTypes.SPELL_PROJECTILE, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(GCEntityTypes.TOTEM, TotemEntityRenderer::new);
        EntityRendererRegistry.register(GCEntityTypes.STICKER, StickerEntityRenderer::new);

        EntityRendererRegistry.register(GCEntityTypes.EYE_BAT, EyeBatEntityRenderer::new);
        EntityRendererRegistry.register(GCEntityTypes.SKY_WEH, SkyWehEntityRenderer::new);
        EntityRendererRegistry.register(GCEntityTypes.WEHZE, WehzeEntityRenderer::new);
        EntityRendererRegistry.register(GCEntityTypes.PUMKEN, PumkenEntityRenderer::new);
        EntityRendererRegistry.register(GCEntityTypes.RAT, RatEntityRenderer::new);
        EntityRendererRegistry.register(GCEntityTypes.LAVA_RAT, LavaRatEntityRenderer::new);
        EntityRendererRegistry.register(GCEntityTypes.WEEH, WeehEntityRenderer::new);
        EntityRendererRegistry.register(GCEntityTypes.TRANSPORTWEHTION, context -> new TransportwehtionEntityRenderer(context, EntityModelLayers.CAMEL));

        EntityModelLayerRegistry.registerModelLayer(RatEntityModel.modelLayer, RatEntityModel::getTexturedModelData);

        GCItems.ROD_SET.forEach(rodItem -> {
            ModelPredicateProviderRegistry.register(rodItem, Identifier.ofVanilla("cast"), (stack, world, entity, seed) -> {
                if (entity == null) {
                    return 0.0F;
                } else {
                    boolean bl = entity.getMainHandStack() == stack;
                    boolean bl2 = entity.getOffHandStack() == stack;
                    if (entity.getMainHandStack().getItem() instanceof FishingRodItem) {
                        bl2 = false;
                    }

                    return (bl || bl2) && entity instanceof PlayerEntity && ((PlayerEntity) entity).fishHook != null ? 1.0F : 0.0F;
                }
            });
        });

        LivingEntityFeatureRendererRegistrationCallback.EVENT.register((entityType, entityRenderer, registrationHelper, context) -> {
            if (entityRenderer instanceof PlayerEntityRenderer) {
                registrationHelper.register(new ExtendedElytraFeatureRenderer<>(entityRenderer, context.getModelLoader()));
            } else if (entityRenderer instanceof ArmorStandEntityRenderer) {
                registrationHelper.register(new ExtendedElytraFeatureRenderer<>(entityRenderer, context.getModelLoader()));
            }
        });

        HudRenderCallback.EVENT.register(GhostCraftClient::onHudRender);

        TrinketRendererRegistry.registerRenderer(GCItems.ARACHNOPHOBIA_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.BEARD_MASK, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.BLACK_MAGE_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.BLACK_RAM_HORNS_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.BLEEDING_HELM_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.BLIZZARD_MAGE_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.CANDLE_KEEPER_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.CELESTIAL_BAND_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.CELESTIAL_HOOD_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.CHIEFTAIN_HELM_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.DARK_HOOD_SHORT_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.DEATHS_HAND_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.DEER_ANTLERS_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.DETECTIVE_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.DEVILS_COWL_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.DEVILS_CROWN_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.DRAKE_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.DREAMERS_CREST_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.DRUID_ANTLERS_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.DWARVEN_HELM_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.EMERALD_BASTION_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.FANCY_BOI_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.FANCY_FEATHER_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.FELDIR_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.FERN_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.FIVE_BILLION_LIKES_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.FLAMBOYANT_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.FOX_CAP_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.FOX_MASK, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.GLADIATOR_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.HO_HO_HO_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.ICE_QUEEN_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.JACK_O_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.JESTER_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.JINGLE_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.KNIGHTS_HELM_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.KOBOLD_MASK, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.LENNY_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.LIL_SQUIRT_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.ORC_CROWN_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.POWER_TRIP_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.PURPLE_FLORAL_CROWN_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.SAMURAI_HELM_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.SERAPHIM_CROWN_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.SHADOW_STALKER_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.SHADRAX_FINS_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.SNOWSTORM_HOOD_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.SPORELING_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.VALKYRIE_HELM_HAT, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.WEREWOLF_MASK, new HatRenderer());
        TrinketRendererRegistry.registerRenderer(GCItems.MACH_HAT, new HatRenderer());

        BlockRenderLayerMap.INSTANCE.putBlock(DARK_CHERRY_SET.get(BlockType.TRAPDOOR), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GLOWSHROOM_SET.get(BlockType.TRAPDOOR), RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GLOWSHROOM_SET.get(BlockType.DOOR), RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DREADSTONE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DREADSTONE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(LOCKED_DREADSTONE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DREADSTONE_GRATE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DREADSTONE_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DREADSTONE_BARS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(GRATED_IRON_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GRATED_SPRUCE_TRAPDOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(GCBlocks.BLACK_CORUNDUM_CLUSTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GCBlocks.BLUE_CORUNDUM_CLUSTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GCBlocks.GREEN_CORUNDUM_CLUSTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GCBlocks.INDIGO_CORUNDUM_CLUSTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GCBlocks.ORANGE_CORUNDUM_CLUSTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GCBlocks.RED_CORUNDUM_CLUSTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GCBlocks.VIOLET_CORUNDUM_CLUSTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GCBlocks.WHITE_CORUNDUM_CLUSTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GCBlocks.YELLOW_CORUNDUM_CLUSTER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(GCBlocks.SMARAGDANT_CRYSTAL_SHARD, RenderLayer.getCutout());
    }
}