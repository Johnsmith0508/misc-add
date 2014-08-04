package com.jsmith.miscadd.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by JohnSmith0508 on 3/8/14 at 8:55 PM.
 */
public class Recipes
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

        GameRegistry.addRecipe(
                new ItemStack(ModItems.emeraldAxe),
                "ee",
                "es",
                " s",

                'e', new ItemStack(Items.emerald),
                's', new ItemStack(Items.stick)
        );
        GameRegistry.addRecipe(
                new ItemStack(ModItems.emeraldHoe),
                "ee",
                " s",
                " s",

                'e',new ItemStack(Items.emerald),
                's',new ItemStack(Items.stick)
        );
        GameRegistry.addRecipe(
                new ItemStack(ModItems.emeraldPick),
                "eee",
                " s ",
                " s ",

                'e',new ItemStack(Items.emerald),
                's',new ItemStack(Items.stick)
        );
        GameRegistry.addRecipe(
                new ItemStack(ModItems.emeraldSpade),
                "e","s","s",'e',new ItemStack(Items.emerald),'s',new ItemStack(Items.stick)
        );
        GameRegistry.addRecipe(
                new ItemStack(ModItems.emeraldSword),
                "e","e","s",'e',new ItemStack(Items.emerald),'s',new ItemStack(Items.stick)
        );


        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.denseCoal), new ItemStack(Blocks.coal_block, 9));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.denseDiamond), new ItemStack(Blocks.diamond_block, 9));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.denseEmerald), new ItemStack(Blocks.coal_block, 9));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.denseGold), new ItemStack(Blocks.coal_block, 9));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.denseIron), new ItemStack(Blocks.coal_block, 9));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.denseLapis), new ItemStack(Blocks.lapis_block, 9));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.denseQuartz), new ItemStack(Blocks.quartz_block, 9));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.denseRedstone), new ItemStack(Blocks.redstone_block, 9));

    }
}
