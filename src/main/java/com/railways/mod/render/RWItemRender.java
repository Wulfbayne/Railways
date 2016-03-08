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
		
		// Dusts
		regItem(RWItems.BeyronDust);
		
		// Gems
		regItem(RWItems.SarnaStone);
		
		// Tools
		regItem(RWItems.BeyronAxe);
		regItem(RWItems.BeyronHoe);
		regItem(RWItems.BeyronPickaxe);
		regItem(RWItems.BeyronShovel);
		regItem(RWItems.BeyronSword);
		regItem(RWItems.SledgeHammer);
		regItem(RWItems.Wrench);
						
		// Armor
		regItem(RWItems.BeyronBoots);
		regItem(RWItems.BeyronChestplate);
		regItem(RWItems.BeyronHelmet);
		regItem(RWItems.BeyronLeggings);
		
		// Fuels
		regItem(RWItems.FuelCore);
		regItem(RWItems.IncendiusGel);
		
		// Minecarts
		regItem(RWItems.HardenedBeyronCart);
		regItem(RWItems.HardenedBeyronChestCart);
		
	}
	
	
	public static void regItem(Item item){
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0 , new ModelResourceLocation(RWGlobal.MOD_ID + ":"+ item.getUnlocalizedName().substring(5), "inventory"));
		
	}

	
}