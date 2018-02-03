package org.strezz.darkforge;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Darkforge.MOD_ID, name = Darkforge.MOD_NAME, version = Darkforge.VERSION)
public class Darkforge {

    public static final String MOD_ID = "darkforge";
    public static final String MOD_NAME = "Darkforge";
    public static final String VERSION = "2.0-SNAPSHOT";

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static Darkforge INSTANCE;

    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        // TODO: 03/02/2018  Add Mixin bootstrap

    }

}
