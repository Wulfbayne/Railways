package com.railways.mod.render;

import com.railways.mod.RWGlobal;
import com.railways.mod.blocks.WBBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class WBBlockRender {

	public static void registerBlockRender(){
		
		// Ores
		regBlock(WBBlocks.BeyronOre);
		
		// Gems
		regBlock(WBBlocks.SarnaOre);
		
		// Nether Ores
		regBlock(WBBlocks.netherBeyronOre);
		
		// Nether Gems
		regBlock(WBBlocks.netherSarnaOre);
		
		// Blocks
		regBlock(WBBlocks.BeyronBlock);
		regBlock(WBBlocks.SarnaBlock);
		
		// Rails
		regBlock(WBBlocks.EmpoweredTrack);
		//regBlock(WBBlocks.EnergizedTrack);
		regBlock(WBBlocks.HardenedTrack);

	}
	
	
	public static void regBlock(Block block){
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0 , new ModelResourceLocation(RWGlobal.MOD_ID + ":"+ block.getUnlocalizedName().substring(5), "inventory"));
		
	}
	
	
}
