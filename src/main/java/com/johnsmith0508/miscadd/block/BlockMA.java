package com.johnsmith0508.miscadd.block;

import com.johnsmith0508.miscadd.creativeTab.TabMa;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by JohnSmith0508 on 4/5/15 at 6:25 PM.
 */
public class BlockMA extends Block
{
    public BlockMA()
    {
        super(Material.rock);
        this.setCreativeTab(TabMa.MA_TAB);
        this.setUnlocalizedName("miscadd:testblock");
        this.setHardness(3.0f);
        this.setResistance(3.0f);
        this.setHarvestLevel("pickaxe", 2);
    }
}
