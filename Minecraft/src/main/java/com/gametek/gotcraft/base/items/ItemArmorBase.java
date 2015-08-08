package com.gametek.gotcraft.base.items;

import net.minecraft.item.ItemArmor;

import com.gametek.gotcraft.Main;
import com.gametek.gotcraft.init.ModTabs;

public class ItemArmorBase extends ItemArmor {
	
	protected String name;
	
	public String getName()
	{
		return name;
	}
	
	public ItemArmorBase(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
		
		name = unlocalizedName;
		
		// Set full unlocalized name for lang ref.
		setUnlocalizedName(Main.MODID + "_" + name);
		
		// Add to Gotcraft Tab.
		setCreativeTab(ModTabs.gotcraftTab);
    }
}