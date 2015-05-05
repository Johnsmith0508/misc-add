package com.johnsmith0508.miscadd.item;

import com.johnsmith0508.miscadd.creativeTab.TabMa;
import net.minecraft.item.Item;

/**
 * Created by JohnSmith0508 on 4/5/15 at 9:08 PM.
 */
public class ItemMA extends Item
{
    public ItemMA()
    {
        this.setMaxStackSize(128);
        this.setCreativeTab(TabMa.MA_TAB);
        this.setUnlocalizedName("miscadd:DevItem");
    }
}
