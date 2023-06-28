package dev.enjarai.pleasefixmycrash.mixin;

import net.minecraft.util.Util;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Util.class)
public abstract class UtilMixin {
    @Inject(
            method = "uncaughtExceptionHandler",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/Bootstrap;println(Ljava/lang/String;)V"
            )
    )
    private static void interceptCrash(Thread thread, Throwable t, CallbackInfo ci) {

    }
}
