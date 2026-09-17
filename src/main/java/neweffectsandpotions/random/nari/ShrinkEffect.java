package neweffectsandpotions.random.nari;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;

public class ShrinkEffect extends MobEffect {
    protected ShrinkEffect()
    {
        super(MobEffectCategory.BENEFICIAL,0x1);
    }
    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }

    @Override
    public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {

        if (entity instanceof Player) {
            Player player = (Player) entity;

            AttributeInstance scale = player.getAttributes().getInstance(Attributes.SCALE);
            scale.setBaseValue(0.5/(amplifier+1));
        }
        return true;
    }


    @Override
    public void onEffectRemoved(MobEffectInstance mobEffectInstance, LivingEntity entity) {
        if (entity instanceof Player) {
            Player player = (Player) entity;
            AttributeInstance scale = player.getAttributes().getInstance(Attributes.SCALE);
            scale.setBaseValue(1.0);
        }
        super.onEffectRemoved(mobEffectInstance, entity);
    }
}
