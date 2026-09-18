package neweffectsandpotions.random.nari;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import org.apache.logging.log4j.core.jmx.Server;

public class FlightEffect extends MobEffect {
    protected FlightEffect ()
    {
        super(MobEffectCategory.BENEFICIAL,0xc2d6d6);
    }
    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }
    @Override
    public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier){
        if (entity instanceof ServerPlayer player) {
            player.getAbilities().mayfly = true;
            player.onUpdateAbilities();
        }
        return true;
    }
    @Override
    public void onEffectRemoved(MobEffectInstance mobEffectInstance, LivingEntity entity){
        if(entity instanceof ServerPlayer player)
        {if(!player.isCreative()&&!player.isSpectator()){
        player.getAbilities().mayfly = false;
        player.getAbilities().flying = false;
        player.onUpdateAbilities();
        }}


        super.onEffectRemoved(mobEffectInstance, entity);
    }
}
