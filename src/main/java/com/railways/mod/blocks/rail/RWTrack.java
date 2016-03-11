package com.railways.mod.blocks.rail;

import com.railways.mod.RWGlobal;

import net.minecraft.block.BlockRail;
import net.minecraft.block.state.IBlockState;

public class RWTrack extends BlockRail {
	
	public RWTrack(String unlocalizedname){
		super();
		this.setUnlocalizedName(unlocalizedname);	       
        this.setStepSound(soundTypeMetal);
		this.setCreativeTab(RWGlobal.rwCreativeTab);
		this.setHarvestLevel("pickaxe", 0);
	}
}
