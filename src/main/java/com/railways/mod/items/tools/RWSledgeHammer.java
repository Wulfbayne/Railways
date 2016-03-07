package com.railways.mod.items.tools;

import com.railways.mod.RWGlobal;

import net.minecraft.item.ItemPickaxe;

public class RWSledgeHammer extends ItemPickaxe {

	public RWSledgeHammer(String unlocalizedname,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedname);
		this.setCreativeTab(RWGlobal.rwCreativeTab);

	}

}
