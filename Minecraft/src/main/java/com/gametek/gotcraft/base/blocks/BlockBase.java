package com.gametek.gotcraft.base.blocks;

import java.util.Collection;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;

import com.gametek.gotcraft.Main;
import com.gametek.gotcraft.init.ModTabs;
import com.google.common.collect.ImmutableMap;

public class BlockBase extends net.minecraft.block.Block {

	protected String name;
	
	public String getName()
	{
		return name;
	}
		
	public BlockBase(String UnlocalizedName, Material material, float Hardness)
	{
		super(material);
		
		setHardness(Hardness);
		
		name = UnlocalizedName;
		
		// Set full unlocalized name for lang ref.
		setUnlocalizedName(Main.MODID + "_" + name);
		
		// Add to Gotcraft Tab.
		setCreativeTab(ModTabs.gotcraftTab);
	}
}