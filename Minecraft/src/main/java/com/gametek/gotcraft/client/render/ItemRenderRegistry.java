package com.gametek.gotcraft.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.oredict.OreDictionary;

import com.gametek.gotcraft.Main;
import com.gametek.gotcraft.base.items.ItemArmorBase;
import com.gametek.gotcraft.base.items.ItemBase;
import com.gametek.gotcraft.base.items.ItemFoodBase;
import com.gametek.gotcraft.base.items.ItemSeedsBase;
import com.gametek.gotcraft.base.items.ItemSwordBase;
import com.gametek.gotcraft.base.items.tools.ItemAxeBase;
import com.gametek.gotcraft.base.items.tools.ItemHoeBase;
import com.gametek.gotcraft.base.items.tools.ItemPickAxeBase;
import com.gametek.gotcraft.base.items.tools.ItemSpadeBase;
import com.gametek.gotcraft.init.ModArmors;
import com.gametek.gotcraft.init.ModItems;
import com.gametek.gotcraft.init.ModTools;


public final class ItemRenderRegistry 
{
	public static void Init()
	{
		register(ModItems.CopperIngot);
		register(ModItems.CornCob);
		register(ModItems.PopCorn);
				
		// Tools
		register(ModTools.CopperHoe);
		register(ModTools.CopperAxe);
		register(ModTools.CopperPickAxe);
		register(ModTools.CopperSpade);
		
		register(ModTools.CopperSword);
		
		// Armors
		register(ModArmors.CopperHelmet);
		register(ModArmors.CopperChestPlate);
		register(ModArmors.CopperLeggings);
		register(ModArmors.CopperBoots);
		
		register(ModItems.CornSeeds);
		
		OreDictionary.registerOre("ingotCopper", ModItems.CopperIngot);
	}
	
	public static void register(ItemBase item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
	    		item, 0, new ModelResourceLocation(Main.MODID + ":" + item.getName(), "inventory"));
	}
	
	public static void register(ItemSeedsBase item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
	    		item, 0, new ModelResourceLocation(Main.MODID + ":" + item.getName(), "inventory"));
	}
	
	public static void register(ItemSwordBase item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
	    		item, 0, new ModelResourceLocation(Main.MODID + ":" + item.getName(), "inventory"));
	}
	
	public static void register(ItemHoeBase item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
	    		item, 0, new ModelResourceLocation(Main.MODID + ":" + item.getName(), "inventory"));
	}
	public static void register(ItemAxeBase item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
	    		item, 0, new ModelResourceLocation(Main.MODID + ":" + item.getName(), "inventory"));
	}
	public static void register(ItemPickAxeBase item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
	    		item, 0, new ModelResourceLocation(Main.MODID + ":" + item.getName(), "inventory"));
	}
	public static void register(ItemSpadeBase item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
	    		item, 0, new ModelResourceLocation(Main.MODID + ":" + item.getName(), "inventory"));
	}
	
	public static void register(ItemArmorBase item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
	    		item, 0, new ModelResourceLocation(Main.MODID + ":" + item.getName(), "inventory"));
	}
	
	public static void register(ItemFoodBase item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
	    		item, 0, new ModelResourceLocation(Main.MODID + ":" + item.getName(), "inventory"));
	}
}