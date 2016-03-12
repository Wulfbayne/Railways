package com.railways.mod.entity;

import net.minecraft.block.BlockRailBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class RWEntityMinecart extends EntityMinecart {
	
	public RWEntityMinecart(World worldIn) {
		super(worldIn);

	}

	@Override
	public EnumMinecartType getMinecartType() {
		// TODO Auto-generated method stub
		return null;
	}
	
    private BlockPos getCurrentRailPosition()
    {
        int x = MathHelper.floor_double(this.posX);
        int y = MathHelper.floor_double(this.posY);
        int z = MathHelper.floor_double(this.posZ);

        if (BlockRailBase.isRailBlock(this.worldObj, new BlockPos(x, y - 1, z))) y--;
        return new BlockPos(x, y, z);
    }
	
	@Override
    public double getMaxSpeed()
    {
        if (!canUseRail()) return getMaximumSpeed();
        BlockPos pos = this.getCurrentRailPosition();
        IBlockState state = this.worldObj.getBlockState(pos);
        if (!BlockRailBase.isRailBlock(state)) return getMaximumSpeed();

        float railMaxSpeed = ((BlockRailBase)state.getBlock()).getRailMaxSpeed(worldObj, this, pos);
        return Math.min(railMaxSpeed, getCurrentCartSpeedCapOnRail());
    }


	@Override
	public void moveMinecartOnRail(BlockPos pos)
    {
        double mX = this.motionX;
        double mZ = this.motionZ;

        if (this.riddenByEntity != null)
        {
            mX *= 0.75D;
            mZ *= 0.75D;
        }

        double max = this.getMaxSpeed();
        mX = MathHelper.clamp_double(mX, -max, max);
        mZ = MathHelper.clamp_double(mZ, -max, max);
        this.moveEntity(mX, 0.0D, mZ);
    }

	
	
}
