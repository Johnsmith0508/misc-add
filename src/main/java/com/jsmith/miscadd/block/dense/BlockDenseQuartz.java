package com.jsmith.miscadd.block.dense;

import com.jsmith.miscadd.block.BlockMA;
import net.minecraft.block.material.Material;

/**
 * Created by JohnSmith0508 on 3/8/14 at 6:31 PM.
 */
public class BlockDenseQuartz extends BlockMA
{
    public BlockDenseQuartz()
    {
        super(Material.iron);
        this.setBlockName("DenseQuartz");
        this.setBlockTextureName("DenseQuartz");
        this.setStepSound(soundTypeMetal);

    }
}
