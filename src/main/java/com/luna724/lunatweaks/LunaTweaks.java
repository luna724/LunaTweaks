package com.luna724.lunatweaks;

import com.luna724.lunatweaks.mixin.ChestTextureHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LunaTweaks.MODID, name = LunaTweaks.NAME, version = LunaTweaks.VERSION)
public class LunaTweaks {
    public static final String MODID = "lunatweaks";
    public static final String NAME = "LunaTweaks";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Register event handlers
        MinecraftForge.EVENT_BUS.register(new ChestTextureHandler());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }
}
