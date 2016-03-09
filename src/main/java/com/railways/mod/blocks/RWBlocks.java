package com.railways.mod.blocks;


import com.railways.mod.RWGlobal;
import com.railways.mod.blocks.machine.RWOreCrusher;
import com.railways.mod.blocks.rail.RWEmpoweredTrack;
import com.railways.mod.blocks.rail.RWEnergizedTrack;
import com.railways.mod.blocks.rail.RWHardenedTrack;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class RWBlocks {
	
	// Ores
	public static Block BeyronOre;
	
	// Gem Ores
 	public static Block SarnaOre;
	
	// Nether Ores
	public static Block netherBeyronOre;
	
	// Nether Gem Ores
	public static Block netherSarnaOre;
	
	// Blocks
	public static Block BeyronBlock;
	public static Block SarnaBlock;
	
	// Tracks
	public static Block EmpoweredTrack;
	public static Block EnergizedTrack;
	public static Block HardenedTrack;
	
	// Machines
	public static Block OreCrusherIdle;
	public static Block OreCrusherActive;

	public static void initBlocks(){
		
		// Ores
		GameRegistry.registerBlock(BeyronOre = new RWBlock("BeyronOre", Material.rock, 3, 15), "BeyronOre");
				
		// Nether Ores
		GameRegistry.registerBlock(netherBeyronOre = new RWBlock("netherBeyronOre", Material.rock, 3, 15), "netherBeyronOre");
		
		// Gem Ores
		GameRegistry.registerBlock(SarnaOre = new RWBlock("SarnaOre", Material.rock, 3, 15), "SarnaOre");
				
		// Nether Gem Ores
		GameRegistry.registerBlock(netherSarnaOre = new RWBlock("netherSarnaOre", Material.rock, 3, 15), "netherSarnaOre");		
		
		// Blocks
		GameRegistry.registerBlock(BeyronBlock = new RWBlock("BeyronBlock", Material.iron, 3, 15), "BeyronBlock");
		GameRegistry.registerBlock(SarnaBlock = new RWBlock("SarnaBlock", Material.iron, 3, 15), "SarnaBlock");
		
		// Rail		
		GameRegistry.registerBlock(HardenedTrack = new RWHardenedTrack("HardenedTrack"),"HardenedTrack");
		if (RWGlobal.EmpoweredTrackEnabled){
			GameRegistry.registerBlock(EmpoweredTrack = new RWEmpoweredTrack("EmpoweredTrack",true), "EmpoweredTrack");
		}
		if (RWGlobal.EnergizedTrackEnabeld){
			GameRegistry.registerBlock(EnergizedTrack = new RWEnergizedTrack("EnergizedTrack", true), "EnergizedTrack");
		}		
		
		// Machines
		if (RWGlobal.OreCrusherEnabled){
			GameRegistry.registerBlock(OreCrusherIdle = new RWOreCrusher("OreCrusherIdle", false), "OreCrusherIdle");
			GameRegistry.registerBlock(OreCrusherIdle = new RWOreCrusher("OreCrusherActive", true), "OreCrusherActive");			
		}
		
		
	}	
}
