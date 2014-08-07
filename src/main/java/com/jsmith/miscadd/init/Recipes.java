package com.jsmith.miscadd.init;

import com.jsmith.miscadd.handler.ConfigurationHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.WorldSettings;

/**
 * Created by JohnSmith0508 on 3/8/14 at 8:55 PM.
 */
public class Recipes
{
    public static void init()
    {
        /**
         * Blocks
         */
        GameRegistry.addRecipe(
                new ItemStack(ModBlocks.denseCoal),//
                "ccc",
                "ccc",
                "ccc", 'c', new ItemStack(Blocks.coal_block));
        GameRegistry.addRecipe(
                new ItemStack(ModBlocks.denseIron),//
                "ccc",
                "ccc",
                "ccc", 'c', new ItemStack(Blocks.iron_block));
        GameRegistry.addRecipe(
                new ItemStack(ModBlocks.denseDiamond),//
                "ccc",
                "ccc",
                "ccc", 'c', new ItemStack(Blocks.diamond_block));
        GameRegistry.addRecipe(
                new ItemStack(ModBlocks.denseEmerald),//
                "ccc",
                "ccc",
                "ccc", 'c', new ItemStack(Blocks.emerald_block));
        GameRegistry.addRecipe(
                new ItemStack(ModBlocks.denseGold),//
                "ccc",
                "ccc",
                "ccc", 'c', new ItemStack(Blocks.gold_block));
        GameRegistry.addRecipe(
                new ItemStack(ModBlocks.denseLapis),//
                "ccc",
                "ccc",
                "ccc", 'c', new ItemStack(Blocks.lapis_block));
        GameRegistry.addRecipe(
                new ItemStack(ModBlocks.denseQuartz),//
                "ccc",
                "ccc",
                "ccc", 'c', new ItemStack(Blocks.quartz_block));
        GameRegistry.addRecipe(
                new ItemStack(ModBlocks.denseRedstone),//
                "ccc",
                "ccc",
                "ccc", 'c', new ItemStack(Blocks.redstone_block));
        /**
         * Block uncrafting
         */
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.lapis_block, 9),new ItemStack(ModBlocks.denseLapis));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.coal_block, 9), new ItemStack(ModBlocks.denseCoal));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.quartz_block,9),new ItemStack(ModBlocks.denseQuartz));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.redstone_block,9),new ItemStack(ModBlocks.denseRedstone));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.iron_block,9),new ItemStack(ModBlocks.denseIron));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.diamond_block,9),new ItemStack(ModBlocks.denseDiamond));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.gold_block,9),new ItemStack(ModBlocks.denseGold));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.emerald_block,9),new ItemStack(ModBlocks.denseEmerald));
        /**
         *Armor
         */
        GameRegistry.addRecipe(new ItemStack(ModItems.emeraldArmorBoots),
                "e e",
                "e e",'e',Items.emerald);
        GameRegistry.addRecipe(new ItemStack(ModItems.emeraldArmorLegs),
                "eee",
                "e e",
                "e e",'e',Items.emerald);
        GameRegistry.addRecipe(new ItemStack(ModItems.emeraldArmorChest),
                "e e",
                "eee",
                "eee",'e',Items.emerald);
        GameRegistry.addRecipe(new ItemStack(ModItems.emeraldArmorHelm),
                "eee",
                "e e",'e',Items.emerald);

        /**
         * Config recipies
         */
        if(ConfigurationHandler.quartz)
        {
            GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz,4),new ItemStack(Blocks.quartz_block));
        }

    }
}
