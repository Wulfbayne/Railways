package com.railways.mod.items.armor;

import com.railways.mod.RWGlobal;
import com.railways.mod.items.RWItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class RWHardenedBeyronArmor extends ItemArmor {

	public RWHardenedBeyronArmor(String unlocalizedname, ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		this.setUnlocalizedName(unlocalizedname);
		this.setCreativeTab(RWGlobal.rwCreativeTab);
		
	}

//	@Override
//	public void onArmorTick(World world, EntityPlayer player, ItemStack itemstack){
//		if(itemstack.getItem() == RWItems.HardenedBeyronHelmet){
////			this.effectPlayer(player, Potion.nightVision, 1);
//		}
//		if (itemstack.getItem() == RWItems.HardenedBeyronChestplate){
////			this.effectPlayer(player, Potion.absorption, 1);			
//		}
//		if (itemstack.getItem() == RWItems.HardenedBeyronLeggings){
////			this.effectPlayer(player, Potion.moveSpeed, 1);			
//		}
//		if (itemstack.getItem() == RWItems.HardenedBeyronBoots){
////			this.effectPlayer(player, Potion.jump, 2);			
//		}
//		
//		if(this.isWearingFullSet(player, RWItems.HardenedBeyronHelmet, RWItems.HardenedBeyronChestplate, RWItems.HardenedBeyronLeggings, RWItems.HardenedBeyronBoots) == true){
//			 this.effectPlayer(player, Potion.regeneration, );
//		}
//		
//	}
//	
//	private boolean isWearingFullSet(EntityPlayer player, Item helmet, Item chestplate, Item leggings, Item boots){
//		return player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == helmet
//				&& player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == chestplate
//				&& player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == leggings
//				&& player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == boots;
//	}
//	
//	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier ){
//		if(player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration()<= 1){
//			player.addPotionEffect(new PotionEffect(potion.id, 159, amplifier, true, true));
//		}
//	}	
	
}
