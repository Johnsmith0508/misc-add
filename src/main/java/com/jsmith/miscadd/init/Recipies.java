package com.jsmith.miscadd.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/**
 * Created by JohnSmith0508 on 3/8/14 at 8:55 PM.
 */
public class Recipies
{
    public static void init()
    {
        GameRegistry.addRecipe(
                new ItemStack(ModBlocks.denseCoal),
                "ccc",
                "ccc",
                "ccc", 'c', new ItemStack(Blocks.coal_block));
        GameRegistry.addRecipe(
                new ItemStack(ModBlocks.denseIron),
                "ccc",
                "ccc",
                "ccc", 'c', new ItemStack(Blocks.iron_block));
        GameRegistry.addRecipe(
                new ItemStack(ModBlocks.denseDiamond),
                "ccc",
                "ccc",
                "ccc", 'c', new ItemStack(Blocks.diamond_block));
        GameRegistry.addRecipe(
                new ItemStack(ModBlocks.denseEmerald),
                "ccc",
                "ccc",
                "ccc", 'c', new ItemStack(Blocks.emerald_block));
        GameRegistry.addRecipe(
                new ItemStack(ModBlocks.denseGold),
                "ccc",
                "ccc",
                "ccc", 'c', new ItemStack(Blocks.gold_block));
        GameRegistry.addRecipe(
                new ItemStack(ModBlocks.denseLapis),
                "ccc",
                "ccc",
                "ccc", 'c', new ItemStack(Blocks.lapis_block));
        GameRegistry.addRecipe(
                new ItemStack(ModBlocks.denseQuartz),
                "ccc",
                "ccc",
                "ccc", 'c', new ItemStack(Blocks.quartz_block));
        GameRegistry.addRecipe(
                new ItemStack(ModBlocks.denseRedstone),
                "ccc",
                "ccc",
                "ccc", 'c', new ItemStack(Blocks.redstone_block));
    }
}
