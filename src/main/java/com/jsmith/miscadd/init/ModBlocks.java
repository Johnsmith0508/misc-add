package com.jsmith.miscadd.init;

import com.jsmith.miscadd.block.*;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by JohnSmith0508 on 3/8/14 at 2:10 PM.
 */
public class ModBlocks
{
    public static final BlockMA denseIron = new BlockDenseIron();
    public static final BlockMA denseDiamond = new BlockDenseDiamond();
    public static final BlockMA denseGold = new BlockDenseGold();
    public static final BlockMA denseEmerald = new BlockDenseEmerald();
    public static final BlockMA denseCoal = new BlockDenseCoal();
    public static final BlockMA denseLapis = new BlockDenseLapis();
    public static final BlockMA denseRedstone = new BlockDenseRedstone();
    public static final BlockMA denseQuartz = new BlockDenseQuartz();

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

    }
}
