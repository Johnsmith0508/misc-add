package com.johnsmith0508.miscadd.init;

import com.johnsmith0508.miscadd.block.BlockMA;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by JohnSmith0508 on 4/5/15 at 6:21 PM.
 */
public class ModBlocks
{
    public static Block testBlock = new BlockMA();
    public static void init()
    {
        GameRegistry.registerBlock(testBlock,"Test Block");
    }
}
