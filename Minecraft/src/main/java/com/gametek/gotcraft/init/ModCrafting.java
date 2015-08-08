package com.gametek.gotcraft.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModCrafting {

	public static void AddRecipes()
	{		
		// Craft 9 Copper Ingots to a Copper Block.
		GameRegistry.addShapelessRecipe(
				new ItemStack(ModBlocks.CopperBlock, 1), 
				new Object[] { 
						ModItems.CopperIngot, ModItems.CopperIngot, ModItems.CopperIngot,
						ModItems.CopperIngot, ModItems.CopperIngot, ModItems.CopperIngot,
						ModItems.CopperIngot, ModItems.CopperIngot, ModItems.CopperIngot
					}
				);
		
		// Aaand back.
		GameRegistry.addShapelessRecipe(
				new ItemStack(ModItems.CopperIngot, 9), 
				new Object[] { ModBlocks.CopperBlock }
				);
		
		// Create Copper Tools
		GameRegistry.addRecipe(new ItemStack(ModTools.CopperHoe),
				new Object[] {"CC "," S "," S ", 'C', ModItems.CopperIngot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModTools.CopperAxe),
				new Object[] {"CC ","CS "," S ", 'C', ModItems.CopperIngot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModTools.CopperPickAxe),
				new Object[] {"CCC"," S "," S ", 'C', ModItems.CopperIngot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModTools.CopperSpade),
				new Object[] {" C "," S "," S ", 'C', ModItems.CopperIngot, 'S', Items.stick});
		
		// Create Copper Sword
		GameRegistry.addRecipe(new ItemStack(ModTools.CopperSword),
				new Object[] {" C "," C "," S ", 'C', ModItems.CopperIngot, 'S', Items.stick});
		
		// Create Copper Armor
		GameRegistry.addRecipe(new ItemStack(ModArmors.CopperHelmet), 
				new Object[] {"###", "# #", "   ", '#', ModItems.CopperIngot});
		
		GameRegistry.addRecipe(new ItemStack(ModArmors.CopperChestPlate), 
				new Object[] {"# #", "###", "###", '#', ModItems.CopperIngot});
		
		GameRegistry.addRecipe(new ItemStack(ModArmors.CopperLeggings), 
				new Object[] {"###", "# #", "# #", '#', ModItems.CopperIngot});
		
		GameRegistry.addRecipe(new ItemStack(ModArmors.CopperBoots), 
				new Object[] {"   ", "# #", "# #", '#', ModItems.CopperIngot});
	}

	public static void AddSmelting()
	{
		// Smelt 1 Ore to 1 ingot.
		GameRegistry.addSmelting(
				ModBlocks.CopperOre, 
				new ItemStack(ModItems.CopperIngot, 1), 1F);
				
		// Smelt 1 Corn Cob to 8 Popcorn.
		GameRegistry.addSmelting(
				ModItems.CornCob, 
				new ItemStack(ModItems.PopCorn, 8), 1F);

	}
}
