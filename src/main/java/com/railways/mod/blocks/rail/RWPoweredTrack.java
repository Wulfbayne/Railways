package com.railways.mod.blocks.rail;

import com.railways.mod.RWGlobal;

import net.minecraft.block.BlockRailPowered;


public class RWPoweredTrack extends BlockRailPowered {

    protected RWPoweredTrack(String unlocalizedname)
    {
        super();
        this.setUnlocalizedName(unlocalizedname);
        this.setCreativeTab(RWGlobal.rwCreativeTab);
    }
	
}
