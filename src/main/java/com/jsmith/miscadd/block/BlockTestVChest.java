package com.jsmith.miscadd.block;

import com.jsmith.miscadd.creativeTab.TabMA;
import net.minecraft.block.BlockChest;

/**
 * Created by JohnSmith0508 on 25/8/14 at 5:31 PM.
 */
public class BlockTestVChest extends BlockChest
{
    /**
     * @param type for type of chest
     *             0 is regular
     *             1 is trapped
     *             3+ is free for use
     */
    public BlockTestVChest(int type)
    {
        super(type);
        this.setCreativeTab(TabMA.MA_TAB);
        this.setBlockName("Chest");
    }
}
