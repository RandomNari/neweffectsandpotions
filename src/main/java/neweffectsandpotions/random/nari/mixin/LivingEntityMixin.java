package neweffectsandpotions.random.nari.mixin;

import net.minecraft.world.entity.InterpolationHandler;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import neweffectsandpotions.random.nari.ModEffects;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {

    @Inject(at = @At("HEAD"), method = "onClimbable", cancellable = true)
	public void init(CallbackInfoReturnable<Boolean> cir) {
        if((Object)this instanceof Player player)
        {
		if(player.hasEffect(ModEffects.STICKY)&&player.horizontalCollision)
        {
            cir.setReturnValue(true);
        }

        }
	}
}