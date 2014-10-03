package com.jsmith.miscadd.block.dense;

import com.jsmith.miscadd.block.BlockMA;
import net.minecraft.block.material.Material;

/**
 * Created by JohnSmith0508 on 3/8/14 at 5:46 PM.
 */
public class BlockDenseCoal extends BlockMA
{
    public BlockDenseCoal()
    {
        super(Material.iron);
        this.setBlockName("DenseCoal");
        this.setBlockTextureName("DenseCoal");
        this.setStepSound(soundTypeMetal);
    }

}
