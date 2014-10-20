package com.jsmith.miscadd.init;

import com.jsmith.miscadd.handler.ConfigurationHandler;
import com.jsmith.miscadd.item.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by JohnSmith0508 on 3/8/14 at 10:40 PM.
 */
public class ModItems {
    public static Item.ToolMaterial emeraldmaterial = EnumHelper.addToolMaterial("emerald",3,1801,7.0F,2.0F,15);
    public static ItemArmor.ArmorMaterial emeraldArmorMaterial = EnumHelper.addArmorMaterial("emerald", 50, new int[]{2, 6, 5, 2}, 20);

    public static Item.ToolMaterial lapisMaterial = EnumHelper.addToolMaterial("lapis",3,1000,7.0F,2.0F,15);
    public static ItemArmor.ArmorMaterial lapisArmorMaterial = EnumHelper.addArmorMaterial("lapis",50,new int[]{2,6,5,2},20);

    public static final ItemPickaxe emeraldPick = new ItemEmeraldPick(emeraldmaterial);
    public static final ItemAxe emeraldAxe = new ItemEmeraldAxe(emeraldmaterial);
    public static final ItemHoe emeraldHoe = new ItemEmeraldHoe(emeraldmaterial);
    public static final ItemSpade emeraldSpade = new ItemEmeraldSpade(emeraldmaterial);
    public static final ItemSword emeraldSword = new ItemEmeraldSword(emeraldmaterial);

    public static final ItemAxe lapisAxe = new ItemLapisAxe(lapisMaterial);
    public static final ItemHoe lapisHoe = new ItemLapisHoe(lapisMaterial);
    public static final ItemPickaxe lapisPick = new ItemLapisPick(lapisMaterial);
    public static final ItemSpade lapisSpade = new ItemLapisSpade(lapisMaterial);
    public static final ItemSword lapisSword = new ItemLapisSword(lapisMaterial);

    public static final ItemArmor emeraldArmorHelm = new ItemEmeraldArmour(emeraldArmorMaterial, 0,"emeraldHelm");
    public static final ItemArmor emeraldArmorChest = new ItemEmeraldArmour(emeraldArmorMaterial, 1,"emeraldChest");
    public static final ItemArmor emeraldArmorLegs = new ItemEmeraldArmour(emeraldArmorMaterial, 2,"emeraldLegs");
    public static final ItemArmor emeraldArmorBoots = new ItemEmeraldArmour(emeraldArmorMaterial, 3,"emeraldBoots");

    public static final ItemArmor lapisArmorHelm = new ItemLapisArmor(lapisArmorMaterial, 0,"lapisHelm");
    public static final ItemArmor lapisArmorChest = new ItemLapisArmor(lapisArmorMaterial, 1,"lapisChest");
    public static final ItemArmor lapisArmorLegs = new ItemLapisArmor(lapisArmorMaterial, 2,"lapisLegs");
    public static final ItemArmor lapisArmorBoots = new ItemLapisArmor(lapisArmorMaterial, 3,"lapisBoots");

    public static final ItemMA dampLeather = new ItemDampLeather();
    public static final ItemMA steelIngot = new ItemSteel();
    public static final ItemFood popcorn = new ItemPopcorn(5,7);
    public static final ItemMA chancer = new ItemFiftyFifty();


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

        GameRegistry.registerItem(lapisArmorHelm,"lapisHelm");
        GameRegistry.registerItem(lapisArmorChest,"lapisChest");
        GameRegistry.registerItem(lapisArmorLegs,"lapisLegs");
        GameRegistry.registerItem(lapisArmorBoots,"lapisBoots");

        GameRegistry.registerItem(lapisAxe,"lapisAxe");
        GameRegistry.registerItem(lapisHoe,"lapisHoe");
        GameRegistry.registerItem(lapisPick,"lapisPick");
        GameRegistry.registerItem(lapisSpade,"lapisSpade");
        GameRegistry.registerItem(lapisSword,"lapisSword8");

        GameRegistry.registerItem(dampLeather, "dampLeather");
        GameRegistry.registerItem(steelIngot,"SteelIngot");
        GameRegistry.registerItem(popcorn,"Popcorn");
        GameRegistry.registerItem(chancer,"Chancer");


    }
}