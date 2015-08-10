package com.borgdude.themod.client.render.blocks;

import com.borgdude.themod.reference;
import com.borgdude.themod.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {
	public static String modid = reference.MOD_ID;
	
	public static void registerBlockRenderer(){
		
	}
	public static void reg(Block block){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
