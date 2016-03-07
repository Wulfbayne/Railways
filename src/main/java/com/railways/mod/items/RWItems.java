package com.railways.mod.items;

import com.railways.mod.RWGlobal;
import com.railways.mod.items.armor.RWBeyronArmor;
import com.railways.mod.items.carts.RWHardenedBeyronCart;
import com.railways.mod.items.carts.RWHardenedBeyronChestCart;
import com.railways.mod.items.tools.RWBeyronAxe;
import com.railways.mod.items.tools.RWBeyronHoe;
import com.railways.mod.items.tools.RWBeyronPickaxe;
import com.railways.mod.items.tools.RWBeyronShovel;
import com.railways.mod.items.tools.RWBeyronSword;
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
		GameRegistry.registerItem(BeyronIngot = new RWItem("BeyronIngot"), "BeyronIngot");
		
		// Dust
		GameRegistry.registerItem(BeyronDust = new RWItem("BeyronDust"), "BeyronDust");
		
		// Tools
		GameRegistry.registerItem(BeyronAxe = new RWBeyronAxe("BeyronAxe", BeyronTools), "BeyronAxe");
		GameRegistry.registerItem(BeyronPickaxe = new RWBeyronPickaxe("BeyronPickaxe", BeyronTools), "BeyronPickaxe");
		GameRegistry.registerItem(BeyronSword = new RWBeyronSword("BeyronSword", BeyronTools), "BeyronSword");
		GameRegistry.registerItem(BeyronShovel = new RWBeyronShovel("BeyronShovel", BeyronTools), "BeyronShovel");
		GameRegistry.registerItem(BeyronHoe = new RWBeyronHoe("BeyronHoe", BeyronTools), "BeyronHoe");
		
		GameRegistry.registerItem(SledgeHammer = new RWSledgeHammer("SledgeHammer", RailTools), "SledgeHammer");
		GameRegistry.registerItem(Wrench = new RWWrench("Wrench", RailTools), "Wrench");
		
		// Armor
		GameRegistry.registerItem(BeyronHelmet = new RWBeyronArmor("BeyronHelmet", BeyronArmor, 1, 0), "BeyronHelmet");
		GameRegistry.registerItem(BeyronChestplate = new RWBeyronArmor("BeyronChestplate", BeyronArmor, 1, 1), "BeyronChestplate");
		GameRegistry.registerItem(BeyronLeggings = new RWBeyronArmor("BeyronLeggings", BeyronArmor, 1, 2), "BeyronLeggings");
		GameRegistry.registerItem(BeyronBoots = new RWBeyronArmor("BeyronBoots", BeyronArmor, 1, 3), "BeyronBoots");
				
		// Gems
		GameRegistry.registerItem(SarnaStone = new RWItem("SarnaStone"), "SarnaStone");
		
		// Fuels
		GameRegistry.registerItem(FuelCore = new RWItem("FuelCore"), "FuelCore");
		GameRegistry.registerItem(IncendiusGel = new RWItem("IncendiusGel"), "IncendiusGel");
		
		// Minecarts
		GameRegistry.registerItem(HardenedBeyronCart = new RWHardenedBeyronCart("HardenedBeyronCart", EntityMinecart.EnumMinecartType.RIDEABLE), "HardenedBeyronCart");
		GameRegistry.registerItem(HardenedBeyronChestCart = new RWHardenedBeyronChestCart("HardenedBeyronChestCart", EntityMinecart.EnumMinecartType.CHEST), "HardenedBeyronChestCart");
	}
}
