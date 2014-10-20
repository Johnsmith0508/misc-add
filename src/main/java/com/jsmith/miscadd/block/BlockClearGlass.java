package com.jsmith.miscadd.block;

import net.minecraft.block.material.Material;

/**
 * Created by JohnSmith0508 on 29/8/14 at 7:51 PM.
 */
public class BlockClearGlass extends BlockOpaqueGlass
{
    public BlockClearGlass(Material material, Boolean bool)
    {
        super(material, bool);
        this.setBlockTextureName("claer_glass");
        this.setBlockName("clear_glass");
    }
}
