package com.gametek.gotcraft.base.items;

import com.gametek.gotcraft.Main;
import com.gametek.gotcraft.init.ModTabs;

public class ItemBase extends net.minecraft.item.Item {
	
	protected String name;
	
	public String getName()
	{
		return name;
	}
	
	public ItemBase(String UnlocalizedName)
	{
		name = UnlocalizedName;
		
		// Set full unlocalized name for lang ref.
		setUnlocalizedName(Main.MODID + "_" + name);
		
		// Add to Gotcraft Tab.
		setCreativeTab(ModTabs.gotcraftTab);
	}
}
