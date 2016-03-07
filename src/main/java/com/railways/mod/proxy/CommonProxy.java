package com.railways.mod.proxy;

import com.railways.mod.blocks.WBBlocks;
import com.railways.mod.crafting.WBRecipes;
import com.railways.mod.crafting.WBSmelting;
import com.railways.mod.handler.WBDropHandler;
import com.railways.mod.handler.WBFuelHandler;
import com.railways.mod.items.WBItems;
import com.railways.mod.world.WBWorldGen;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent preEvent){
		
		WBBlocks.initBlocks();
		WBItems.initItems();
		
		WBRecipes.initRecipes();
		WBSmelting.initSmelting();
		
	}
	
	
	public void Init(FMLInitializationEvent Event){
		GameRegistry.registerWorldGenerator(new WBWorldGen(), 0);
		MinecraftForge.EVENT_BUS.register(new WBDropHandler());
		GameRegistry.registerFuelHandler(new WBFuelHandler());
		
	}
	
	
	public void postInit(FMLPostInitializationEvent postEvent){
		
	}	
}
