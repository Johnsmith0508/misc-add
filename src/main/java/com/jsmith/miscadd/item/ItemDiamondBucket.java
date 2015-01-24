package com.jsmith.miscadd.item;

import com.jsmith.miscadd.creativeTab.TabMA;
import com.jsmith.miscadd.init.ModItems;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.FillBucketEvent;

/**
 * Created by JohnSmith0508 on 24/1/15 at 3:58 PM.
 */
public class ItemDiamondBucket extends ItemMA
{
    private Block isFull;

    /**
     *
     * @param block what block is placed on rightclick
     * @param contents 0 - empty; 1 - water; 2 - lava
     */
    public ItemDiamondBucket(Block block, int contents)
    {
        this.setCreativeTab(TabMA.MA_TAB2);
        this.setMaxStackSize(1);
        this.isFull = block;
        switch (contents)
        {
            case 0:
                this.setUnlocalizedName("diamondBucket");
                this.setTextureName("diamondBucket");
                break;
            case 1:
                this.setUnlocalizedName("diamondWaterBucket");
                this.setTextureName("diamondWaterBucket");
                break;
            case 2:
                this.setUnlocalizedName("diamondLavaBucket");
                this.setTextureName("diamondLavaBucket");
        }
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer)
    {
        boolean flag = this.isFull == Blocks.air;
        MovingObjectPosition movingObjectPosition = this.getMovingObjectPositionFromPlayer(world, entityPlayer,true);

        if (movingObjectPosition == null)
        {
            return itemStack;
        }
        else
        {
            FillBucketEvent event = new FillBucketEvent(entityPlayer,itemStack,world,movingObjectPosition);
            if(MinecraftForge.EVENT_BUS.post(event))
            {
                return itemStack;
            }

            if(event.getResult() == Event.Result.ALLOW)
            {
                if (entityPlayer.capabilities.isCreativeMode)
                {
                    return  itemStack;
                }

                if (--itemStack.stackSize <= 0)
                {
                    return event.result;
                }

                if (!entityPlayer.inventory.addItemStackToInventory(event.result))
                {
                    entityPlayer.dropPlayerItemWithRandomChoice(event.result, false);
                }
                return itemStack;
            }
            if (movingObjectPosition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK)
            {
                int i = movingObjectPosition.blockX;
                int j = movingObjectPosition.blockY;
                int k = movingObjectPosition.blockZ;

                if (!world.canMineBlock(entityPlayer, i, j, k))
                {
                    return itemStack;
                }

                if(flag)
                {
                    if(!entityPlayer.canPlayerEdit(i,j,k, movingObjectPosition.sideHit, itemStack))
                    {
                        return itemStack;
                    }

                    Material material = world.getBlock(i,j,k).getMaterial();
                    int l = world.getBlockMetadata(i,j,k);

                    if (material == Material.water && l == 0)
                    {
                        world.setBlockToAir(i,j,k);
                        return this.func_150910_a(itemStack,entityPlayer, ModItems.diamondWaterBucket);
                    }

                    if(material == Material.lava && l ==0)
                    {
                        world.setBlockToAir(i,j,k);
                        return this.func_150910_a(itemStack,entityPlayer,ModItems.diamondLavaBucket);
                    }
                }
                else
                {
                    if (this.isFull == Blocks.air)
                    {
                        return new ItemStack(ModItems.diamondBucket);
                    }

                    switch (movingObjectPosition.sideHit)
                    {
                        case 1 : ++j; break;
                        case 2 : --k; break;
                        case 3 : ++k; break;
                        case 4 : --i; break;
                        case 5 : ++i; break;
                    }

                    if (!entityPlayer.canPlayerEdit(i,j,k, movingObjectPosition.sideHit, itemStack))
                    {
                        return itemStack;
                    }

                    if(this.tryPlaceContainedLiquid(world, i,j,k) && !entityPlayer.capabilities.isCreativeMode)
                    {
                        return new ItemStack(ModItems.diamondBucket);
                    }
                }
            }
            return itemStack;
        }
    }

    private ItemStack func_150910_a(ItemStack p_150910_1_, EntityPlayer p_150910_2_, Item p_150910_3_)
    {
        if (p_150910_2_.capabilities.isCreativeMode)
        {
            return p_150910_1_;
        }
        else if (--p_150910_1_.stackSize <= 0)
        {
            return new ItemStack(p_150910_3_);
        }
        else
        {
            if (!p_150910_2_.inventory.addItemStackToInventory(new ItemStack(p_150910_3_)))
            {
                p_150910_2_.dropPlayerItemWithRandomChoice(new ItemStack(p_150910_3_, 1, 0), false);
            }

            return p_150910_1_;
        }
    }

    /**
     * Attempts to place the liquid contained inside the bucket.
     */
    public boolean tryPlaceContainedLiquid(World p_77875_1_, int p_77875_2_, int p_77875_3_, int p_77875_4_)
    {
        if (this.isFull == Blocks.air)
        {
            return false;
        }
        else
        {
            Material material = p_77875_1_.getBlock(p_77875_2_, p_77875_3_, p_77875_4_).getMaterial();
            boolean flag = !material.isSolid();

            if (!p_77875_1_.isAirBlock(p_77875_2_, p_77875_3_, p_77875_4_) && !flag)
            {
                return false;
            }
            else
            {
                if (p_77875_1_.provider.isHellWorld && this.isFull == Blocks.flowing_water)
                {
                    p_77875_1_.playSoundEffect((double)((float)p_77875_2_ + 0.5F), (double)((float)p_77875_3_ + 0.5F), (double)((float)p_77875_4_ + 0.5F), "random.fizz", 0.5F, 2.6F + (p_77875_1_.rand.nextFloat() - p_77875_1_.rand.nextFloat()) * 0.8F);

                    for (int l = 0; l < 8; ++l)
                    {
                        p_77875_1_.spawnParticle("largesmoke", (double)p_77875_2_ + Math.random(), (double)p_77875_3_ + Math.random(), (double)p_77875_4_ + Math.random(), 0.0D, 0.0D, 0.0D);
                    }
                }
                else
                {
                    if (!p_77875_1_.isRemote && flag && !material.isLiquid())
                    {
                        p_77875_1_.func_147480_a(p_77875_2_, p_77875_3_, p_77875_4_, true);
                    }

                    p_77875_1_.setBlock(p_77875_2_, p_77875_3_, p_77875_4_, this.isFull, 0, 3);
                }

                return true;
            }
        }
    }
}
