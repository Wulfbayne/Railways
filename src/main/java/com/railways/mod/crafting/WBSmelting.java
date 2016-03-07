package com.railways.mod.crafting;

import com.railways.mod.blocks.WBBlocks;
import com.railways.mod.items.WBItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WBSmelting {

	public static void initSmelting(){
		
		GameRegistry.addSmelting(WBBlocks.BeyronOre, new ItemStack(WBItems.BeyronIngot), 10);
		GameRegistry.addSmelting(WBItems.BeyronDust, new ItemStack(WBItems.BeyronIngot), 10);
		GameRegistry.addSmelting(WBBlocks.netherBeyronOre, new ItemStack(WBBlocks.BeyronOre, 3), 20);
		GameRegistry.addSmelting(WBBlocks.netherSarnaOre, new ItemStack(WBBlocks.SarnaOre, 3), 20);
		
		
	}
	
}
