package neweffectsandpotions.random.nari;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FabricPotionBrewingBuilder;
import net.minecraft.core.Holder;
import net.minecraft.resources.Identifier;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static neweffectsandpotions.random.nari.ModPotionsIds.FLIGHT_POTION;

public class Neweffectsandpotions implements ModInitializer {
	public static final String MOD_ID = "neweffectsandpotions";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
        ModEffects.initialize();
        ModPotions.initialize();
		LOGGER.info("Hello Fabric world!");
        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.addMix(Potions.WATER, Items.NETHER_STAR, ModPotions.FLIGHT_POTION);});
        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.addMix(ModPotions.FLIGHT_POTION, Items.REDSTONE, ModPotions.FLIGHT_POTION_LONG);});

        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.addMix(Potions.WATER, Items.STRING, ModPotions.STICKY_POTION);});
        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.addMix(ModPotions.STICKY_POTION, Items.REDSTONE, ModPotions.STICKY_POTION_LONG);});

        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.addMix(Potions.WATER, Items.SLIME_BALL, ModPotions.BOUNCE_POTION);});
        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.addMix(ModPotions.BOUNCE_POTION, Items.REDSTONE, ModPotions.BOUNCE_POTION_LONG);});

        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.addMix(Potions.WATER, Items.ROTTEN_FLESH, ModPotions.CURSE_OF_THE_ZOMBIE_POTION);});
        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.addMix(ModPotions.CURSE_OF_THE_ZOMBIE_POTION, Items.REDSTONE, ModPotions.CURSE_OF_THE_ZOMBIE_POTION_LONG);});

        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.addMix(Potions.WATER, Items.CHORUS_FRUIT, ModPotions.SHRINK_POTION_0);});
        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.addMix(ModPotions.SHRINK_POTION_0, Items.REDSTONE, ModPotions.SHRINK_POTION_0_LONG);});
        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.addMix(ModPotions.SHRINK_POTION_0, Items.GLOWSTONE, ModPotions.SHRINK_POTION_1);});
        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.addMix(ModPotions.SHRINK_POTION_0_LONG, Items.GLOWSTONE, ModPotions.SHRINK_POTION_1_LONG);});
        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.addMix(ModPotions.SHRINK_POTION_1, Items.REDSTONE, ModPotions.SHRINK_POTION_1_LONG);});

        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.addMix(Potions.WATER, Items.CAKE, ModPotions.GROWTH_POTION_0);});
        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.addMix(ModPotions.GROWTH_POTION_0, Items.REDSTONE, ModPotions.GROWTH_POTION_0_LONG);});
        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.addMix(ModPotions.GROWTH_POTION_0, Items.GLOWSTONE, ModPotions.GROWTH_POTION_1);});
        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.addMix(ModPotions.GROWTH_POTION_0_LONG, Items.GLOWSTONE, ModPotions.GROWTH_POTION_1_LONG);});
        FabricPotionBrewingBuilder.BUILD.register(builder -> {builder.addMix(ModPotions.GROWTH_POTION_1, Items.REDSTONE, ModPotions.GROWTH_POTION_1_LONG);});

    }

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
