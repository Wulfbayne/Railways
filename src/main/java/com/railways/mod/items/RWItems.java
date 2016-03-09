package com.railways.mod.items;

import com.railways.mod.RWGlobal;
import com.railways.mod.items.armor.RWBeyronArmor;
import com.railways.mod.items.carts.RWHardenedBeyronCart;
import com.railways.mod.items.carts.RWHardenedBeyronChestCart;
import com.railways.mod.items.fuel.RWFuelCore;
import com.railways.mod.items.fuel.RWIncendiusGel;
import com.railways.mod.items.gems.RWSarnaStone;
import com.railways.mod.items.ingots.RWBeyronIngot;
import com.railways.mod.items.metals.RWBeyronSheet;
import com.railways.mod.items.metals.RWFoldedBeyron;
import com.railways.mod.items.tools.RWBeyronAxe;
import com.railways.mod.items.tools.RWBeyronHoe;
import com.railways.mod.items.tools.RWBeyronPickaxe;
import com.railways.mod.items.tools.RWBeyronShovel;
import com.railways.mod.items.tools.RWBeyronSword;
import com.railways.mod.items.tools.RWForgeHammer;
import com.railways.mod.items.tools.RWSledgeHammer;
import com.railways.mod.items.tools.RWWrench;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RWItems {

	// Ingots
	public static Item BeyronIngot;
	
	// Gems
	public static Item SarnaStone;
	
	// Metals
	public static Item FoldedBeyron;
	public static Item BeyronSheet;
	
	// Tools
	public static ToolMaterial BeyronTools = EnumHelper.addToolMaterial("BeyronTools", 2, 800, 8.0F, 4.0F, 10);
	public static Item BeyronAxe;
	public static Item BeyronPickaxe;
	public static Item BeyronSword;
	public static Item BeyronShovel;
	public static Item BeyronHoe;
	
	public static ToolMaterial RailTools = EnumHelper.addToolMaterial("RailTools", 0, 300, 0.0F, 0.0F, 0);
	public static Item SledgeHammer;
	public static Item Wrench;
	public static Item ForgeHammer;
	
	// Armor
	public static ArmorMaterial BeyronArmor = EnumHelper.addArmorMaterial("BeyronArmor", RWGlobal.MOD_ID + ":"+ "beyron", 22, new int[]{2, 6, 5, 2}, 30);
	public static Item BeyronHelmet;
	public static Item BeyronChestplate;
	public static Item BeyronLeggings;
	public static Item BeyronBoots;
			
	// Fuels
	public static Item FuelCore;
	public static Item IncendiusGel;
	
	// Minecarts
	public static Item HardenedBeyronCart;
	public static Item HardenedBeyronChestCart;
	
	public static void initItems(){
		
		// Ores
		GameRegistry.registerItem(BeyronIngot = new RWBeyronIngot("BeyronIngot"), "BeyronIngot");
		
		// Metals
		GameRegistry.registerItem(FoldedBeyron = new RWFoldedBeyron("FoldedBeyron"), "FoldedBeyron");
		GameRegistry.registerItem(BeyronSheet = new RWBeyronSheet("BeyronSheet"), "BeyronSheet");
		
		// Tools
		GameRegistry.registerItem(BeyronAxe = new RWBeyronAxe("BeyronAxe", BeyronTools), "BeyronAxe");
		GameRegistry.registerItem(BeyronPickaxe = new RWBeyronPickaxe("BeyronPickaxe", BeyronTools), "BeyronPickaxe");
		GameRegistry.registerItem(BeyronSword = new RWBeyronSword("BeyronSword", BeyronTools), "BeyronSword");
		GameRegistry.registerItem(BeyronShovel = new RWBeyronShovel("BeyronShovel", BeyronTools), "BeyronShovel");
		GameRegistry.registerItem(BeyronHoe = new RWBeyronHoe("BeyronHoe", BeyronTools), "BeyronHoe");
		
		GameRegistry.registerItem(SledgeHammer = new RWSledgeHammer("SledgeHammer", RailTools), "SledgeHammer");
		GameRegistry.registerItem(Wrench = new RWWrench("Wrench", RailTools), "Wrench");
		GameRegistry.registerItem(ForgeHammer = new RWForgeHammer("ForgeHammer"), "ForgeHammer");
		
		// Armor
		GameRegistry.registerItem(BeyronHelmet = new RWBeyronArmor("BeyronHelmet", BeyronArmor, 1, 0), "BeyronHelmet");
		GameRegistry.registerItem(BeyronChestplate = new RWBeyronArmor("BeyronChestplate", BeyronArmor, 1, 1), "BeyronChestplate");
		GameRegistry.registerItem(BeyronLeggings = new RWBeyronArmor("BeyronLeggings", BeyronArmor, 1, 2), "BeyronLeggings");
		GameRegistry.registerItem(BeyronBoots = new RWBeyronArmor("BeyronBoots", BeyronArmor, 1, 3), "BeyronBoots");
				
		// Gems
		GameRegistry.registerItem(SarnaStone = new RWSarnaStone("SarnaStone"), "SarnaStone");
		
		// Fuels
		GameRegistry.registerItem(FuelCore = new RWFuelCore("FuelCore"), "FuelCore");
		GameRegistry.registerItem(IncendiusGel = new RWIncendiusGel("IncendiusGel"), "IncendiusGel");
		
		// Minecarts
		GameRegistry.registerItem(HardenedBeyronCart = new RWHardenedBeyronCart("HardenedBeyronCart", EntityMinecart.EnumMinecartType.RIDEABLE), "HardenedBeyronCart");
		GameRegistry.registerItem(HardenedBeyronChestCart = new RWHardenedBeyronChestCart("HardenedBeyronChestCart", EntityMinecart.EnumMinecartType.CHEST), "HardenedBeyronChestCart");
	}
}
