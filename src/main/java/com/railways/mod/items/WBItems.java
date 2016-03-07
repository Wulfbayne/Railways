package com.railways.mod.items;

import com.railways.mod.RWGlobal;
import com.railways.mod.items.armor.WBBeyronArmor;
import com.railways.mod.items.carts.WBHardenedBeyronCart;
import com.railways.mod.items.carts.WBHardenedBeyronChestCart;
import com.railways.mod.items.tools.WBBeyronAxe;
import com.railways.mod.items.tools.WBBeyronHoe;
import com.railways.mod.items.tools.WBBeyronPickaxe;
import com.railways.mod.items.tools.WBBeyronShovel;
import com.railways.mod.items.tools.WBBeyronSword;
import com.railways.mod.items.tools.WBSledgeHammer;
import com.railways.mod.items.tools.WBWrench;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WBItems {

	// Ingots
	public static Item BeyronIngot;
	
	// Dusts
	public static Item BeyronDust;
	
	// Gems
	public static Item SarnaStone;
	
	// Tools
	public static ToolMaterial BeyronTools = EnumHelper.addToolMaterial("BeyronTools", 3, 800, 8.0F, 4.0F, 10);
	public static Item BeyronAxe;
	public static Item BeyronPickaxe;
	public static Item BeyronSword;
	public static Item BeyronShovel;
	public static Item BeyronHoe;
	
	public static ToolMaterial RailTools = EnumHelper.addToolMaterial("RailTools", 0, 300, 8.0F, 0.0F, 0);
	public static Item SledgeHammer;
	public static Item Wrench;
	
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
		GameRegistry.registerItem(BeyronIngot = new WBItem("BeyronIngot"), "BeyronIngot");
		
		// Dust
		GameRegistry.registerItem(BeyronDust = new WBItem("BeyronDust"), "BeyronDust");
		
		// Tools
		GameRegistry.registerItem(BeyronAxe = new WBBeyronAxe("BeyronAxe", BeyronTools), "BeyronAxe");
		GameRegistry.registerItem(BeyronPickaxe = new WBBeyronPickaxe("BeyronPickaxe", BeyronTools), "BeyronPickaxe");
		GameRegistry.registerItem(BeyronSword = new WBBeyronSword("BeyronSword", BeyronTools), "BeyronSword");
		GameRegistry.registerItem(BeyronShovel = new WBBeyronShovel("BeyronShovel", BeyronTools), "BeyronShovel");
		GameRegistry.registerItem(BeyronHoe = new WBBeyronHoe("BeyronHoe", BeyronTools), "BeyronHoe");
		
		GameRegistry.registerItem(SledgeHammer = new WBSledgeHammer("SledgeHammer", RailTools), "SledgeHammer");
		GameRegistry.registerItem(Wrench = new WBWrench("Wrench", RailTools), "Wrench");
		
		// Armor
		GameRegistry.registerItem(BeyronHelmet = new WBBeyronArmor("BeyronHelmet", BeyronArmor, 1, 0), "BeyronHelmet");
		GameRegistry.registerItem(BeyronChestplate = new WBBeyronArmor("BeyronChestplate", BeyronArmor, 1, 1), "BeyronChestplate");
		GameRegistry.registerItem(BeyronLeggings = new WBBeyronArmor("BeyronLeggings", BeyronArmor, 1, 2), "BeyronLeggings");
		GameRegistry.registerItem(BeyronBoots = new WBBeyronArmor("BeyronBoots", BeyronArmor, 1, 3), "BeyronBoots");
				
		// Gems
		GameRegistry.registerItem(SarnaStone = new WBItem("SarnaStone"), "SarnaStone");
		
		// Fuels
		GameRegistry.registerItem(FuelCore = new WBItem("FuelCore"), "FuelCore");
		GameRegistry.registerItem(IncendiusGel = new WBItem("IncendiusGel"), "IncendiusGel");
		
		// Minecarts
		GameRegistry.registerItem(HardenedBeyronCart = new WBHardenedBeyronCart("HardenedBeyronCart", EntityMinecart.EnumMinecartType.RIDEABLE), "HardenedBeyronCart");
		GameRegistry.registerItem(HardenedBeyronChestCart = new WBHardenedBeyronChestCart("HardenedBeyronChestCart", EntityMinecart.EnumMinecartType.CHEST), "HardenedBeyronChestCart");
	}
}
