package com.gametek.gotcraft.base.items.tools;

import net.minecraft.item.ItemPickaxe;

import com.gametek.gotcraft.Main;
import com.gametek.gotcraft.init.ModTabs;

public class ItemPickAxeBase extends ItemPickaxe {
	protected String name;
	
	public String getName()
	{
		return name;
	}
	
	public ItemPickAxeBase(String UnlocalizedName, ToolMaterial material)
	{
		super(material);
		
		name = UnlocalizedName;
		
		// Set full unlocalized name for lang ref.
		setUnlocalizedName(Main.MODID + "_" + name);
		
		// Add to Gotcraft Tab.
		setCreativeTab(ModTabs.gotcraftTab);
	}
}
