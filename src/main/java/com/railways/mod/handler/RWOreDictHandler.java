package com.railways.mod.handler;

import com.railways.mod.blocks.RWBlocks;
import com.railways.mod.items.RWItems;

import net.minecraftforge.oredict.OreDictionary;

public class RWOreDictHandler {
	
	public static void RWOreDictManager(){
		
		// Ores Registration
		OreDictionary.registerOre("oreBeyron", RWBlocks.BeyronOre);
		OreDictionary.registerOre("oreNetherBeyron", RWBlocks.netherBeyronOre);
		OreDictionary.registerOre("oreSarna", RWBlocks.SarnaOre);
		OreDictionary.registerOre("oreNetherSarna", RWBlocks.netherSarnaOre);
		
		// Metals Registration
		OreDictionary.registerOre("ingotBeyron", RWItems.BeyronIngot);
		OreDictionary.registerOre("materialBeyronSheet", RWItems.BeyronSheet);
		OreDictionary.registerOre("materialFoldedBeyron", RWItems.FoldedBeyron);
		OreDictionary.registerOre("gemSarnaStone", RWItems.SarnaStone);
		OreDictionary.registerOre("gemFuelCore", RWItems.FuelCore);
		OreDictionary.registerOre("materialIncendiusGel", RWItems.IncendiusGel);
		
	}

}
