package com.railways.mod.render;

import com.railways.mod.RWGlobal;
import com.railways.mod.items.RWItems;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class RWItemRender {

	public static void registerItemRender(){
		
		// Ingots
		regItem(RWItems.BeyronIngot);
		
		// Gems
		regItem(RWItems.SarnaStone);
		
		// Tools
		regItem(RWItems.BeyronAxe);
		regItem(RWItems.BeyronHoe);
		regItem(RWItems.BeyronPickaxe);
		regItem(RWItems.BeyronShovel);
		regItem(RWItems.BeyronSword);
		
		// Rail Tools
		regItem(RWItems.SledgeHammer);
		regItem(RWItems.Wrench);
		regItem(RWItems.ForgeHammer);
		
		// Metals
		regItem(RWItems.BeyronSheet);
		regItem(RWItems.FoldedBeyron);
		regItem(RWItems.HardenedBeyronIngot);
		regItem(RWItems.EnergizedBeyronIngot);
		regItem(RWItems.EmpoweredBeyronIngot);
		regItem(RWItems.EndericBeyronIngot);
		regItem(RWItems.HardenedBeyronClump);
		
		// Tier 1 Armor
		regItem(RWItems.BeyronBoots);
		regItem(RWItems.BeyronChestplate);
		regItem(RWItems.BeyronHelmet);
		regItem(RWItems.BeyronLeggings);
		
		// Tier 2 Armor
		regItem(RWItems.HardenedBeyronBoots);
		regItem(RWItems.HardenedBeyronChestplate);
		regItem(RWItems.HardenedBeyronHelmet);
		regItem(RWItems.HardenedBeyronLeggings);

		// Track Materials
		regItem(RWItems.BeyronCore);
		
		regItem(RWItems.BeyronRailBed);
		regItem(RWItems.BeyronRailTie);
		regItem(RWItems.EmpoweredRail);
		regItem(RWItems.EmpoweredRailSegment);
		regItem(RWItems.EndericRail);
		regItem(RWItems.EndericRailSegment);
		regItem(RWItems.EnergizedRail);
		regItem(RWItems.EnergizedRailSegment);
		regItem(RWItems.HardenedBeyronRail);
		regItem(RWItems.HardenedBeyronRailSegment);
		regItem(RWItems.RailFrame);
				
		// Fuels
		regItem(RWItems.FuelCore);
		regItem(RWItems.IncendiusGel);
		
		// Minecarts
		if (RWGlobal.BeyronCartEnabled){
			regItem(RWItems.BeyronCart);			
		}
		if (RWGlobal.BeyronFreightCartEnabled){
			regItem(RWItems.BeyronFreightCart);
		}
		
		
	}
	
	
	public static void regItem(Item item){
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0 , new ModelResourceLocation(RWGlobal.MOD_ID + ":"+ item.getUnlocalizedName().substring(5), "inventory"));
		
	}

	
}
