package com.railways.mod.crafting;

import com.railways.mod.blocks.RWBlocks;
import com.railways.mod.items.RWItems;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RWSmelting {

	public static void initSmelting(){
		
		GameRegistry.addSmelting(RWBlocks.BeyronOre, new ItemStack(RWItems.BeyronIngot), 10);
		GameRegistry.addSmelting(RWBlocks.netherBeyronOre, new ItemStack(RWBlocks.BeyronOre, 3), 20);
		GameRegistry.addSmelting(RWBlocks.netherSarnaOre, new ItemStack(RWBlocks.SarnaOre, 3), 20);
		GameRegistry.addSmelting(RWItems.HardenedBeyronClump, new ItemStack(RWItems.HardenedBeyronIngot), 20);
							
	}	
}