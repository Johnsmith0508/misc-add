package com.johnsmith0508.miscadd;

import com.johnsmith0508.miscadd.init.ModBlocks;
import com.johnsmith0508.miscadd.init.ModItems;
import com.johnsmith0508.miscadd.init.RenderItems;
import com.johnsmith0508.miscadd.reference.Ref;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by JohnSmith0508 on 4/5/15 at 5:31 PM.
 */
@Mod(version = Ref.VERSION, modid = Ref.MOD_ID, name = Ref.MOD_NAME)
public class MiscAdd
{
    @Mod.Instance(Ref.MOD_ID)
    public static MiscAdd instance;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        ModBlocks.init();
        ModItems.init();
    }
    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {
        RenderItems.init(event);
    }
    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {

    }
}
