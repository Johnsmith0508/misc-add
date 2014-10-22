package com.jsmith.miscadd.block;

import com.jsmith.miscadd.handler.ConfigurationHandler;
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
        if(ConfigurationHandler.obsidian)
        {
            this.setHardness(9000);
        }else
        {
            this.setHardness(51);
        }
    }
}
