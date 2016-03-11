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

		// Ingots
		OreDictionary.registerOre("ingotBeyron", RWItems.BeyronIngot);
		OreDictionary.registerOre("ingotHardenedBeyron", RWItems.HardenedBeyronIngot);
		OreDictionary.registerOre("ingotEnergizedBeyron", RWItems.EnergizedBeyronIngot);
		OreDictionary.registerOre("ingotEmpoweredBeyron", RWItems.EmpoweredBeyronIngot);
		OreDictionary.registerOre("ingotEndericBeyron", RWItems.EndericBeyronIngot);

		// Extraneous Metals
		OreDictionary.registerOre("materialBeyronSheet", RWItems.BeyronSheet);
		OreDictionary.registerOre("materialFoldedBeyron", RWItems.FoldedBeyron);
		
		// Gems
		OreDictionary.registerOre("gemSarnaStone", RWItems.SarnaStone);
		
		// Fuels
		OreDictionary.registerOre("gemFuelCore", RWItems.FuelCore);
		OreDictionary.registerOre("materialIncendiusGel", RWItems.IncendiusGel);
		
	}

}
