package com.railways.mod.blocks.rail;

import com.railways.mod.RWGlobal;

import net.minecraft.block.BlockRail;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;


public class RWHardenedTrack extends RWTrack {

    public RWHardenedTrack(String unlocalizedname)
    {
        super(unlocalizedname);
        this.setHardness(16.0F);
        this.setResistance(300F);
        
    }
   
}
