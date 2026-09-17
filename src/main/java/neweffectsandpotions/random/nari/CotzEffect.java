package neweffectsandpotions.random.nari;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

//Cotz short for Curse of the zombie
public class CotzEffect extends MobEffect {
    protected CotzEffect(){
        super(MobEffectCategory.HARMFUL, 0xe9b8b3);
    }
    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }

    @Override
    public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
        if(level.canSeeSky(entity.blockPosition())&&!level.isDarkOutside())
        {entity.igniteForSeconds(1);}
        return true;
    }
}
