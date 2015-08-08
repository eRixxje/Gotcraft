package com.gametek.gotcraft.proxy;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.gametek.gotcraft.WorldGen;
import com.gametek.gotcraft.init.ModArmors;
import com.gametek.gotcraft.init.ModBlocks;
import com.gametek.gotcraft.init.ModCrafting;
import com.gametek.gotcraft.init.ModItems;
import com.gametek.gotcraft.init.ModMaterials;
import com.gametek.gotcraft.init.ModTabs;
import com.gametek.gotcraft.init.ModTools;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	ModTabs.CreateTabs();
    	
    	ModMaterials.CreateMaterials();
    	
        ModBlocks.CreateBlocks();
        ModItems.CreateItems();
        ModArmors.CreateArmors();
        
        ModTools.CreateTools();
        ModTools.CreateWeapons();
    }

    public void init(FMLInitializationEvent e) {
    	ModCrafting.AddRecipes();
    	ModCrafting.AddSmelting();
    	
    	GameRegistry.registerWorldGenerator(new WorldGen(), 0);
    	
    	MinecraftForge.addGrassSeed(new ItemStack(ModItems.CornSeeds), 5);
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}