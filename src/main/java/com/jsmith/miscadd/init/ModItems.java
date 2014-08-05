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
    static ItemArmor.ArmorMaterial emeraldArmorMaterial = EnumHelper.addArmorMaterial("emerald", 50, new int[]{2, 6, 5, 2}, 20);

    public static final ItemPickaxe emeraldPick = new ItemEmeraldPick(emeraldmaterial);
    public static final ItemAxe emeraldAxe = new ItemEmeraldAxe(emeraldmaterial);
    public static final ItemHoe emeraldHoe = new ItemEmeraldHoe(emeraldmaterial);
    public static final ItemSpade emeraldSpade = new ItemEmeraldSpade(emeraldmaterial);
    public static final ItemSword emeraldSword = new ItemEmeraldSword(emeraldmaterial);
    public static final ItemArmor emeraldArmorHelm = new ItemEmeraldArmour(emeraldArmorMaterial, 0,"emeraldHelm");
    public static final ItemArmor emeraldArmorChest = new ItemEmeraldArmour(emeraldArmorMaterial, 1,"emeraldChest");
    public static final ItemArmor emeraldArmorLegs = new ItemEmeraldArmour(emeraldArmorMaterial, 2,"emeraldLegs");
    public static final ItemArmor emeraldArmorBoots = new ItemEmeraldArmour(emeraldArmorMaterial, 3,"emeraldBoots");

    public static void init()
    {
        GameRegistry.registerItem(emeraldPick,"emeraldPick");
        GameRegistry.registerItem(emeraldAxe, "emeraldAxe");
        GameRegistry.registerItem(emeraldHoe,"emeraldHoe");
        GameRegistry.registerItem(emeraldSpade,"emeraldShovel");
        GameRegistry.registerItem(emeraldSword,"emeraldSword");
        GameRegistry.registerItem(emeraldArmorBoots,"emeraldBoots");
        GameRegistry.registerItem(emeraldArmorLegs,"emeraldLegs");
        GameRegistry.registerItem(emeraldArmorChest,"emeraldChest");
        GameRegistry.registerItem(emeraldArmorHelm,"emeraldHelm");
    }
}
