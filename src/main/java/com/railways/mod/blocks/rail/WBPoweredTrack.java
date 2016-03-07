package com.railways.mod.blocks.rail;

import com.railways.mod.RWGlobal;

import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockRailPowered;


public class WBPoweredTrack extends BlockRailPowered {

    protected WBPoweredTrack(String unlocalizedname, boolean isPowered)
    {
        super();
        this.setUnlocalizedName(unlocalizedname);
        this.setCreativeTab(RWGlobal.wbCreativeTab);
        this.setDefaultState(this.blockState.getBaseState().withProperty(SHAPE, BlockRailBase.EnumRailDirection.NORTH_SOUTH).withProperty(POWERED, Boolean.valueOf(false)));
    }
	
}
