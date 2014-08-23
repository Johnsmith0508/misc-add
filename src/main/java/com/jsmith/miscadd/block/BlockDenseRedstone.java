package com.jsmith.miscadd.block;

import net.minecraft.block.material.Material;

/**
 * Created by JohnSmith0508 on 3/8/14 at 5:56 PM.
 */
public class BlockDenseRedstone extends BlockMA
{
    public BlockDenseRedstone()
    {
        super(Material.iron);
        this.setBlockName("DenseRedstone");
        this.setBlockTextureName("DesnseRedstone");
        this.setStepSound(soundTypeMetal);
        this.setLightLevel(5f);
        this.canProvidePower();
    }
}
