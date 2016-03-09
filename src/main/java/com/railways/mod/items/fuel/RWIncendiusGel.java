package com.railways.mod.items.fuel;

import com.railways.mod.RWGlobal;

import net.minecraft.item.Item;

public class RWIncendiusGel extends Item {

	public RWIncendiusGel(String unlocalizedname){
		super();
		
		this.setUnlocalizedName(unlocalizedname);
		this.setCreativeTab(RWGlobal.rwCreativeTab);
		this.setMaxDamage(300);

	}

	
}
