package com.railways.mod.proxy;

import com.railways.mod.render.WBBlockRender;
import com.railways.mod.render.WBItemRender;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	public void preInit(FMLPreInitializationEvent preEvent){
		
		super.preInit(preEvent);
		
	}
	
	
	public void Init(FMLInitializationEvent Event){
		
		super.Init(Event);
		
		WBBlockRender.registerBlockRender();
		WBItemRender.registerItemRender();
		
	}
	
	
	public void postInit(FMLPostInitializationEvent postEvent){
		
		super.postInit(postEvent);
		
	}	

	
	
}
