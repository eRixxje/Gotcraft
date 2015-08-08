package com.gametek.gotcraft.base.items;

import net.minecraft.item.ItemFood;

import com.gametek.gotcraft.Main;
import com.gametek.gotcraft.init.ModTabs;

public class ItemFoodBase extends ItemFood {
	private final String name;
	
	public String getName()
	{
		return name;
	}
	
	public ItemFoodBase(String UnlocalizedName, int Amount, float Saturation)
	{
		super(Amount, Saturation, false);
		
		name = UnlocalizedName;
		
		setUnlocalizedName(Main.MODID + "_" + name);
		
		// Add to Gotcraft Tab.
		setCreativeTab(ModTabs.gotcraftTab);
	}
}