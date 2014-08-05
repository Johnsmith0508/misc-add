package com.jsmith.miscadd.item;

import com.jsmith.miscadd.creativeTab.TabOther;
import com.jsmith.miscadd.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by JohnSmith0508 on 4/8/14 at 6:36 PM.
 */
public class ItemEmeraldArmour extends ItemArmor
{
    public ItemEmeraldArmour(ArmorMaterial material, int armourType, String name)
    {
        super(material, armourType, armourType);
        this.setUnlocalizedName(Reference.RESOURCE_PREFIX+name);
        this.setTextureName(getUnlocalizedName().substring(5));
        this.setCreativeTab(TabOther.MA_TAB2);
    }
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        int layer = (slot == 2) ? 2 : 1;
        return "miscadd:textures/armor/emerald_" + layer + ".png";
}
}