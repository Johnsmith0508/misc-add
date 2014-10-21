package com.jsmith.miscadd.item;

import com.jsmith.miscadd.creativeTab.TabMA;
import com.jsmith.miscadd.init.ModItems;
import com.jsmith.miscadd.reference.Reference;
import com.jsmith.miscadd.utility.LogHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * Created by JohnSmith0508 on 3/10/14 at 10:45 PM.
 */
public class ItemPopcorn extends ItemFood
{
    public ItemPopcorn(int heal, float saturation)
    {
        super(heal,saturation,false);
        this.setUnlocalizedName("Popcorn");
        this.setTextureName("Popcorn");
        this.setCreativeTab(TabMA.MA_TAB2);
        this.setMaxStackSize(1);
    }
    @Override
    public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player) {
        player.destroyCurrentEquippedItem();
        player.inventory.addItemStackToInventory(new ItemStack(Items.bucket, 1));
        //--itemStack.stackSize;
        return super.onEaten(itemStack, world, player);
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
