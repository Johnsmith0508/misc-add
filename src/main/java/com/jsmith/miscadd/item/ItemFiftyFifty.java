package com.jsmith.miscadd.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

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
    }

    @Override
    public void registerIcons(IIconRegister iconRegister) {
        super.registerIcons(iconRegister);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        if(new Random().nextBoolean())
        {
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id,600,5));
            player.addPotionEffect(new PotionEffect(Potion.jump.id,600,5));
        }else
        {
            player.addPotionEffect(new PotionEffect(Potion.harm.id,60,5));
        }
        return super.onItemRightClick(itemStack, world, player);
    }

    @Override
    public boolean hasEffect(ItemStack p_77636_1_) {
        return true;
    }

}
