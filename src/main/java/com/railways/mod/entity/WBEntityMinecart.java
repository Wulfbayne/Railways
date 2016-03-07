package com.railways.mod.entity;

import com.railways.mod.blocks.WBBlocks;

import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockRailPowered;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class WBEntityMinecart extends EntityMinecart {

	private static final int[][][] matrix = new int[][][] {{{0, 0, -1}, {0, 0, 1}}, {{ -1, 0, 0}, {1, 0, 0}}, {{ -1, -1, 0}, {1, 0, 0}}, {{ -1, 0, 0}, {1, -1, 0}}, {{0, 0, -1}, {0, -1, 1}}, {{0, -1, -1}, {0, 0, 1}}, {{0, 0, 1}, {1, 0, 0}}, {{0, 0, 1}, { -1, 0, 0}}, {{0, 0, -1}, { -1, 0, 0}}, {{0, 0, -1}, {1, 0, 0}}};
	
	public WBEntityMinecart(World worldIn) {
		super(worldIn);

	}

	@Override
    @SuppressWarnings("incomplete-switch")
    protected void func_180460_a(BlockPos p_180460_1_, IBlockState p_180460_2_)
    {
        this.fallDistance = 0.0F;
        Vec3 vec3 = this.func_70489_a(this.posX, this.posY, this.posZ);
        this.posY = (double)p_180460_1_.getY();
        boolean flag = false;
        boolean flag1 = false;
        BlockRailBase blockrailbase = (BlockRailBase)p_180460_2_.getBlock();

        if (blockrailbase == Blocks.golden_rail)
        {
            flag = ((Boolean)p_180460_2_.getValue(BlockRailPowered.POWERED)).booleanValue();
            flag1 = !flag;
        }
        if (blockrailbase == WBBlocks.EmpoweredTrack)
        {
            flag = ((Boolean)p_180460_2_.getValue(BlockRailPowered.POWERED)).booleanValue();            
            flag1 = !flag;
        }

        double slopeAdjustment = getSlopeAdjustment();
        BlockRailBase.EnumRailDirection blockrailbase$enumraildirection = (BlockRailBase.EnumRailDirection)p_180460_2_.getValue(blockrailbase.getShapeProperty());

        switch (blockrailbase$enumraildirection)
        {
            case ASCENDING_EAST:
                this.motionX -= slopeAdjustment;
                ++this.posY;
                break;
            case ASCENDING_WEST:
                this.motionX += slopeAdjustment;
                ++this.posY;
                break;
            case ASCENDING_NORTH:
                this.motionZ += slopeAdjustment;
                ++this.posY;
                break;
            case ASCENDING_SOUTH:
                this.motionZ -= slopeAdjustment;
                ++this.posY;
        }

        int[][] aint = matrix[blockrailbase$enumraildirection.getMetadata()];
        double d1 = (double)(aint[1][0] - aint[0][0]);
        double d2 = (double)(aint[1][2] - aint[0][2]);
        double d3 = Math.sqrt(d1 * d1 + d2 * d2);
        double d4 = this.motionX * d1 + this.motionZ * d2;

        if (d4 < 0.0D)
        {
            d1 = -d1;
            d2 = -d2;
        }

        double d5 = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);

        if (d5 > 2.0D)
        {
            d5 = 2.0D;
        }

        this.motionX = d5 * d1 / d3;
        this.motionZ = d5 * d2 / d3;

        if (this.riddenByEntity instanceof EntityLivingBase)
        {
            double d6 = (double)((EntityLivingBase)this.riddenByEntity).moveForward;

            if (d6 > 0.0D)
            {
                double d7 = -Math.sin((double)(this.riddenByEntity.rotationYaw * (float)Math.PI / 180.0F));
                double d8 = Math.cos((double)(this.riddenByEntity.rotationYaw * (float)Math.PI / 180.0F));
                double d9 = this.motionX * this.motionX + this.motionZ * this.motionZ;

                if (d9 < 0.01D)
                {
                    this.motionX += d7 * 0.1D;
                    this.motionZ += d8 * 0.1D;
                    flag1 = false;
                }
            }
        }

        if (flag1 && shouldDoRailFunctions())
        {
            double d17 = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);

            if (d17 < 0.03D)
            {
                this.motionX *= 0.0D;
                this.motionY *= 0.0D;
                this.motionZ *= 0.0D;
            }
            else
            {
                this.motionX *= 0.5D;
                this.motionY *= 0.0D;
                this.motionZ *= 0.5D;
            }
        }

        double d18 = 0.0D;
        double d19 = (double)p_180460_1_.getX() + 0.5D + (double)aint[0][0] * 0.5D;
        double d20 = (double)p_180460_1_.getZ() + 0.5D + (double)aint[0][2] * 0.5D;
        double d21 = (double)p_180460_1_.getX() + 0.5D + (double)aint[1][0] * 0.5D;
        double d10 = (double)p_180460_1_.getZ() + 0.5D + (double)aint[1][2] * 0.5D;
        d1 = d21 - d19;
        d2 = d10 - d20;

        if (d1 == 0.0D)
        {
            this.posX = (double)p_180460_1_.getX() + 0.5D;
            d18 = this.posZ - (double)p_180460_1_.getZ();
        }
        else if (d2 == 0.0D)
        {
            this.posZ = (double)p_180460_1_.getZ() + 0.5D;
            d18 = this.posX - (double)p_180460_1_.getX();
        }
        else
        {
            double d11 = this.posX - d19;
            double d12 = this.posZ - d20;
            d18 = (d11 * d1 + d12 * d2) * 2.0D;
        }

        this.posX = d19 + d1 * d18;
        this.posZ = d20 + d2 * d18;
        this.setPosition(this.posX, this.posY, this.posZ);
        this.moveMinecartOnRail(p_180460_1_);

        if (aint[0][1] != 0 && MathHelper.floor_double(this.posX) - p_180460_1_.getX() == aint[0][0] && MathHelper.floor_double(this.posZ) - p_180460_1_.getZ() == aint[0][2])
        {
            this.setPosition(this.posX, this.posY + (double)aint[0][1], this.posZ);
        }
        else if (aint[1][1] != 0 && MathHelper.floor_double(this.posX) - p_180460_1_.getX() == aint[1][0] && MathHelper.floor_double(this.posZ) - p_180460_1_.getZ() == aint[1][2])
        {
            this.setPosition(this.posX, this.posY + (double)aint[1][1], this.posZ);
        }

        this.applyDrag();
        Vec3 vec31 = this.func_70489_a(this.posX, this.posY, this.posZ);

        if (vec31 != null && vec3 != null)
        {
            double d14 = (vec3.yCoord - vec31.yCoord) * 0.05D;
            d5 = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);

            if (d5 > 0.0D)
            {
                this.motionX = this.motionX / d5 * (d5 + d14);
                this.motionZ = this.motionZ / d5 * (d5 + d14);
            }

            this.setPosition(this.posX, vec31.yCoord, this.posZ);
        }

        int j = MathHelper.floor_double(this.posX);
        int i = MathHelper.floor_double(this.posZ);

        if (j != p_180460_1_.getX() || i != p_180460_1_.getZ())
        {
            d5 = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.motionX = d5 * (double)(j - p_180460_1_.getX());
            this.motionZ = d5 * (double)(i - p_180460_1_.getZ());
        }


        if(shouldDoRailFunctions())
        {
            ((BlockRailBase)p_180460_2_.getBlock()).onMinecartPass(worldObj, this, p_180460_1_);
        }

        if (flag && shouldDoRailFunctions())
        {
            double d15 = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);

            if (d15 > 0.01D)
            {
                double d16 = 0.06D;
                this.motionX += this.motionX / d15 * d16;
                this.motionZ += this.motionZ / d15 * d16;
            }
            else if (blockrailbase$enumraildirection == BlockRailBase.EnumRailDirection.EAST_WEST)
            {
                if (this.worldObj.getBlockState(p_180460_1_.west()).getBlock().isNormalCube())
                {
                    this.motionX = 0.02D;
                }
                else if (this.worldObj.getBlockState(p_180460_1_.east()).getBlock().isNormalCube())
                {
                    this.motionX = -0.02D;
                }
            }
            else if (blockrailbase$enumraildirection == BlockRailBase.EnumRailDirection.NORTH_SOUTH)
            {
                if (this.worldObj.getBlockState(p_180460_1_.north()).getBlock().isNormalCube())
                {
                    this.motionZ = 0.02D;
                }
                else if (this.worldObj.getBlockState(p_180460_1_.south()).getBlock().isNormalCube())
                {
                    this.motionZ = -0.02D;
                }
            }
        }
    }

	@Override
	public EnumMinecartType getMinecartType() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
