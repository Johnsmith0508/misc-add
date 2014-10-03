package com.jsmith.miscadd.block.dense;

import com.jsmith.miscadd.block.BlockMA;
import net.minecraft.block.material.Material;

/**
 * Created by JohnSmith0508 on 3/8/14 at 5:39 PM.
 */
public class BlockDenseEmerald extends BlockMA
{
    public BlockDenseEmerald()
    {
        super(Material.iron);
        this.setBlockName("DenseEmerald");
        this.setBlockTextureName("DenseEmerald");
        this.setStepSound(soundTypeMetal);
    }
}
