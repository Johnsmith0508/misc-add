package com.johnsmith0508.miscadd.item;

import com.johnsmith0508.miscadd.creativeTab.TabMa;
import com.johnsmith0508.miscadd.reference.Ref;
import net.minecraft.item.Item;

/**
 * Created by JohnSmith0508 on 4/5/15 at 9:08 PM.
 */
public class ItemMA extends Item
{
    private static String name = "DevItem";
    public ItemMA()
    {
        this.setCreativeTab(TabMa.MA_TAB);
        this.setUnlocalizedName(name);
    }

    public static String getName()
    {
        return name;
    }

    @Override
    public Item setUnlocalizedName(String unlocalizedName) {
        return super.setUnlocalizedName(Ref.RESCOURCE_PREFIX +unlocalizedName);
    }
}
