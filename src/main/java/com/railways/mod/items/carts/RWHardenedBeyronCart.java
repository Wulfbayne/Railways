package com.railways.mod.items.carts;

import com.railways.mod.RWGlobal;

import net.minecraft.entity.item.EntityMinecart.EnumMinecartType;
import net.minecraft.item.ItemMinecart;
import net.minecraft.util.ResourceLocation;

public class RWHardenedBeyronCart extends ItemMinecart {
	
	public RWHardenedBeyronCart(String unlocalizedname,EnumMinecartType type) {
		super(type);
		this.setUnlocalizedName(unlocalizedname);
		this.setCreativeTab(RWGlobal.rwCreativeTab);
		this.setMaxStackSize(3);
	}
	
}
