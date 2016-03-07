package com.railways.mod.blocks.rail;

import com.railways.mod.RWGlobal;

import net.minecraft.block.BlockRail;


public class RWHardenedTrack extends RWTrack {

    public RWHardenedTrack(String unlocalizedname)
    {
        super(unlocalizedname);
        this.setHardness(16.0F);
        this.setResistance(300F); 
    }
}
