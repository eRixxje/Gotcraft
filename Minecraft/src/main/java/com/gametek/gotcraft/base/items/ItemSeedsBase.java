package com.gametek.gotcraft.base.items;

import net.minecraft.block.Block;

import com.gametek.gotcraft.Main;
import com.gametek.gotcraft.init.ModTabs;

public class ItemSeedsBase extends net.minecraft.item.ItemSeeds {
	
	protected String name;
	
	public String getName()
	{
		return name;
	}
	
	public ItemSeedsBase(Block crops, Block soil, String UnlocalizedName) 
	{
		super(crops, soil);
		
		name = UnlocalizedName;
		
		// Set full unlocalized name for lang ref.
		setUnlocalizedName(Main.MODID + "_" + name);
						
		// Add to Gotcraft Tab.
		setCreativeTab(ModTabs.gotcraftTab);
	}
}
