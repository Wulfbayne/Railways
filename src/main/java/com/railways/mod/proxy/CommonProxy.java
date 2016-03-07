package com.railways.mod.proxy;

import com.railways.mod.blocks.RWBlocks;
import com.railways.mod.crafting.RWRecipes;
import com.railways.mod.crafting.RWSmelting;
import com.railways.mod.handler.RWDropHandler;
import com.railways.mod.handler.RWFuelHandler;
import com.railways.mod.items.RWItems;
import com.railways.mod.world.RWWorldGen;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent preEvent){
		
		RWBlocks.initBlocks();
		RWItems.initItems();
		
		RWRecipes.initRecipes();
		RWSmelting.initSmelting();
		

	}
	
	
	public void Init(FMLInitializationEvent Event){
		GameRegistry.registerWorldGenerator(new RWWorldGen(), 0);
		MinecraftForge.EVENT_BUS.register(new RWDropHandler());
		GameRegistry.registerFuelHandler(new RWFuelHandler());
		
	}
	
	
	public void postInit(FMLPostInitializationEvent postEvent){
		
	}
}
	

