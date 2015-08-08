package com.gametek.gotcraft.init;

import net.minecraftforge.fml.common.registry.GameRegistry;

import com.gametek.gotcraft.base.items.ItemBase;
import com.gametek.gotcraft.base.items.ItemFoodBase;
import com.gametek.gotcraft.base.items.ItemSeedsBase;

public final class ModItems {
		
	public static ItemBase 		CopperIngot;
	public static ItemBase 		CornCob;
    public static ItemFoodBase 	PopCorn;
    public static ItemSeedsBase CornSeeds;
    
	public static void CreateItems()
	{
		GameRegistry.registerItem(
				CopperIngot = new ItemBase("item_copperingot"), 
				"item_copperingot");
		
		GameRegistry.registerItem(
				CornCob = new ItemBase("corn_cob"), 
				"corn_cob");
		
		GameRegistry.registerItem(
				PopCorn = new ItemFoodBase("popcorn", 1, 0.6F), 
				"popcorn");
		
		GameRegistry.registerItem(
				CornSeeds = new ItemSeedsBase(ModBlocks.CornCrop, null, "corn_seeds"), 
				"corn_seeds");
	}
}