package com.jsmith.miscadd.block;

import net.minecraft.block.material.Material;

/**
 * Created by JohnSmith0508 on 3/8/14 at 1:29 PM.
 */
public class BlockDenseIron extends BlockMA
{
    public BlockDenseIron()
    {
        super(Material.iron);
        this.setBlockName("DenseIron");
        this.setStepSound(soundTypeMetal);
        this.setBlockTextureName("DenseIron");
    }
}
