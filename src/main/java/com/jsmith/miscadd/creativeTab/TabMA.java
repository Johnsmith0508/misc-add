package com.jsmith.miscadd.creativeTab;

import com.jsmith.miscadd.init.ModBlocks;
import com.jsmith.miscadd.init.ModItems;
import com.jsmith.miscadd.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;

/**
 * Created by JohnSmith0508 on 3/8/14 at 7:33 PM.
 */
public class TabMA
{
    public static final CreativeTabs MA_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem() {return Item.getItemFromBlock(ModBlocks.denseCoal);}

        @Override
        @SideOnly(Side.CLIENT)
        public String getTranslatedTabLabel()
        {
            return "Misc-Additions (Dense Blocks)";
        }
    };
    public static final CreativeTabs MA_TAB2 = new CreativeTabs(Reference.MOD_ID + "2") {
        @Override
        public Item getTabIconItem() {
            return ModItems.chancer;
        }
        @Override
        @SideOnly(Side.CLIENT)
        public String getTranslatedTabLabel()
        {
            return "Misc-Additions (Other)";
        }
    };

}
