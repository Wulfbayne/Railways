package com.railways.mod.crafting;

import com.railways.mod.blocks.RWBlocks;
import com.railways.mod.items.RWItems;

import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;


public class RWRecipes {

	public static void initRecipes(){
			
		GameRegistry.addRecipe(new ShapedOreRecipe(RWBlocks.BeyronBlock,true,
				new Object[] {
						"###",
						"###",
						"###",
						'#', "ingotBeyron"
				}));
		GameRegistry.addRecipe(new ShapedOreRecipe(RWBlocks.SarnaBlock,true,
				new Object[] {
						" ##",
						" ##",
						"   ",
						'#', "gemSarnaStone"
				}));
		GameRegistry.addShapelessRecipe(new ItemStack(RWItems.BeyronIngot, 9),
				new Object[]{
						RWBlocks.BeyronBlock,	
				});
		GameRegistry.addRecipe(new ShapedOreRecipe(RWItems.BeyronAxe,true,
				new Object[] {
						"## ",
						"#S ",
						" S ",
						'#', "ingotBeyron",
						'S', "stickWood",
				}));
		GameRegistry.addRecipe(new ShapedOreRecipe(RWItems.BeyronPickaxe,true,
				new Object[] {
						"###",
						" S ",
						" S ",
						'#', "ingotBeyron",
						'S', "stickWood",
				}));
		GameRegistry.addRecipe(new ShapedOreRecipe(RWItems.BeyronShovel,true,
				new Object[] {
						" # ",
						" S ",
						" S ",
						'#', "ingotBeyron",
						'S', "stickWood",
				}));
		GameRegistry.addRecipe(new ShapedOreRecipe(RWItems.BeyronSword,true,
				new Object[] {
						" # ",
						" # ",
						" S ",
						'#', "ingotBeyron",
						'S', "stickWood",
				}));
		GameRegistry.addRecipe(new ShapedOreRecipe(RWItems.BeyronBoots, true,
				new Object[] {
						"# #",
						"# #",
						"   ",
						'#', "ingotBeyron"
				}));
		GameRegistry.addRecipe(new ShapedOreRecipe(RWItems.BeyronLeggings,true,
				new Object[] {
						"###",
						"# #",
						"# #",
						'#', "ingotBeyron"
				}));
		GameRegistry.addRecipe(new ShapedOreRecipe(RWItems.BeyronHelmet,true,
				new Object[] {
						"###",
						"# #",
						"   ",
						'#', "ingotBeyron"
				}));
		GameRegistry.addRecipe(new ShapedOreRecipe(RWItems.BeyronChestplate,true,
				new Object[] {
						"# #",
						"###",
						"###",
						'#', "ingotBeyron"
				}));
		GameRegistry.addRecipe(new ShapedOreRecipe(RWItems.ForgeHammer,true,
				new Object[] {
						"#S#",
						" S ",
						" S ",
						'#', "ingotBeyron",
						'S', "stickWood",
				}));
		GameRegistry.addRecipe(new ShapedOreRecipe(RWItems.Wrench,true,
				new Object[] {
						"# #",
						" # ",
						"   ",
						'#', "ingotBeyron"
				}));
		GameRegistry.addRecipe(new ShapedOreRecipe(RWItems.SledgeHammer,true,
				new Object[] {
						"#S#",
						"#S ",
						" S ",
						'#', "ingotBeyron"
				}));

		ItemStack ForgeHammerStack = new ItemStack(RWItems.ForgeHammer.setContainerItem(RWItems.ForgeHammer),1,OreDictionary.WILDCARD_VALUE);
		GameRegistry.addRecipe(new ShapelessOreRecipe(RWItems.BeyronSheet, 
				new Object[]{						
						"ingotBeyron",
						ForgeHammerStack,
				}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(RWItems.FoldedBeyron, 
				new Object[]{
						"materialBeyronSheet",
						 ForgeHammerStack,
				}));
		GameRegistry.addRecipe(new ShapedOreRecipe(RWItems.FuelCore,true,
				new Object[] {
						" # ",
						"#D#",
						" # ",
						'#', "materialIncendiusGel",
						'D', "gemSarnaStone",
				}));
		GameRegistry.addRecipe(new ShapedOreRecipe(RWItems.HardenedBeyronIngot,true,
				new Object[] {
						"#D#",
						"D#D",
						"#D#",
						'#', RWItems.FoldedBeyron,
						'D', "gemSarnaStone",
				}));
		GameRegistry.addRecipe(new ShapedOreRecipe(RWItems.BeyronBoots, true,
				new Object[] {
						"# #",
						"# #",
						"   ",
						'#', "ingotBeyron"
				}));
		GameRegistry.addRecipe(new ShapedOreRecipe(RWItems.BeyronLeggings,true,
				new Object[] {
						"###",
						"# #",
						"# #",
						'#', "ingotBeyron"
				}));
		GameRegistry.addRecipe(new ShapedOreRecipe(RWItems.BeyronHelmet,true,
				new Object[] {
						"###",
						"# #",
						"   ",
						'#', "ingotBeyron"
				}));
		GameRegistry.addRecipe(new ShapedOreRecipe(RWItems.BeyronChestplate,true,
				new Object[] {
						"# #",
						"###",
						"###",
						'#', "ingotBeyron"
				}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(RWItems.EnergizedBeyronIngot, 
				new Object[]{
						"ingotBeyron",
						 "dustRedstone",
				}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(RWItems.EmpoweredBeyronIngot, 
				new Object[]{
						"ingotEnergizedBeyron",
						 "dustGlowstone",
				}));
	}
}	
