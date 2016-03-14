package com.railways.mod.items;

import com.railways.mod.RWGlobal;
import com.railways.mod.blocks.RWBlocks;
import com.railways.mod.items.armor.RWBeyronArmor;
import com.railways.mod.items.armor.RWHardenedBeyronArmor;
import com.railways.mod.items.carts.RWBeyronCart;
import com.railways.mod.items.carts.RWBeyronFreightCart;
import com.railways.mod.items.fuel.RWFuelCore;
import com.railways.mod.items.fuel.RWIncendiusGel;
import com.railways.mod.items.gems.RWSarnaStone;
import com.railways.mod.items.ingots.RWBeyronIngot;
import com.railways.mod.items.ingots.RWEmpoweredBeyronIngot;
import com.railways.mod.items.ingots.RWEndericBeyronIngot;
import com.railways.mod.items.ingots.RWEnergizedBeyronIngot;
import com.railways.mod.items.ingots.RWHardenedBeyronIngot;
import com.railways.mod.items.metals.RWBeyronSheet;
import com.railways.mod.items.metals.RWFoldedBeyron;
import com.railways.mod.items.metals.RWHardenedBeyronClump;
import com.railways.mod.items.railparts.RWHardenedBeyronRailSegment;
import com.railways.mod.items.railparts.RWBeyronCore;
import com.railways.mod.items.railparts.RWBeyronRailBed;
import com.railways.mod.items.railparts.RWBeyronRailTie;
import com.railways.mod.items.railparts.RWEmpoweredRail;
import com.railways.mod.items.railparts.RWEmpoweredRailSegment;
import com.railways.mod.items.railparts.RWEndericRail;
import com.railways.mod.items.railparts.RWEndericRailSegment;
import com.railways.mod.items.railparts.RWEnergizedRail;
import com.railways.mod.items.railparts.RWEnergizedRailSegemnt;
import com.railways.mod.items.railparts.RWHardenedBeyronRail;
import com.railways.mod.items.railparts.RWRailFrame;
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
	public static Item HardenedBeyronIngot;
	public static Item EnergizedBeyronIngot;
	public static Item EmpoweredBeyronIngot;
	public static Item EndericBeyronIngot;
	public static Item HardenedBeyronClump;
	
	// Tools
	public static ToolMaterial BeyronTools = EnumHelper.addToolMaterial("BeyronTools", 2, 800, 8.0F, 4.0F, 10);
	public static Item BeyronAxe;
	public static Item BeyronPickaxe;
	public static Item BeyronSword;
	public static Item BeyronShovel;
	public static Item BeyronHoe;
	
	public static ToolMaterial RailTools = EnumHelper.addToolMaterial("RailTools", 0, 300, 16.0F, 0.0F, 0);
	public static Item SledgeHammer;
	public static Item Wrench;
	public static Item ForgeHammer;
	
	// Tier 1 Armor
	public static ArmorMaterial BeyronArmor = EnumHelper.addArmorMaterial("BeyronArmor", RWGlobal.MOD_ID + ":"+ "beyron", 22, new int[]{2, 6, 5, 2}, 30);
	public static Item BeyronHelmet;
	public static Item BeyronChestplate;
	public static Item BeyronLeggings;
	public static Item BeyronBoots;
	
	// Tier 2 Armor
	public static ArmorMaterial HardenedBeyronArmor = EnumHelper.addArmorMaterial("HardenedBeyronArmor", RWGlobal.MOD_ID + ":"+ "hardenedbeyron", 32, new int[]{4, 8, 7, 4}, 46);
	public static Item HardenedBeyronHelmet;
	public static Item HardenedBeyronChestplate;
	public static Item HardenedBeyronLeggings;
	public static Item HardenedBeyronBoots;

	// Fuels
	public static Item FuelCore;
	public static Item IncendiusGel;
	
	// Rail Components
	public static Item RailFrame;
	public static Item BeyronRailTie;
	public static Item HardenedBeyronRailSegment;
	public static Item EnergizedRailSegment;
	public static Item EmpoweredRailSegment;
	public static Item EndericRailSegment;
	public static Item BeyronCore;
	public static Item BeyronRailBed;
	public static Item HardenedBeyronRail;
	public static Item EnergizedRail;
	public static Item EmpoweredRail;
	public static Item EndericRail;
	
	// Minecarts
	public static Item BeyronCart;
	public static Item BeyronFreightCart;
	
	public static void initItems(){
		
		// Ores
		GameRegistry.registerItem(BeyronIngot = new RWBeyronIngot("BeyronIngot"), "BeyronIngot");
		GameRegistry.registerItem(HardenedBeyronIngot = new RWHardenedBeyronIngot("HardenedBeyronIngot"), "HardenedBeyronIngot");
		GameRegistry.registerItem(EnergizedBeyronIngot = new RWEnergizedBeyronIngot("EnergizedBeyronIngot"), "EnergizedBeyronIngot");
		GameRegistry.registerItem(EmpoweredBeyronIngot = new RWEmpoweredBeyronIngot("EmpoweredBeyronIngot"), "EmpoweredBeyronIngot");
		GameRegistry.registerItem(EndericBeyronIngot = new RWEndericBeyronIngot("EndericBeyronIngot"), "EndericBeyronIngot");
		
		// Metals
		GameRegistry.registerItem(FoldedBeyron = new RWFoldedBeyron("FoldedBeyron"), "FoldedBeyron");
		GameRegistry.registerItem(BeyronSheet = new RWBeyronSheet("BeyronSheet"), "BeyronSheet");
		GameRegistry.registerItem(HardenedBeyronClump = new RWHardenedBeyronClump("HardenedBeyronClump"), "HardenedBeyronClump");
		
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
		
		GameRegistry.registerItem(HardenedBeyronHelmet = new RWHardenedBeyronArmor("HardenedBeyronHelmet", HardenedBeyronArmor, 1, 0), "HardenedBeyronHelmet");
		GameRegistry.registerItem(HardenedBeyronChestplate = new RWHardenedBeyronArmor("HardenedBeyronChestplate", HardenedBeyronArmor, 1, 1), "HardenedBeyronChestplate");
		GameRegistry.registerItem(HardenedBeyronLeggings = new RWHardenedBeyronArmor("HardenedBeyronLeggings", HardenedBeyronArmor, 1, 2), "HardenedBeyronLeggings");
		GameRegistry.registerItem(HardenedBeyronBoots = new RWHardenedBeyronArmor("HardenedBeyronBoots", HardenedBeyronArmor, 1, 3), "HardenedBeyronBoots");
				
		// Gems
		GameRegistry.registerItem(SarnaStone = new RWSarnaStone("SarnaStone"), "SarnaStone");
		
		// Fuels
		GameRegistry.registerItem(FuelCore = new RWFuelCore("FuelCore"), "FuelCore");
		GameRegistry.registerItem(IncendiusGel = new RWIncendiusGel("IncendiusGel"), "IncendiusGel");
		
		// Minecarts
		if (RWGlobal.BeyronCartEnabled){
			GameRegistry.registerItem(BeyronCart = new RWBeyronCart("BeyronCart", EntityMinecart.EnumMinecartType.RIDEABLE), "BeyronCart");
		}
		if (RWGlobal.BeyronFreightCartEnabled){
			GameRegistry.registerItem(BeyronFreightCart = new RWBeyronFreightCart("BeyronFreightCart", EntityMinecart.EnumMinecartType.CHEST), "BeyronFreightCart");
		}
		
//		// Rail Components
		GameRegistry.registerItem(RailFrame = new RWRailFrame("RailFrame"), "RailFrame");
		GameRegistry.registerItem(BeyronRailTie = new RWBeyronRailTie("BeyronRailTie"), "BeyronRailTie");
		GameRegistry.registerItem(HardenedBeyronRailSegment = new RWHardenedBeyronRailSegment("HardenedBeyronRailSegment"), "HardenedBeyronRailSegment");
		GameRegistry.registerItem(EnergizedRailSegment = new RWEnergizedRailSegemnt("EnergizedRailSegment"), "EnergizedRailSegment");
		GameRegistry.registerItem(EmpoweredRailSegment = new RWEmpoweredRailSegment("EmpoweredRailSegment"), "EmpoweredRailSegment");
		GameRegistry.registerItem(EndericRailSegment = new RWEndericRailSegment("EndericRailSegment"), "EndericRailSegment");
		GameRegistry.registerItem(BeyronCore = new RWBeyronCore("BeyronCore"), "BeyronCore");
		GameRegistry.registerItem(BeyronRailBed = new RWBeyronRailBed("BeyronRailBed"),"BeyronRailBed");
		GameRegistry.registerItem(HardenedBeyronRail = new RWHardenedBeyronRail("HardenedBeyronRail"), "HardenedBeyronRail");
		GameRegistry.registerItem(EmpoweredRail = new RWEmpoweredRail("EmpoweredRail"), "EmpoweredRail");
		GameRegistry.registerItem(EnergizedRail = new RWEnergizedRail("EnergizedRail"), "EnergizedRail");
		GameRegistry.registerItem(EndericRail = new RWEndericRail("EndericRail"), "EndericRail");

		
	}
}
