package com.jsmith.miscadd.block;

import com.jsmith.miscadd.creativeTab.TabMA;
import com.jsmith.miscadd.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by JohnSmith0508 on 27/8/14 at 8:09 PM.
 */
public class BlockOpaqueGlass extends BlockGlass
{
    public BlockOpaqueGlass(Material material, boolean bool)
    {
        super(material,bool);
        this.setBlockName("OpaqueGlass");
        this.setBlockTextureName("OpaqueGlass");
        this.setCreativeTab(TabMA.MA_TAB);
        this.setHarvestLevel("pickaxe",1);
        this.setHardness(1);
        this.setStepSound(soundTypeGlass);
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
