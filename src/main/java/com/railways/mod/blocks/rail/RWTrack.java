package com.railways.mod.blocks.rail;

import com.railways.mod.RWGlobal;

import net.minecraft.block.BlockRail;

public class RWTrack extends BlockRail {
	
	public RWTrack(String unlocalizedname){
		super();
		this.setUnlocalizedName(unlocalizedname);	       
        this.setStepSound(soundTypeMetal);
		this.setCreativeTab(RWGlobal.rwCreativeTab);
	}

}
