package com.railways.mod.blocks.rail;

import com.railways.mod.RWGlobal;

import net.minecraft.block.BlockRail;


public class WBHardenedTrack extends BlockRail {

    public WBHardenedTrack(String unlocalizedname)
    {
        super();
        this.setUnlocalizedName(unlocalizedname);
        this.setCreativeTab(RWGlobal.rwCreativeTab);
        this.setHardness(16.0F);
        this.setResistance(300F);        
        this.setStepSound(soundTypeMetal);
    }
}
