package com.railways.mod.items.tools;

import com.railways.mod.RWGlobal;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class RWWrench extends ItemPickaxe {

	public RWWrench(String unlocalizedname,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedname);
		this.setCreativeTab(RWGlobal.rwCreativeTab);

	}

}
