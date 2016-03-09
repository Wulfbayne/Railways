package com.railways.mod;

import com.railways.mod.proxy.CommonProxy;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = RWGlobal.MOD_ID, name = RWGlobal.MOD_NAME, version = RWGlobal.VERSION)
public class Main {
	
	@Instance(RWGlobal.MOD_ID)
	public static Main instance;
		
	@SidedProxy(clientSide = RWGlobal.RW_CLIENT_PROXY, serverSide = RWGlobal.RW_COMMON_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent preEvent){
		
		this.proxy.preInit(preEvent);

	}
	
	@EventHandler
	public void Init(FMLInitializationEvent Event){
		
		this.proxy.Init(Event);
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent postEvent){
		
		this.proxy.postInit(postEvent);
		
	}
	
	
	
	
}
