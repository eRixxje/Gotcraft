package com.gametek.gotcraft.base.items.tools;

import net.minecraft.item.ItemAxe;

import com.gametek.gotcraft.Main;
import com.gametek.gotcraft.init.ModTabs;

public class ItemAxeBase extends ItemAxe {
	protected String name;
	
	public String getName()
	{
		return name;
	}
	
	public ItemAxeBase(String UnlocalizedName, ToolMaterial material)
	{
		super(material);
		
		name = UnlocalizedName;
		
		// Set full unlocalized name for lang ref.
		setUnlocalizedName(Main.MODID + "_" + name);
		
		// Add to Gotcraft Tab.
		setCreativeTab(ModTabs.gotcraftTab);
	}
}
