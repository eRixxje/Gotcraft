package com.gametek.gotcraft.base.items;

import net.minecraft.item.ItemSword;

import com.gametek.gotcraft.Main;
import com.gametek.gotcraft.init.ModTabs;

public class ItemSwordBase extends ItemSword {
	
	protected String name;
	
	public String getName()
	{
		return name;
	}
	
	public ItemSwordBase(String UnlocalizedName, ToolMaterial material)
	{
		super(material);
		
		name = UnlocalizedName;
		
		// Set full unlocalized name for lang ref.
		setUnlocalizedName(Main.MODID + "_" + name);
		
		// Add to Gotcraft Tab.
		setCreativeTab(ModTabs.gotcraftTab);
	}
}