package com.railways.mod.blocks.rail;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;

public class RWEnergizedTrack extends RWPoweredTrack {
	
	private boolean isActive = false;
	
	public RWEnergizedTrack(String unlocalizedname) {
		super(unlocalizedname);
		this.setDefaultState(this.blockState.getBaseState().withProperty(SHAPE, BlockRailBase.EnumRailDirection.NORTH_SOUTH).withProperty(POWERED, Boolean.valueOf(false)));
	}

    public void onMinecartPass(World world, net.minecraft.entity.item.EntityMinecart cart, BlockPos pos)
    { 
    	if (world.isBlockPowered(pos)){

	     	float railMaxSpeed = 0.5f;
	    	double mX = cart.motionX;
	    	double mZ = cart.motionZ;
	    	double mY = cart.motionY;

	    	if (cart.riddenByEntity != null){
	    		
	    		mX *= 0.75D;
	    		mZ *= 0.75D;
	    	}
	    	
	    	double max = Math.min(0.4f, 0.5F);
   		
	    	mX = MathHelper.clamp_double(mX, -max, max);
	    	mZ = MathHelper.clamp_double(mZ, -max, max);
	    	mY = MathHelper.clamp_double(mY, -max, max);
	    	
	    	cart.addVelocity(mX, mY, mZ);
	    	
    	}
    	
    }

}
