package com.railways.mod.proxy;

import com.railways.mod.render.RWBlockRender;
import com.railways.mod.render.RWItemRender;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	public void preInit(FMLPreInitializationEvent preEvent){
		
		super.preInit(preEvent);
		
	}
	
	
	public void Init(FMLInitializationEvent Event){
		
		super.Init(Event);
		
		RWBlockRender.registerBlockRender();
		RWItemRender.registerItemRender();
		
	}
	
	
	public void postInit(FMLPostInitializationEvent postEvent){
		
		super.postInit(postEvent);
		
	}	

	
	
}
