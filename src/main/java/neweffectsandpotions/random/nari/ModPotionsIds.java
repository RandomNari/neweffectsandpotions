package neweffectsandpotions.random.nari;

import net.fabricmc.fabric.api.registry.FabricPotionBrewingBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;

import static net.minecraft.resources.Identifier.fromNamespaceAndPath;
import static neweffectsandpotions.random.nari.Neweffectsandpotions.MOD_ID;

public class ModPotionsIds {
    public static final ResourceKey<Potion> FLIGHT_POTION = create("flight");
    public static final ResourceKey<Potion> STICKY_POTION = create("sticky");
    public static final ResourceKey<Potion> CURSE_OF_THE_ZOMBIE_POTION = create("curse_of_the_zombie");
    public static final ResourceKey<Potion> SHRINK_POTION = create("shrink");
    public static final ResourceKey<Potion> GROWTH_POTION = create("growth");
    public static final ResourceKey<Potion> BOUNCE_POTION = create("bounce");
    public static final ResourceKey<Potion> FLIGHT_POTION_LONG = create("flight_long");
    public static final ResourceKey<Potion> STICKY_POTION_LONG = create("sticky_long");
    public static final ResourceKey<Potion> CURSE_OF_THE_ZOMBIE_POTION_LONG = create("curse_of_the_zombie_long");
    public static final ResourceKey<Potion> SHRINK_POTION_0_LONG = create("shrink_0_long");
    public static final ResourceKey<Potion> GROWTH_POTION_0_LONG = create("growth_0_long");
    public static final ResourceKey<Potion> BOUNCE_POTION_LONG = create("bounce_long");
    public static final ResourceKey<Potion> SHRINK_POTION_1_LONG = create("shrink_1_long");
    public static final ResourceKey<Potion> GROWTH_POTION_1_LONG = create("growth_1_long");
    public static final ResourceKey<Potion> SHRINK_POTION_1 = create("shrink_1");
    public static final ResourceKey<Potion> GROWTH_POTION_1 = create("growth_1");

    private static ResourceKey<Potion> create(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(String.valueOf(Neweffectsandpotions.MOD_ID), name);
        return ResourceKey.create(Registries.POTION, id);
    }

}
