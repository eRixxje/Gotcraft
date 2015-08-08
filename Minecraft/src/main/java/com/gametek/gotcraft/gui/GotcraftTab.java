package com.gametek.gotcraft.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.gametek.gotcraft.init.ModItems;

public final class GotcraftTab extends CreativeTabs
{
    public GotcraftTab(int par1, String par2Str)
    {
        super(par1, par2Str);
    }

	@Override
	public Item getTabIconItem(){
		return ModItems.PopCorn;
	}
}