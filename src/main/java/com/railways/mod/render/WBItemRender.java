package com.railways.mod.render;

import com.railways.mod.RWGlobal;
import com.railways.mod.items.WBItems;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class WBItemRender {

	public static void registerItemRender(){
		
		// Ingots
		regItem(WBItems.BeyronIngot);
		
		// Dusts
		regItem(WBItems.BeyronDust);
		
		// Gems
		regItem(WBItems.SarnaStone);
		
		// Tools
		regItem(WBItems.BeyronAxe);
		regItem(WBItems.BeyronHoe);
		regItem(WBItems.BeyronPickaxe);
		regItem(WBItems.BeyronShovel);
		regItem(WBItems.BeyronSword);
		regItem(WBItems.SledgeHammer);
		regItem(WBItems.Wrench);
						
		// Armor
		regItem(WBItems.BeyronBoots);
		regItem(WBItems.BeyronChestplate);
		regItem(WBItems.BeyronHelmet);
		regItem(WBItems.BeyronLeggings);
		
		// Fuels
		regItem(WBItems.FuelCore);
		regItem(WBItems.IncendiusGel);
		
		// Minecarts
		regItem(WBItems.HardenedBeyronCart);
		regItem(WBItems.HardenedBeyronChestCart);
		
	}
	
	
	public static void regItem(Item item){
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0 , new ModelResourceLocation(RWGlobal.MOD_ID + ":"+ item.getUnlocalizedName().substring(5), "inventory"));
		
	}

	
}
