package com.railways.mod.world;

import java.util.Random;

import com.railways.mod.blocks.RWBlocks;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class RWWorldGen implements IWorldGenerator{
	
	// Ores
	public WorldGenerator BeyronOre;
	public WorldGenerator SarnaOre;
	
	// Nether Ores
	public WorldGenerator netherBeyronOre;
	public WorldGenerator netherSarnaOre;
	
	public RWWorldGen(){
		this.BeyronOre = new RWWorldGenMinable(RWBlocks.BeyronOre.getDefaultState(),8);
		this.SarnaOre = new RWWorldGenMinable(RWBlocks.SarnaOre.getDefaultState(),8);
		
		this.netherBeyronOre = new RWWorldGenNetherMinable(RWBlocks.netherBeyronOre.getDefaultState(),8);
		this.netherBeyronOre = new RWWorldGenNetherMinable(RWBlocks.netherBeyronOre.getDefaultState(),8);
	}

	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
			
			switch(world.provider.getDimensionId()) {
			
			case 0: //OverWorld
				this.runGen(this.BeyronOre, world, random, chunkX, chunkZ, 20, 0, 128);
				this.runGen(this.SarnaOre, world, random, chunkX, chunkZ, 20, 0, 128);
				
				break;
				
			case -1: //Nether
				this.runGen(this.netherBeyronOre, world, random, chunkX, chunkZ, 20, 0, 128);
				this.runGen(this.netherSarnaOre, world, random, chunkX, chunkZ, 20, 0, 128);
				
				break;
			
			case 1: //End
				break;
				
			}			
	}
	
	public void runGen(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chanceToSpawn, int minHeight, int maxHeight) {
		
		if(minHeight < 0 ||maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Bad Height for WorldGen");
		
		int heightDiff = maxHeight - minHeight + 1;
		for (int i =0; i < chanceToSpawn; i++) {
			int x = chunkX *16 + random.nextInt(16);
			int y = minHeight + random.nextInt(heightDiff);
			int z = chunkZ * 16 + random.nextInt(16);
			generator.generate(world, random, new BlockPos(x, y, z));
		}
	}	


}
