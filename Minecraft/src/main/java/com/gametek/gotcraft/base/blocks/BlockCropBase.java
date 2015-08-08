package com.gametek.gotcraft.base.blocks;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

import com.gametek.gotcraft.Main;

public class BlockCropBase extends BlockCrops {
	protected String name;
	
	protected Item dropSeed;
	protected Item dropCrop;
		
	public BlockCropBase(String UnlocalizedName, Item SeedToDrop, Item CropToDrop)
	{
		name = UnlocalizedName;
		dropSeed = SeedToDrop;
		dropCrop = CropToDrop;
		
		// Set full unlocalized name for lang ref.
		setUnlocalizedName(Main.MODID + "_" + name);
		
		// Dont Add to Gotcraft Tab.
		//setCreativeTab(Main.gotcraftTab);
	}
	
	public String getName()
	{
		return name;
	}
	
	@Override
	protected Item getSeed()
	{
		return dropSeed;
	}
	
	@Override
	protected Item getCrop()
	{
		return dropCrop;
	}
}
