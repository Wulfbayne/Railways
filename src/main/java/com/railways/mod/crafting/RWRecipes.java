package com.railways.mod.crafting;

import com.railways.mod.blocks.RWBlocks;
import com.railways.mod.items.RWItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class RWRecipes {

	public static void initRecipes(){
		
		GameRegistry.addRecipe(new ItemStack(RWBlocks.BeyronBlock),
				new Object[] {
						"###",
						"###",
						"###",
						'#', RWItems.BeyronIngot
				});
		GameRegistry.addRecipe(new ItemStack(RWBlocks.SarnaBlock),
				new Object[] {
						" ##",
						" ##",
						"   ",
						'#', RWItems.SarnaStone
				});

		GameRegistry.addShapelessRecipe(new ItemStack(RWItems.BeyronIngot, 9),
				new Object[]{
					RWBlocks.BeyronBlock	
				});
		GameRegistry.addRecipe(new ItemStack(RWItems.BeyronAxe),
				new Object[] {
						"## ",
						"#S ",
						" S ",
						'#', RWItems.BeyronIngot,
						'S', Items.stick,
				});
		GameRegistry.addRecipe(new ItemStack(RWItems.BeyronPickaxe),
				new Object[] {
						"###",
						" S ",
						" S ",
						'#', RWItems.BeyronIngot,
						'S', Items.stick,
				});
		GameRegistry.addRecipe(new ItemStack(RWItems.BeyronShovel),
				new Object[] {
						" # ",
						" S ",
						" S ",
						'#', RWItems.BeyronIngot,
						'S', Items.stick,
				});
		GameRegistry.addRecipe(new ItemStack(RWItems.BeyronSword),
				new Object[] {
						" # ",
						" # ",
						" S ",
						'#', RWItems.BeyronIngot,
						'S', Items.stick,
				});
		GameRegistry.addRecipe(new ItemStack(RWItems.BeyronBoots),
				new Object[] {
						"# #",
						"# #",
						"   ",
						'#', RWItems.BeyronIngot
				});
		GameRegistry.addRecipe(new ItemStack(RWItems.BeyronLeggings),
				new Object[] {
						"###",
						"# #",
						"# #",
						'#', RWItems.BeyronIngot
				});
		GameRegistry.addRecipe(new ItemStack(RWItems.BeyronHelmet),
				new Object[] {
						"###",
						"# #",
						"   ",
						'#', RWItems.BeyronIngot
				});
		GameRegistry.addRecipe(new ItemStack(RWItems.BeyronChestplate),
				new Object[] {
						"# #",
						"###",
						"###",
						'#', RWItems.BeyronIngot
				});
		GameRegistry.addRecipe(new ItemStack(RWItems.ForgeHammer),
				new Object[] {
						"#S#",
						" S ",
						" S ",
						'#', RWItems.BeyronIngot,
						'S', Items.stick,
				});
		GameRegistry.addRecipe(new ItemStack(RWItems.Wrench),
				new Object[] {
						"# #",
						" # ",
						"   ",
						'#', RWItems.BeyronIngot
				});
		GameRegistry.addRecipe(new ItemStack(RWItems.SledgeHammer),
				new Object[] {
						"#S#",
						"#S ",
						" S ",
						'#', RWItems.BeyronIngot
				});

		ItemStack ForgeHammerStack = new ItemStack(RWItems.ForgeHammer.setContainerItem(RWItems.ForgeHammer),1,OreDictionary.WILDCARD_VALUE);
		GameRegistry.addShapelessRecipe(new ItemStack(RWItems.BeyronSheet), 
				new Object[]{						
						RWItems.BeyronIngot,
						ForgeHammerStack,
				});
		GameRegistry.addShapelessRecipe(new ItemStack(RWItems.FoldedBeyron), 
				new Object[]{
						 RWItems.BeyronSheet,
						 ForgeHammerStack,
				});				




	}
	
}
