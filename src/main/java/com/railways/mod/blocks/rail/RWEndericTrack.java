package com.railways.mod.blocks.rail;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class RWEndericTrack extends RWPoweredTrack {

	public RWEndericTrack(String unlocalizedname,boolean isPowered) {
		super(unlocalizedname);
		
	}

    public void onMinecartPass(World world, net.minecraft.entity.item.EntityMinecart cart, BlockPos pos)
    { 
    	if (world.isBlockPowered(pos)){

	     	float railMaxSpeed = 0.9f;
	    	double mX = cart.motionX;
	    	double mZ = cart.motionZ;
	    	double mY = cart.motionY;

	    	if (cart.riddenByEntity != null){
	    		
	    		mX *= 0.75D;
	    		mZ *= 0.75D;
	    	}
	    	
	    	double max = Math.min(0.4f, 0.7F);
   		
	    	mX = MathHelper.clamp_double(mX, -max, max);
	    	mZ = MathHelper.clamp_double(mZ, -max, max);
	    	mY = MathHelper.clamp_double(mY, -max, max);
	    	
	    	cart.addVelocity(mX, mY, mZ);
	    	
    	}
    	
    }

    @Override
    public void onNeighborBlockChange(World worldIn, BlockPos pos, IBlockState state, Block neighborBlock)
    {
        BlockRailBase.EnumRailDirection blockrailbase$enumraildirection = (BlockRailBase.EnumRailDirection)state.getValue(this.getShapeProperty());
        if (!worldIn.isRemote)
        {
            boolean var5 = worldIn.isBlockPowered(pos);
            boolean var6 = ((Boolean)state.getValue(POWERED)).booleanValue();
            boolean var7 = neighborBlock.canProvidePower();            

            if (var5 && !var6)
            {            	
                worldIn.setBlockState(pos, state.withProperty(POWERED, Boolean.valueOf(true)), 2);
                worldIn.notifyNeighborsOfStateChange(pos, neighborBlock);
                worldIn.scheduleUpdate(pos, this, this.tickRate(worldIn));
            }
            else if (!var5 && var6)
            {
                worldIn.setBlockState(pos, state.withProperty(POWERED, Boolean.valueOf(false)), 2);
            }
            
            boolean flag = false;

            if (!World.doesBlockHaveSolidTopSurface(worldIn, pos.down()))
            {
                flag = true;
            }

            if (blockrailbase$enumraildirection == BlockRailBase.EnumRailDirection.ASCENDING_EAST && !World.doesBlockHaveSolidTopSurface(worldIn, pos.east()))
            {
                flag = true;
            }
            else if (blockrailbase$enumraildirection == BlockRailBase.EnumRailDirection.ASCENDING_WEST && !World.doesBlockHaveSolidTopSurface(worldIn, pos.west()))
            {
                flag = true;
            }
            else if (blockrailbase$enumraildirection == BlockRailBase.EnumRailDirection.ASCENDING_NORTH && !World.doesBlockHaveSolidTopSurface(worldIn, pos.north()))
            {
                flag = true;
            }
            else if (blockrailbase$enumraildirection == BlockRailBase.EnumRailDirection.ASCENDING_SOUTH && !World.doesBlockHaveSolidTopSurface(worldIn, pos.south()))
            {
                flag = true;
            }

            if (flag)
            {
                this.dropBlockAsItem(worldIn, pos, state, 0);
                worldIn.setBlockToAir(pos);
            }
//            else{
//            	onNeighborChangedInternal(worldIn, pos, state, neighborBlock);
//            }
        }
    
   }

	
}
