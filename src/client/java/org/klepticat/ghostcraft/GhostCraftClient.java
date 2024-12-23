package org.klepticat.ghostcraft;

import dev.emi.trinkets.api.client.TrinketRendererRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import org.klepticat.ghostcraft.render.entity.TotemEntityRenderer;
import org.klepticat.ghostcraft.render.item.trinkets.HatRenderer;

public class GhostCraftClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		AllKeyBindings.initialize();

		EntityRendererRegistry.register(AllEntityTypes.SPELL_PROJECTILE, (context) -> new FlyingItemEntityRenderer<>(context));
		EntityRendererRegistry.register(AllEntityTypes.TOTEM, (context) -> new TotemEntityRenderer<>(context));

		TrinketRendererRegistry.registerRenderer(AllItems.ARACHNOPHOBIA_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.BEARD_MASK, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.BLACK_MAGE_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.BLACK_RAM_HORNS_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.BLEEDING_HELM_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.BLIZZARD_MAGE_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.CANDLE_KEEPER_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.CELESTIAL_BAND_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.CELESTIAL_HOOD_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.CENTURION_HAND_FAN_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.CHIEFTAIN_HELM_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.DARK_HOOD_SHORT_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.DEATHS_HAND_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.DEER_ANTLERS_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.DETECTIVE_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.DEVILS_COWL_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.DEVILS_CROWN_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.DRAKE_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.DREAMERS_CREST_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.DRUID_ANTLERS_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.DWARVEN_HELM_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.EMERALD_BASTION_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.FANCY_BOI_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.FANCY_FEATHER_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.FELDIR_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.FERN_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.FIVE_BILLION_LIKES_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.FLAMBOYANT_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.FOX_CAP_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.FOX_MASK, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.GLADIATOR_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.HO_HO_HO_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.ICE_QUEEN_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.JACK_O_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.JESTER_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.JINGLE_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.KNIGHTS_HELM_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.KOBOLD_MASK, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.LENNY_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.LIL_SQUIRT_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.OBSERVER_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.ORC_CROWN_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.POWER_TRIP_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.PURPLE_FLORAL_CROWN_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.SAMURAI_HELM_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.SERAPHIM_CROWN_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.SHADOW_STALKER_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.SHADRAX_FINS_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.SNOWSTORM_HOOD_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.SPORELING_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.VALKYRIE_HELM_HAT, new HatRenderer());
		TrinketRendererRegistry.registerRenderer(AllItems.WEREWOLF_MASK, new HatRenderer());
	}
}