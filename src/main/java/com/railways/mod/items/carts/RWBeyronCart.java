package com.railways.mod.items.carts;

import com.railways.mod.RWGlobal;

import net.minecraft.entity.item.EntityMinecart.EnumMinecartType;
import net.minecraft.item.ItemMinecart;
import net.minecraft.util.ResourceLocation;

public class RWBeyronCart extends ItemMinecart {
	
	public RWBeyronCart(String unlocalizedname,EnumMinecartType type) {
		super(type);
		this.setUnlocalizedName(unlocalizedname);
		this.setCreativeTab(RWGlobal.rwCreativeTab);
		this.setMaxStackSize(3);
	}
	
}
