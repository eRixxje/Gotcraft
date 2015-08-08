package com.gametek.gotcraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import com.gametek.gotcraft.init.ModBlocks;

public class WorldGen implements IWorldGenerator {
	
	private WorldGenerator MinableCopper;
	
	public WorldGen() {
	    this.MinableCopper = new WorldGenMinable(ModBlocks.CopperOre.getDefaultState(), 8);
	}
	
	@Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {   
    
		switch (world.provider.getDimensionId()) {
	    case -1: //Nether

	        break;
	    case 0: //Overworld
	    	this.generateOverworld(world, random, chunkX, chunkZ);
	        break;
	    case 1: //End

	        break;
	    }
	}
	
	private void generateOverworld(World world, Random random, int x, int z)
	{
		this.addOre(MinableCopper, world, random, x, z, 10, 0, 64);
	}
		
	private void addOre(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, new BlockPos(x, y, z));
	    }
	}
}
