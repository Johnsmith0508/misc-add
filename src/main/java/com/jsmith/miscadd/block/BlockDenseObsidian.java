package com.jsmith.miscadd.block;

import net.minecraft.block.material.Material;

/**
 * Created by JohnSmith0508 on 2/10/14 at 8:14 PM.
 */
public class BlockDenseObsidian extends BlockMA
{
    public BlockDenseObsidian()
    {
        super(Material.iron);
        this.setBlockName("DenseObsidian");
        this.setStepSound(soundTypeMetal);
        this.setBlockTextureName("DenseObsidian");
        this.setHardness(9000);
    }
}
