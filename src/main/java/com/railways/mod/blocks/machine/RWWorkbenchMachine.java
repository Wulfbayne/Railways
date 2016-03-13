package com.railways.mod.blocks.machine;

import com.railways.mod.RWGlobal;
import com.railways.mod.blocks.RWBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.stats.StatList;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;

public class RWWorkbenchMachine extends Block {

	public RWWorkbenchMachine(String unlocalizedname,Material materialIn) {
		super(materialIn);
		this.setUnlocalizedName(unlocalizedname);
		this.setCreativeTab(RWGlobal.rwCreativeTab);
		// TODO Auto-generated constructor stub
	}
	
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if (worldIn.isRemote)
        {
            return true;
        }
        else
        {
            playerIn.displayGui(new RWWorkbenchMachine.InterfaceCraftingTable(worldIn, pos));            
            return true;
        }
    }

    public static class InterfaceCraftingTable implements IInteractionObject
        {
            private final World world;
            private final BlockPos position;

            public InterfaceCraftingTable(World worldIn, BlockPos pos)
            {
                this.world = worldIn;
                this.position = pos;
            }

            /**
             * Get the name of this object. For players this returns their username
             */
            public String getName()
            {
                return null;
            }

            /**
             * Returns true if this thing is named
             */
            public boolean hasCustomName()
            {
                return false;
            }

            /**
             * Get the formatted ChatComponent that will be used for the sender's username in chat
             */
            public IChatComponent getDisplayName()
            {
                return new ChatComponentTranslation(RWBlocks.WorkbenchMachine.getUnlocalizedName() + ".name", new Object[0]);
            }

            public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
            {
                return new ContainerWorkbench(playerInventory, this.world, this.position);
            }

            public String getGuiID()
            {
                return "railways:workbench";
            }
        }

}
