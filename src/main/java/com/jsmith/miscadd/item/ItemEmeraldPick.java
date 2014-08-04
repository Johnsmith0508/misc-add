package com.jsmith.miscadd.item;

import com.jsmith.miscadd.creativeTab.TabOther;
import com.jsmith.miscadd.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

/**
 * Created by JohnSmith0508 on 3/8/14 at 10:37 PM.
 */
public class ItemEmeraldPick extends ItemPickaxe
{
    public ItemEmeraldPick(ToolMaterial material)
    {
        super(material);
        this.setTextureName("EmeraldPickaxe");
        this.setUnlocalizedName("EmeraldPick");
        this.setCreativeTab(TabOther.MA_TAB2);


    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
