package neweffectsandpotions.random.nari;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffect;

import static neweffectsandpotions.random.nari.Neweffectsandpotions.MOD_ID;

public class ModEffects implements ModInitializer {
    public static final Holder<MobEffect> COTZ = Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, Identifier.fromNamespaceAndPath(MOD_ID, "cotz"), new CotzEffect());
    public static final Holder<MobEffect> BOUNCE = Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, Identifier.fromNamespaceAndPath(MOD_ID, "bounce"), new BounceEffect());
    public static final Holder<MobEffect> SHRINK = Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT,Identifier.fromNamespaceAndPath(MOD_ID, "shrink"), new ShrinkEffect());
    public static final Holder<MobEffect> GROWTH = Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, Identifier.fromNamespaceAndPath(MOD_ID,"growth"), new GrowthEffect());
    public static final Holder<MobEffect> STICKY = Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, Identifier.fromNamespaceAndPath(MOD_ID, "sticky"), new StickyEffect());
    public static final Holder<MobEffect> FLIGHT = Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT,Identifier.fromNamespaceAndPath(MOD_ID, "flight"), new FlightEffect());

    @Override
    public void onInitialize() {

    }
}
