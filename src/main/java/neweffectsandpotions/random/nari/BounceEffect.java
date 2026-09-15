package neweffectsandpotions.random.nari;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;

public class BounceEffect extends MobEffect {
    protected BounceEffect()
    {
        super(MobEffectCategory.BENEFICIAL,0xe9b8b3);
    }
    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }

    @Override
    public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {

        if (entity instanceof Player) {
            Player player = (Player) entity;

            AttributeInstance bounce = player.getAttributes().getInstance(Attributes.BOUNCINESS);
            AttributeInstance falldamage = player.getAttributes().getInstance(Attributes.FALL_DAMAGE_MULTIPLIER);
            bounce.setBaseValue(1);
            falldamage.setBaseValue(0);

        }
        return true;
    }


    @Override
    public void onEffectRemoved(MobEffectInstance mobEffectInstance, LivingEntity entity) {
        if (entity instanceof Player) {
            Player player = (Player) entity;
            AttributeInstance bounce = player.getAttributes().getInstance(Attributes.BOUNCINESS);
            AttributeInstance falldamage = player.getAttributes().getInstance(Attributes.FALL_DAMAGE_MULTIPLIER);
            bounce.setBaseValue(0);
            falldamage.setBaseValue(1);
        }
        super.onEffectRemoved(mobEffectInstance, entity);

    }
}
