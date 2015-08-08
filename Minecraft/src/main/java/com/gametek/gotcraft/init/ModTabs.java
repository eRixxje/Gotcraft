package com.gametek.gotcraft.init;

import net.minecraft.creativetab.CreativeTabs;

import com.gametek.gotcraft.gui.GotcraftTab;

public final class ModTabs {
	
	public static CreativeTabs gotcraftTab;

	public static void CreateTabs()
	{
		gotcraftTab = new GotcraftTab(CreativeTabs.getNextID(), "gotCraftTab");
	}
}
