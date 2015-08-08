package com.gametek.gotcraft.init;

import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.gametek.gotcraft.base.blocks.BlockBase;
import com.gametek.gotcraft.base.blocks.BlockCropBase;

public final class ModBlocks {
	
	public static BlockBase 	CopperOre;
	public static BlockBase		CopperBlock;
	
	public static BlockCropBase CornCrop;
	
	public static void CreateBlocks()
	{
		GameRegistry.registerBlock(
				CopperOre = new BlockBase("block_copperore", Material.iron, 3F), 
				"block_copperore");
		
		GameRegistry.registerBlock(
				CopperBlock = new BlockBase("block_copper", Material.rock, 5F), 
				"block_copper");
		
		GameRegistry.registerBlock(
				CornCrop = new BlockCropBase("block_corncrop", ModItems.CornSeeds, ModItems.CornCob), 
				"block_corncrop");
	}
}