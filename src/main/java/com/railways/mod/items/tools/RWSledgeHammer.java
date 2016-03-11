package com.railways.mod.items.tools;

import java.util.Set;

import com.google.common.collect.Sets;
import com.railways.mod.RWGlobal;
import com.railways.mod.blocks.RWBlocks;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;

public class RWSledgeHammer extends ItemTool {

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {RWBlocks.HardenedTrack,RWBlocks.EmpoweredTrack,RWBlocks.EndericTrack,RWBlocks.EnergizedTrack});

	
	public RWSledgeHammer(String unlocalizedname,ToolMaterial material) {
		super(0.0F, material, EFFECTIVE_ON);
		this.setUnlocalizedName(unlocalizedname);
		this.setCreativeTab(RWGlobal.rwCreativeTab);
	}

}
