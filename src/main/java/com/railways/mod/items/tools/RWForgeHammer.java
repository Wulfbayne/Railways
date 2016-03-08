package com.railways.mod.items.tools;

import java.util.Set;

import com.railways.mod.RWGlobal;

import net.minecraft.block.Block;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class RWForgeHammer extends ItemPickaxe {

	public RWForgeHammer(String unlocalizedname,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedname);
		this.setCreativeTab(RWGlobal.rwCreativeTab);
	}

}
