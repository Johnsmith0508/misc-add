package com.jsmith.miscadd.init;

import com.jsmith.miscadd.block.*;
import com.jsmith.miscadd.block.dense.*;
import com.jsmith.miscadd.block.masterPlan.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * Created by JohnSmith0508 on 3/8/14 at 2:10 PM.
 */
public class ModBlocks
{
    public static final Material glassMaterial = new Material(MapColor.airColor);

    public static final BlockMA denseIron = new BlockDenseIron();
    public static final BlockMA denseDiamond = new BlockDenseDiamond();
    public static final BlockMA denseGold = new BlockDenseGold();
    public static final BlockMA denseEmerald = new BlockDenseEmerald();
    public static final BlockMA denseCoal = new BlockDenseCoal();
    public static final BlockMA denseLapis = new BlockDenseLapis();
    public static final BlockMA denseRedstone = new BlockDenseRedstone();
    public static final BlockMA denseQuartz = new BlockDenseQuartz();
    public static final BlockMA denseObsidian = new BlockDenseObsidian();
    public static final BlockMA steelBlock = new BlockSteel();
    public static final BlockMA multiBlockCase = new BlockMultiCase();
    public static final Block chest = new BlockTestVChest(2);
    public static final Block opaqueGlass = new BlockOpaqueGlass(glassMaterial, false);
    public static final Block wutGlass = new BlockClearGlass(glassMaterial, false);

    public static void init()
    {
        GameRegistry.registerBlock(denseIron, "DenseIron");
        GameRegistry.registerBlock(denseDiamond, "DenseDiamond");
        GameRegistry.registerBlock(denseGold, "DenseGold");
        GameRegistry.registerBlock(denseEmerald, "DenseEmerald");
        GameRegistry.registerBlock(denseCoal, "DenseCoal");
        GameRegistry.registerBlock(denseLapis, "DenseLapis");
        GameRegistry.registerBlock(denseRedstone, "DenseRedstone");
        GameRegistry.registerBlock(denseQuartz, "DenseQuartz");
        GameRegistry.registerBlock(steelBlock, "SteelBlock");
        GameRegistry.registerBlock(chest, "TestChest");
        GameRegistry.registerBlock(opaqueGlass, "OpaqueGlass");
        GameRegistry.registerBlock(wutGlass, "WutGlass");
        GameRegistry.registerBlock(denseObsidian, "DenseObsinain");
        //TODO comment next two lines out before releasing v1.5
        GameRegistry.registerBlock(multiBlockCase, "MultiBlockCase");


    }
}
