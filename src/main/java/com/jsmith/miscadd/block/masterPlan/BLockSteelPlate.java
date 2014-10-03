package com.jsmith.miscadd.block.masterPlan;

import com.jsmith.miscadd.block.BlockMA;
import net.minecraft.block.material.Material;

/**
 * Created by JohnSmith0508 on 2/10/14 at 8:13 PM.
 */
public class BLockSteelPlate extends BlockMA
{
    public BLockSteelPlate()
    {
        super(Material.iron);
        this.setBlockTextureName("SteelPlate");
        this.setBlockName("SteelPlate");
    }
}
