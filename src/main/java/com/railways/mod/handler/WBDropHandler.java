package com.railways.mod.handler;

import java.util.Random;

import com.railways.mod.items.WBItems;
import com.railways.mod.items.tools.WBSledgeHammer;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class WBDropHandler {

	@SubscribeEvent
	public void addEntityDrop(LivingDropsEvent event){
		
		if(event.entity instanceof EntityChicken || event.entity instanceof EntityZombie){
			Random rand = new Random();
			ItemStack itemstack = new ItemStack(WBItems.IncendiusGel, rand.nextInt(1));
			event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX,event.entity.posY,event.entity.posZ, itemstack));
		}
		
	}
	
	@SubscribeEvent
	public void addBlockDrop(HarvestDropsEvent event){
		if(event.state.getBlock() == Blocks.gravel){
			Random rand = new Random();
			
			ItemStack holding = event.harvester.inventory.getStackInSlot(event.harvester.inventory.currentItem);
			
			if (holding != null && holding.getItem() instanceof WBSledgeHammer){
				event.drops.clear();
				event.drops.add(new ItemStack(WBItems.IncendiusGel, rand.nextInt(2)));
			}
		}
	}
	
}
