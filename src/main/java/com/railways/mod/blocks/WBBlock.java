package com.railways.mod.blocks;

import java.util.Random;

import com.railways.mod.RWGlobal;
import com.railways.mod.items.WBItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class WBBlock extends Block{

	public WBBlock(String unlocalizedName, Material material, float hardness, float resistance){
		
		super(material);
		
		this.setCreativeTab(RWGlobal.rwCreativeTab);
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(hardness);
		this.setResistance(resistance);	
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune){
		
		return this == WBBlocks.SarnaOre ? WBItems.SarnaStone : Item.getItemFromBlock(this);
		
	}
	
	public int quantityDropped(Random rand){
		return this == WBBlocks.SarnaOre ? 1 + rand.nextInt(5) : 1;
	}
	
	
}
