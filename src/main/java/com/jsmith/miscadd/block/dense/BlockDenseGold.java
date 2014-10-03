package com.jsmith.miscadd.block.dense;

import com.jsmith.miscadd.block.BlockMA;
import net.minecraft.block.material.Material;

/**
 * Created by JohnSmith0508 on 3/8/14 at 5:37 PM.
 */
public class BlockDenseGold extends BlockMA
{
    public BlockDenseGold()
    {
        super(Material.iron);
        this.setBlockName("DenseGold");
        this.setBlockTextureName("DenseGold");
        this.setStepSound(soundTypeMetal);

    }
}
