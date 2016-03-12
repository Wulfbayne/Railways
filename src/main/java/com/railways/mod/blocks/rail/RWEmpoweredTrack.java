package com.railways.mod.blocks.rail;

import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class RWEmpoweredTrack extends RWPoweredTrack{
	
	public RWEmpoweredTrack(String unlocalizedname,boolean isPowered) {
		super(unlocalizedname);		
	}
	
    public void onMinecartPass(World world, net.minecraft.entity.item.EntityMinecart cart, BlockPos pos)
    { 
    	if (world.isBlockPowered(pos)){

	     	float railMaxSpeed = 0.6f;
	    	double mX = cart.motionX;
	    	double mZ = cart.motionZ;
	    	double mY = cart.motionY;

	    	if (cart.riddenByEntity != null){
	    		
	    		mX *= 0.75D;
	    		mZ *= 0.75D;
	    	}
	    	
	    	double max = Math.min(0.4f, 0.6F);
   		
	    	mX = MathHelper.clamp_double(mX, -max, max);
	    	mZ = MathHelper.clamp_double(mZ, -max, max);
	    	mY = MathHelper.clamp_double(mY, -max, max);
	    	
	    	cart.addVelocity(mX, mY, mZ);
	    	
    	}
    	
    }

	
}
