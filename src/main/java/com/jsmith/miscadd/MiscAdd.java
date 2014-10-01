package com.jsmith.miscadd;

import com.jsmith.miscadd.handler.ConfigurationHandler;
import com.jsmith.miscadd.init.ModBlocks;
import com.jsmith.miscadd.init.ModItems;
import com.jsmith.miscadd.init.Recipes;
import com.jsmith.miscadd.proxy.IProxy;
import com.jsmith.miscadd.reference.Reference;
import com.jsmith.miscadd.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


/**
 * Created by JohnSmith0508 on 3/8/14 at 12:07 PM.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MiscAdd
{
@Mod.Instance(Reference.MOD_ID)
    public static MiscAdd instance;

@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,serverSide = Reference.SERVER_PROXY_CLASS)
public static IProxy proxy;

@Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
{

    ModBlocks.init();
    ModItems.init();
    proxy.registerKeyBindings();
    ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
    LogHelper.info("Preinit Complete");

}

@Mod.EventHandler
    public void init(FMLInitializationEvent event)
{
    Recipes.init();
    LogHelper.info("Init Complete");
}

@Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
{
    LogHelper.info("PostInit Complete");
}

}


/**
 * TODO
 * FUCKING localise
 * armor overlay
 * config:
 *  usefull recipies
 *      quartz
 *      flesh to lether (machine)[wet lether through funrace = lether]
 *      cobble + 8 slime = 1 clay
 */
