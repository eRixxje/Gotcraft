package com.gametek.gotcraft.init;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.gametek.gotcraft.base.items.ItemArmorBase;

public final class ModArmors {
	
	public static ItemArmorBase CopperHelmet;
    public static ItemArmorBase CopperChestPlate;
    public static ItemArmorBase CopperLeggings;
    public static ItemArmorBase CopperBoots;
    
    public static ArmorMaterial CopperArmorMaterial = 
    		EnumHelper.addArmorMaterial("CopperArmorMaterial", "gotcraft:copper", 
    		16, new int[] {3, 7, 5, 2}, 30);
    
    public static void CreateArmors() 
    {
	    GameRegistry.registerItem(
				CopperHelmet = new ItemArmorBase("copper_helmet", CopperArmorMaterial, 1, 0), 
				"copper_helmet");
		GameRegistry.registerItem(
				CopperChestPlate = new ItemArmorBase("copper_chestplate", CopperArmorMaterial, 1, 1), 
				"copper_chestplate");
		GameRegistry.registerItem(
				CopperLeggings = new ItemArmorBase("copper_leggings", CopperArmorMaterial, 2, 2), 
				"copper_leggings");
		GameRegistry.registerItem(
				CopperBoots = new ItemArmorBase("copper_boots", CopperArmorMaterial, 1, 3), 
				"copper_boots");
    }
}
