package org.strezz.darkforge.mixin.mixins;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Session;
import net.minecraft.util.Timer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.strezz.darkforge.Darkforge;
import org.strezz.darkforge.mixin.imp.IMixinMinecraft;

@Mixin(Minecraft.class)
public class MixinMinecraft implements IMixinMinecraft {
    @Shadow
    @Final
    @Mutable
    private Session session;

    @Shadow
    @Final
    private Timer timer;

    @Shadow
    private static int debugFPS;

    @Inject(method = "init", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;checkGLError(Ljava/lang/String;)V", ordinal = 2, shift = At.Shift.AFTER))
    private void init(CallbackInfo cbi) {
        Darkforge.INSTANCE.start();
    }

    @Override
    public Session getSession() {
        return session;
    }

    @Override
    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public Timer getTimer() {
        return timer;
    }

    @Override
    public int getDebugFPS() {
        return debugFPS;
    }
}
