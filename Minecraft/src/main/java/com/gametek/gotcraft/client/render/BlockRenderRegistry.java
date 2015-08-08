package com.gametek.gotcraft.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

import com.gametek.gotcraft.Main;
import com.gametek.gotcraft.base.blocks.BlockBase;
import com.gametek.gotcraft.base.blocks.BlockCropBase;
import com.gametek.gotcraft.init.ModBlocks;

public class BlockRenderRegistry {
	
	public static void Init(){
		register(ModBlocks.CopperOre);
		register(ModBlocks.CopperBlock);
		register(ModBlocks.CornCrop);
		
		OreDictionary.registerOre("oreCopper", ModBlocks.CopperOre);
	}

	public static void register(BlockBase block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
				Item.getItemFromBlock(block), 0, new ModelResourceLocation(Main.MODID + ":" + block.getName(), "inventory"));
	}
	
	public static void register(BlockCropBase block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
				Item.getItemFromBlock(block), 0, new ModelResourceLocation(Main.MODID + ":" + block.getName(), "inventory"));
	}
}
