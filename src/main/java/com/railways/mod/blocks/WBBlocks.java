package com.railways.mod.blocks;


import com.railways.mod.RWGlobal;
import com.railways.mod.blocks.machine.WBOreCrusher;
import com.railways.mod.blocks.rail.WBEmpoweredTrack;
import com.railways.mod.blocks.rail.WBHardenedTrack;
import com.railways.mod.blocks.rail.WBPoweredTrack;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WBBlocks {
	
	// Ores
	public static Block BeyronOre;
	
	//Gems
	public static Block SarnaOre;
	
	// Nether Ores
	public static Block netherBeyronOre;
	
	// Nether Gems
	public static Block netherSarnaOre;
	
	// Blocks
	public static Block BeyronBlock;
	public static Block SarnaBlock;
	
	// Tracks
	public static Block EmpoweredTrack;
	//public static Block EnergizedTrack;
	public static Block HardenedTrack;
	
	// Machines
	public static Block OreCrusherIdle;
	public static Block OreCrusherActive;


	public static void initBlocks(){
		
		// Ores
		GameRegistry.registerBlock(BeyronOre = new WBBlock("BeyronOre", Material.rock, 3, 15), "BeyronOre");
		
		// Nether Ores
		GameRegistry.registerBlock(netherBeyronOre = new WBBlock("netherBeyronOre", Material.rock, 3, 15), "netherBeyronOre");

		// Gems
		GameRegistry.registerBlock(SarnaOre = new WBBlock("SarnaOre", Material.rock, 3, 15), "SarnaOre");
		
		// Nether Gems
		GameRegistry.registerBlock(netherSarnaOre = new WBBlock("netherSarnaOre", Material.rock, 3, 15), "netherSarnaOre");
		
		// Blocks
		GameRegistry.registerBlock(BeyronBlock = new WBBlock("BeyronBlock", Material.iron, 3, 15), "BeyronBlock");
		GameRegistry.registerBlock(SarnaBlock = new WBBlock("SarnaBlock", Material.iron, 3, 15), "SarnaBlock");
		
		// Rail		
		GameRegistry.registerBlock(HardenedTrack = new WBHardenedTrack("HardenedTrack"),"HardenedTrack");
		GameRegistry.registerBlock(EmpoweredTrack = new WBEmpoweredTrack("EmpoweredTrack",true), "EmpoweredTrack");
		
		// Machines
		GameRegistry.registerBlock(OreCrusherIdle = new WBOreCrusher("OreCrusherIdle", false), "OreCrusherIdle");
		GameRegistry.registerBlock(OreCrusherIdle = new WBOreCrusher("OreCrusherActive", true), "OreCrusherActive");
		
		
	}
	
}
