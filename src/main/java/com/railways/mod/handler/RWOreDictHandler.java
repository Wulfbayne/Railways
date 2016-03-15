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
		OreDictionary.registerOre("clumpHardenedBeyron", RWItems.HardenedBeyronClump);
		OreDictionary.registerOre("materialBeyronSheet", RWItems.BeyronSheet);
		OreDictionary.registerOre("materialFoldedBeyron", RWItems.FoldedBeyron);

		// Ingots
		OreDictionary.registerOre("ingotBeyron", RWItems.BeyronIngot);
		OreDictionary.registerOre("ingotHardenedBeyron", RWItems.HardenedBeyronIngot);
		OreDictionary.registerOre("ingotEnergizedBeyron", RWItems.EnergizedBeyronIngot);
		OreDictionary.registerOre("ingotEmpoweredBeyron", RWItems.EmpoweredBeyronIngot);
		OreDictionary.registerOre("ingotEndericBeyron", RWItems.EndericBeyronIngot);

		// Rails
		OreDictionary.registerOre("railBeyronRailTie", RWItems.BeyronRailTie);
		OreDictionary.registerOre("railBeyronRailBed", RWItems.BeyronRailBed);
		OreDictionary.registerOre("railBeyronCore", RWItems.BeyronCore);
		OreDictionary.registerOre("railRailFrame", RWItems.RailFrame);
		OreDictionary.registerOre("railHardenedBeyronRailSegment", RWItems.HardenedBeyronRailSegment);
		OreDictionary.registerOre("railEnergizedRailSegment", RWItems.EnergizedRailSegment);
		OreDictionary.registerOre("railEmpoweredRailSegment", RWItems.EmpoweredRailSegment);
		OreDictionary.registerOre("railEndericRailSegment", RWItems.EndericRailSegment);
		OreDictionary.registerOre("railHardenedBeyronRail", RWItems.HardenedBeyronRail);
		OreDictionary.registerOre("railEnergizedRail", RWItems.EnergizedRail);
		OreDictionary.registerOre("railEmpoweredRail", RWItems.EmpoweredRail);
		OreDictionary.registerOre("railEndericRail", RWItems.EndericRail);
		
		// Gems
		OreDictionary.registerOre("gemSarnaStone", RWItems.SarnaStone);
		
		// Fuels
		OreDictionary.registerOre("gemFuelCore", RWItems.FuelCore);
		OreDictionary.registerOre("materialIncendiusGel", RWItems.IncendiusGel);
		
	}

}
