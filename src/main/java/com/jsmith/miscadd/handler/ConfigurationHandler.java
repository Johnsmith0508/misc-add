package com.jsmith.miscadd.handler;

import com.jsmith.miscadd.reference.Names;
import com.jsmith.miscadd.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by JohnSmith0508 on 7/8/14 at 4:01 PM.
 */
public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;
    public static boolean quartz;
    public static boolean flesh;
    public static boolean obsidian;


    public static void init(File configFile)
    {
        // Create the configuration object from the given configuration file
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value");
        quartz = configuration.getBoolean("quartzStorage", Names.ConfigCategory.ENHANCEMENTS,false,"Can you uncraft quartz blocks?");
        flesh = configuration.getBoolean("FleshToLeather",Names.ConfigCategory.ENHANCEMENTS, true,"Can you craft leather from smelting damp leather?");
        obsidian=configuration.getBoolean("UnbreakableDenseObsidian",Configuration.CATEGORY_GENERAL,true,"Is dense obsidian unbreakable in survival mode :WARNING: it si suggested fot this to be turned off on multplayer servers");


        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }
}
