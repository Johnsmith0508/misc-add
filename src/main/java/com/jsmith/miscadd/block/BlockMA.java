package com.jsmith.miscadd.block;

import com.jsmith.miscadd.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by JohnSmith0508 on 3/8/14 at 12:33 PM.
 */
public class BlockMA extends Block
{
    public BlockMA() {this(Material.rock);}

    public BlockMA(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabs.tabFood);
    }
    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.RESOURCE_PREFIX, getUnWrapedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnWrapedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnWrapedUnlocalizedName(this.getUnlocalizedName())));
    }
}
