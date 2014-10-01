package com.jsmith.miscadd.client.gui;

import com.jsmith.miscadd.handler.ConfigurationHandler;
import com.jsmith.miscadd.reference.Names;
import com.jsmith.miscadd.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Created by JohnSmith0508 on 23/8/14 at 10:41 AM.
 */
public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Names.ConfigCategory.ENHANCEMENTS)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
