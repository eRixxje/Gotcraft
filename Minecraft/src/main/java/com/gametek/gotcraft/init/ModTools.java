package com.gametek.gotcraft.init;

import net.minecraftforge.fml.common.registry.GameRegistry;

import com.gametek.gotcraft.base.items.ItemSwordBase;
import com.gametek.gotcraft.base.items.tools.ItemAxeBase;
import com.gametek.gotcraft.base.items.tools.ItemHoeBase;
import com.gametek.gotcraft.base.items.tools.ItemPickAxeBase;
import com.gametek.gotcraft.base.items.tools.ItemSpadeBase;

public final class ModTools {

    public static ItemHoeBase 		CopperHoe;
    public static ItemAxeBase 		CopperAxe;
    public static ItemPickAxeBase 	CopperPickAxe;
    public static ItemSpadeBase 	CopperSpade;
    
    public static ItemSwordBase 	CopperSword;
    
    public static void CreateTools()
    {
		GameRegistry.registerItem(
				CopperHoe = new ItemHoeBase("copper_hoe", ModMaterials.CopperMaterial), 
				"copper_hoe");
		GameRegistry.registerItem(
				CopperAxe = new ItemAxeBase("copper_axe", ModMaterials.CopperMaterial), 
				"copper_axe");
		GameRegistry.registerItem(
				CopperPickAxe = new ItemPickAxeBase("copper_pickaxe", ModMaterials.CopperMaterial), 
				"copper_pickaxe");
		GameRegistry.registerItem(
				CopperSpade = new ItemSpadeBase("copper_shovel", ModMaterials.CopperMaterial), 
				"copper_shovel");
    }
    
    public static void CreateWeapons()
    {
    	GameRegistry.registerItem(
				CopperSword = new ItemSwordBase("copper_sword", ModMaterials.CopperMaterial), 
				"copper_sword");
    }
}
