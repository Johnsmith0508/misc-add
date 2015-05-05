package com.johnsmith0508.miscadd.creativeTab;

import com.johnsmith0508.miscadd.init.ModBlocks;
import com.johnsmith0508.miscadd.reference.Ref;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by JohnSmith0508 on 4/5/15 at 6:27 PM.
 */
public class TabMa
{
    public static CreativeTabs MA_TAB = new CreativeTabs(Ref.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ModBlocks.testBlock);
        }
    };
}
