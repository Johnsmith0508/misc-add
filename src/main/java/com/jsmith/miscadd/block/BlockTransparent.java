package com.jsmith.miscadd.block;

import com.jsmith.miscadd.creativeTab.TabMA;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;

/**
 * Created by JohnSmith0508 on 27/8/14 at 8:10 PM.
 */
public class BlockTransparent extends BlockBreakable
{
    public BlockTransparent(Material material, boolean bool)
    {
        super("Glass", material, bool);
        this.setCreativeTab(TabMA.MA_TAB);
    }
    public int quantityDropped(){return 0;}

    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 0;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    protected boolean canSilkHarvest()
    {
        return true;
    }
}
