package com.johnsmith0508.miscadd.init;

import com.johnsmith0508.miscadd.item.ItemMA;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by JohnSmith0508 on 4/5/15 at 9:12 PM.
 */
public class ModItems
{
    public static final Item testItem = new ItemMA();

    public static void init()
    {
        GameRegistry.registerItem(testItem, ItemMA.getName());
    }
}
