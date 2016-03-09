package com.railways.mod.items.tools;

import com.railways.mod.RWGlobal;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;

public class RWForgeHammer extends Item {

	public RWForgeHammer(String unlocalizedname) {
		super();
		this.setUnlocalizedName(unlocalizedname);
		this.setCreativeTab(RWGlobal.rwCreativeTab);
		this.setMaxDamage(150);
	}
	
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack)
    {
            return true;
    }
   
    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
       ItemStack cStack = itemStack.copy();
       cStack.setItemDamage(cStack.getItemDamage() + 1);
       cStack.stackSize = 1;
       return cStack;
    }

}
