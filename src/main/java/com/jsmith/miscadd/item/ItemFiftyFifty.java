package com.jsmith.miscadd.item;

import com.jsmith.miscadd.creativeTab.TabMA;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

/**
 * Created by JohnSmith0508 on 20/10/14 at 2:10 PM.
 */
public class ItemFiftyFifty extends ItemMA
{
    public ItemFiftyFifty()
    {
        super();
        this.setUnlocalizedName("Chancer");
        this.setTextureName("Chancer");
        this.setCreativeTab(TabMA.MA_TAB2);
        this.setMaxStackSize(1);
    }

    @Override
    public void registerIcons(IIconRegister iconRegister) {
        super.registerIcons(iconRegister);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack, int pass) {
        return true;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        if(new Random().nextBoolean())
        {
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id,600,5));
            player.addPotionEffect(new PotionEffect(Potion.jump.id,600,5));
        }
        else {player.addPotionEffect(new PotionEffect(Potion.harm.id,60,5));}
        if(!player.capabilities.isCreativeMode) {player.destroyCurrentEquippedItem();}
        return super.onItemRightClick(itemStack, world, player);
    }

    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer player, List tooltip, boolean advanced)
    {
        tooltip.add("Mystical Item, Seems");
        tooltip.add("to effect the user with extreme");
        tooltip.add("speed, but with deadly consequences");
    }


}
