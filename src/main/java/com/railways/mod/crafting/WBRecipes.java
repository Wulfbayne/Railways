package com.railways.mod.crafting;

import com.railways.mod.blocks.WBBlocks;
import com.railways.mod.items.WBItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WBRecipes {

	public static void initRecipes(){
		
		GameRegistry.addRecipe(new ItemStack(WBBlocks.BeyronBlock),
				new Object[] {
						"###",
						"###",
						"###",
						'#', WBItems.BeyronIngot
				});
		GameRegistry.addRecipe(new ItemStack(WBBlocks.SarnaBlock),
				new Object[] {
						" ##",
						" ##",
						"   ",
						'#', WBItems.SarnaStone
				});

		GameRegistry.addShapelessRecipe(new ItemStack(WBItems.BeyronIngot, 9),
				new Object[]{
					WBBlocks.BeyronBlock	
				});
		GameRegistry.addRecipe(new ItemStack(WBItems.BeyronAxe),
				new Object[] {
						"## ",
						"#S ",
						" S ",
						'#', WBItems.BeyronIngot,
						'S', Items.stick,
				});
		GameRegistry.addRecipe(new ItemStack(WBItems.BeyronPickaxe),
				new Object[] {
						"###",
						" S ",
						" S ",
						'#', WBItems.BeyronIngot,
						'S', Items.stick,
				});
		GameRegistry.addRecipe(new ItemStack(WBItems.BeyronShovel),
				new Object[] {
						" # ",
						" S ",
						" S ",
						'#', WBItems.BeyronIngot,
						'S', Items.stick,
				});
		GameRegistry.addRecipe(new ItemStack(WBItems.BeyronSword),
				new Object[] {
						" # ",
						" # ",
						" S ",
						'#', WBItems.BeyronIngot,
						'S', Items.stick,
				});
		GameRegistry.addRecipe(new ItemStack(WBItems.BeyronBoots),
				new Object[] {
						"# #",
						"# #",
						"   ",
						'#', WBItems.BeyronIngot
				});
		GameRegistry.addRecipe(new ItemStack(WBItems.BeyronLeggings),
				new Object[] {
						"###",
						"# #",
						"# #",
						'#', WBItems.BeyronIngot
				});
		GameRegistry.addRecipe(new ItemStack(WBItems.BeyronHelmet),
				new Object[] {
						"###",
						"# #",
						"   ",
						'#', WBItems.BeyronIngot
				});
		GameRegistry.addRecipe(new ItemStack(WBItems.BeyronChestplate),
				new Object[] {
						"# #",
						"###",
						"###",
						'#', WBItems.BeyronIngot
				});




	}
	
}
