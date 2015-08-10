package com.borgdude.themod.client.render.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.borgdude.themod.ModItems;
import com.borgdude.themod.reference;

public class ItemRenderRegister {

	public static String modid = reference.MOD_ID;
	
	public static void registerItemRenderer(){
		reg(ModItems.tutorialItem);
	}
	
	public static void reg(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
