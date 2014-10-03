package com.jsmith.miscadd.block.dense;

import com.jsmith.miscadd.block.BlockMA;
import net.minecraft.block.material.Material;

/**
 * Created by JohnSmith0508 on 3/8/14 at 5:52 PM.
 */
public class BlockDenseLapis extends BlockMA
{
    public BlockDenseLapis()
    {
        super(Material.iron);
        this.setBlockName("DenseLapis");
        this.setBlockTextureName("DenseLapis");
        this.setStepSound(soundTypeMetal);
    }
}
