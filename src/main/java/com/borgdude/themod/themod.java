package com.borgdude.themod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;



@Mod(modid = reference.MOD_ID, name = reference.MOD_NAME, version = reference.VERSION)
public class themod {
	@SidedProxy(clientSide="com.borgdude.themod.ClientProxy", serverSide="com.borgdude.themod.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e){
		this.proxy.preInit(e);
	}
	@EventHandler
	public void Init(FMLInitializationEvent e){
		this.proxy.init(e);
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent e){
		this.proxy.postInit(e);
	}
}
