package com.railways.mod.blocks.machine;

import com.railways.mod.RWGlobal;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class RWOreCrusher extends BlockContainer {

	private final boolean isActive;
	
	public RWOreCrusher(String unlocalizedname, boolean isActive) {
		super(Material.iron);
		this.setUnlocalizedName(unlocalizedname);
		this.setCreativeTab(RWGlobal.rwCreativeTab);
		this.isActive = isActive;		

	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
