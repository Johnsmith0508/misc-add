package com.jsmith.miscadd.block;

import net.minecraft.block.material.Material;

/**
 * Created by JohnSmith0508 on 3/8/14 at 2:18 PM.
 */
public class BlockDenseDiamond extends BlockMA
{
    public BlockDenseDiamond()
    {
        super(Material.iron);
        this.setBlockName("DenseDiamond");
        this.setStepSound(soundTypeMetal);
        this.setBlockTextureName("DenseDiamond");
    }
}