package org.strezz.darkforge.mixin.imp;

import net.minecraft.util.Session;
import net.minecraft.util.Timer;

public interface IMixinMinecraft {

    Session getSession();

    void setSession(Session session);

    Timer getTimer();

    int getDebugFPS();
}
