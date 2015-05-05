package com.johnsmith0508.miscadd.init;

import com.johnsmith0508.miscadd.item.ItemMA;
import com.johnsmith0508.miscadd.reference.Ref;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Created by JohnSmith0508 on 5/5/15 at 5:49 PM.
 */
public class RenderItems
{
    public static void init(FMLInitializationEvent event)
    {
        if(event.getSide() == Side.CLIENT)
        {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
            renderItem.getItemModelMesher().register(ModItems.testItem,0,new ModelResourceLocation(Ref.RESCOURCE_PREFIX+ ItemMA.getName(),"inventory"));
        }
    }
}
