package com.jsmith.miscadd.init;

import com.jsmith.miscadd.item.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by JohnSmith0508 on 3/8/14 at 10:40 PM.
 */
public class ModItems {
    public static Item.ToolMaterial emeraldmaterial = EnumHelper.addToolMaterial("emerald",3,1801,7.0F,2.0F,15);

    public static final ItemPickaxe emeraldPick = new ItemEmeraldPick(emeraldmaterial);
    public static final ItemAxe emeraldAxe = new ItemEmeraldAxe(emeraldmaterial);
    public static final ItemHoe emeraldHoe = new ItemEmeraldHoe(emeraldmaterial);
    public static final ItemSpade emeraldSpade = new ItemEmeraldSpade(emeraldmaterial);
    public static final ItemSword emeraldSword = new ItemEmeraldSword(emeraldmaterial);

    public static void init()
    {
        GameRegistry.registerItem(emeraldPick,"emeraldPick");
        GameRegistry.registerItem(emeraldAxe, "emeraldAxe");
        GameRegistry.registerItem(emeraldHoe,"emeraldHoe");
        GameRegistry.registerItem(emeraldSpade,"emeraldShovel");
        GameRegistry.registerItem(emeraldSword,"emeraldSword");
    }
}
