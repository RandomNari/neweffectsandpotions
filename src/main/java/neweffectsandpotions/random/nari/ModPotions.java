package neweffectsandpotions.random.nari;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;

public class ModPotions {
    public static final Holder<Potion> FLIGHT_POTION = Registry.registerForHolder(BuiltInRegistries.POTION, ModPotionsIds.FLIGHT_POTION, new Potion("flight", new MobEffectInstance(ModEffects.FLIGHT, 3600, 0)));
    public static final Holder<Potion> FLIGHT_POTION_LONG = Registry.registerForHolder(BuiltInRegistries.POTION, ModPotionsIds.FLIGHT_POTION_LONG, new Potion("flight_long", new MobEffectInstance(ModEffects.FLIGHT, 8400, 0)));

    public static final Holder<Potion> CURSE_OF_THE_ZOMBIE_POTION = Registry.registerForHolder(BuiltInRegistries.POTION, ModPotionsIds.CURSE_OF_THE_ZOMBIE_POTION, new Potion("curse_of_the_zombie", new MobEffectInstance(ModEffects.COTZ, 3600, 0)));
    public static final Holder<Potion> CURSE_OF_THE_ZOMBIE_POTION_LONG = Registry.registerForHolder(BuiltInRegistries.POTION, ModPotionsIds.CURSE_OF_THE_ZOMBIE_POTION_LONG, new Potion("curse_of_the_zombie_long", new MobEffectInstance(ModEffects.COTZ, 8400, 0)));

    public static final Holder<Potion> STICKY_POTION = Registry.registerForHolder(BuiltInRegistries.POTION, ModPotionsIds.STICKY_POTION, new Potion("sticky", new MobEffectInstance(ModEffects.STICKY, 3600, 0)));
    public static final Holder<Potion> STICKY_POTION_LONG = Registry.registerForHolder(BuiltInRegistries.POTION, ModPotionsIds.STICKY_POTION_LONG, new Potion("sticky_long", new MobEffectInstance(ModEffects.STICKY, 8400, 0)));

    public static final Holder<Potion> SHRINK_POTION_0 = Registry.registerForHolder(BuiltInRegistries.POTION, ModPotionsIds.SHRINK_POTION, new Potion("shrink", new MobEffectInstance(ModEffects.SHRINK, 3600, 0)));
    public static final Holder<Potion> SHRINK_POTION_1 = Registry.registerForHolder(BuiltInRegistries.POTION, ModPotionsIds.SHRINK_POTION_1, new Potion("shrink_1", new MobEffectInstance(ModEffects.SHRINK, 3600, 1)));
    public static final Holder<Potion> SHRINK_POTION_0_LONG = Registry.registerForHolder(BuiltInRegistries.POTION, ModPotionsIds.SHRINK_POTION_0_LONG, new Potion("shrink_0_long", new MobEffectInstance(ModEffects.SHRINK, 8400, 0)));
    public static final Holder<Potion> SHRINK_POTION_1_LONG = Registry.registerForHolder(BuiltInRegistries.POTION, ModPotionsIds.SHRINK_POTION_1_LONG, new Potion("shrink_1_long", new MobEffectInstance(ModEffects.SHRINK, 8400, 1)));

    public static final Holder<Potion> GROWTH_POTION_0 = Registry.registerForHolder(BuiltInRegistries.POTION, ModPotionsIds.GROWTH_POTION, new Potion("growth", new MobEffectInstance(ModEffects.GROWTH, 3600, 0)));
    public static final Holder<Potion> GROWTH_POTION_1 = Registry.registerForHolder(BuiltInRegistries.POTION, ModPotionsIds.GROWTH_POTION_1, new Potion("growth_1", new MobEffectInstance(ModEffects.GROWTH, 3600, 1)));
    public static final Holder<Potion> GROWTH_POTION_0_LONG = Registry.registerForHolder(BuiltInRegistries.POTION, ModPotionsIds.GROWTH_POTION_0_LONG, new Potion("growth_0_long", new MobEffectInstance(ModEffects.GROWTH, 8400, 0)));
    public static final Holder<Potion> GROWTH_POTION_1_LONG = Registry.registerForHolder(BuiltInRegistries.POTION, ModPotionsIds.GROWTH_POTION_1_LONG, new Potion("growth_1_long", new MobEffectInstance(ModEffects.GROWTH, 8400, 1)));

    public static final Holder<Potion> BOUNCE_POTION = Registry.registerForHolder(BuiltInRegistries.POTION, ModPotionsIds.BOUNCE_POTION, new Potion("bounce", new MobEffectInstance(ModEffects.BOUNCE, 3600, 0)));
    public static final Holder<Potion> BOUNCE_POTION_LONG = Registry.registerForHolder(BuiltInRegistries.POTION, ModPotionsIds.BOUNCE_POTION_LONG, new Potion("bounce_long", new MobEffectInstance(ModEffects.BOUNCE, 8400, 0)));


    public static void initialize() {

    }
}
