package com.railways.mod.items.armor;

import com.railways.mod.RWGlobal;
import com.railways.mod.items.WBItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class WBBeyronArmor extends ItemArmor{

	public WBBeyronArmor(String unlocalizedname, ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		this.setUnlocalizedName(unlocalizedname);
		this.setCreativeTab(RWGlobal.wbCreativeTab);
		
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemstack){
		if(itemstack.getItem() == WBItems.BeyronHelmet){
//			this.effectPlayer(player, Potion.nightVision, 1);
		}
		if (itemstack.getItem() == WBItems.BeyronChestplate){
//			this.effectPlayer(player, Potion.absorption, 1);			
		}
		if (itemstack.getItem() == WBItems.BeyronLeggings){
//			this.effectPlayer(player, Potion.moveSpeed, 1);			
		}
		if (itemstack.getItem() == WBItems.BeyronBoots){
//			this.effectPlayer(player, Potion.jump, 2);			
		}
		
		if(this.isWearingFullSet(player, WBItems.BeyronHelmet, WBItems.BeyronChestplate, WBItems.BeyronLeggings, WBItems.BeyronBoots) == true){
			 this.effectPlayer(player, Potion.regeneration, 1);
		}
		
	}
	
	private boolean isWearingFullSet(EntityPlayer player, Item helmet, Item chestplate, Item leggings, Item boots){
		return player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == helmet
				&& player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == chestplate
				&& player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == leggings
				&& player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == boots;
	}
	
	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier ){
		if(player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration()<= 1){
			player.addPotionEffect(new PotionEffect(potion.id, 159, amplifier, true, true));
		}
	}
	
}
