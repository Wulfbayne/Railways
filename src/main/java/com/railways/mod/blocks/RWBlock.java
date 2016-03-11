package com.railways.mod.blocks;

import java.util.Random;

import com.railways.mod.RWGlobal;
import com.railways.mod.items.RWItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RWBlock extends Block{

	public RWBlock(String unlocalizedName, Material material, float hardness, float resistance){
		
		super(material);
		
		this.setCreativeTab(RWGlobal.rwCreativeTab);
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(hardness);
		this.setResistance(resistance);	
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune){
		
		return this == RWBlocks.SarnaOre ? RWItems.SarnaStone : Item.getItemFromBlock(this);
		
	}
	
	public int quantityDropped(Random rand){
		return this == RWBlocks.SarnaOre ? 1 + rand.nextInt(5) : 1;
	}
	
	@Override
    public boolean isToolEffective(String type, IBlockState state)
    {
        if ("pickaxe".equals(type) && (this == net.minecraft.init.Blocks.redstone_ore || this == net.minecraft.init.Blocks.lit_redstone_ore || this == net.minecraft.init.Blocks.obsidian))
            return false;
        return type != null && type.equals(getHarvestTool(state));
    }

	
}
