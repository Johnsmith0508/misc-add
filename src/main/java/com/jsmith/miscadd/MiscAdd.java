package com.jsmith.miscadd;

import com.jsmith.miscadd.init.ModBlocks;
import com.jsmith.miscadd.init.ModItems;
import com.jsmith.miscadd.init.Recipes;
import com.jsmith.miscadd.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


/**
 * Created by JohnSmith0508 on 3/8/14 at 12:07 PM.
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class MiscAdd
{
@Mod.Instance(Reference.MOD_ID)
    public static MiscAdd instance;

@Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
{
    ModBlocks.init();
    ModItems.init();
}

@Mod.EventHandler
    public void init(FMLInitializationEvent event)
{
    Recipes.init();
}

@Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
{

}

}


/**
 * TODO
 * localise
 * armor overlay
 * config:
 *  usefull recipies
 *      quartz
 *      flesh to lether (machine)[wet lether through funrace = lether]
 *      cobble + 8 slime = 1 clay
 */
