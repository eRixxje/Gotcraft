package com.gametek.gotcraft.init;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public final class ModMaterials {

	 public static ToolMaterial CopperMaterial;
	 
	 public static void CreateMaterials()
	 {
		 CopperMaterial = EnumHelper.addToolMaterial("CopperMaterial", 
		    	    		2, 500, 1.0F, 2.5F, 30);
	 }
}
