package com.railways.mod.render;

import com.railways.mod.RWGlobal;
import com.railways.mod.blocks.RWBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class RWBlockRender {

	public static void registerBlockRender(){
		
		// Ores
		regBlock(RWBlocks.BeyronOre);
		
		// Gems
		regBlock(RWBlocks.SarnaOre);
		
		// Nether Ores
		regBlock(RWBlocks.netherBeyronOre);
		
		// Nether Gems
		regBlock(RWBlocks.netherSarnaOre);
		
		// Blocks
		regBlock(RWBlocks.BeyronBlock);
		regBlock(RWBlocks.SarnaBlock);
		
		// Rails
		if (RWGlobal.EmpoweredTrackEnabled){
			regBlock(RWBlocks.EmpoweredTrack);
		}
		if (RWGlobal.EnergizedTrackEnabeld){
			regBlock(RWBlocks.EnergizedTrack);
		}
		if (RWGlobal.EndericTrackEnabled){
			regBlock(RWBlocks.EndericTrack);			
		}
		
		regBlock(RWBlocks.HardenedTrack);

	}
	
	
	public static void regBlock(Block block){
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0 , new ModelResourceLocation(RWGlobal.MOD_ID + ":"+ block.getUnlocalizedName().substring(5), "inventory"));
		
	}
	
	
}
