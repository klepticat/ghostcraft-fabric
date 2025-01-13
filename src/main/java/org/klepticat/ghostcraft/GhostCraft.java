package org.klepticat.ghostcraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import org.klepticat.ghostcraft.command.DevCommands;
import org.klepticat.ghostcraft.command.LightningCommand;
import org.klepticat.ghostcraft.command.LoreCommand;
import org.klepticat.ghostcraft.command.SoulsCommand;
import org.klepticat.ghostcraft.networking.InvisKeyPayload;
import org.klepticat.ghostcraft.networking.NightVisKeyPayload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GhostCraft implements ModInitializer {
	public static final String MOD_ID = "ghostcraft";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		AllItems.initialize();
		AllSounds.initialize();
		AllEntityTypes.initialize();
		AllDataComponents.initialize();

		CommandRegistrationCallback.EVENT.register(new LoreCommand()::execute);
		CommandRegistrationCallback.EVENT.register(new LightningCommand()::execute);
		CommandRegistrationCallback.EVENT.register(new DevCommands()::execute);
		CommandRegistrationCallback.EVENT.register(new SoulsCommand()::execute);

		PayloadTypeRegistry.playC2S().register(InvisKeyPayload.ID, InvisKeyPayload.CODEC);
		PayloadTypeRegistry.playC2S().register(NightVisKeyPayload.ID, NightVisKeyPayload.CODEC);

		ServerPlayNetworking.registerGlobalReceiver(InvisKeyPayload.ID, (payload, context) -> {
			if (!context.player().hasStatusEffect(StatusEffects.INVISIBILITY)) context.player().addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, StatusEffectInstance.INFINITE, 0, true, false));
			else context.player().removeStatusEffect(StatusEffects.INVISIBILITY);
		});

		ServerPlayNetworking.registerGlobalReceiver(NightVisKeyPayload.ID, (payload, context) -> {
			if (!context.player().hasStatusEffect(StatusEffects.NIGHT_VISION)) context.player().addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, StatusEffectInstance.INFINITE, 0, true, false));
			else context.player().removeStatusEffect(StatusEffects.NIGHT_VISION);
		});
	}
}