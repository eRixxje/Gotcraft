package com.gametek.gotcraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.gametek.gotcraft.proxy.CommonProxy;


@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {
	
	public static final String MODID = "gotcraft";
	public static final String MODNAME = "GotCraft Multimod";
    public static final String VERSION = "1.0.10";
    
    @Instance
    public static Main instance = new Main();
    
    @SidedProxy(clientSide="com.gametek.gotcraft.proxy.ClientProxy", serverSide="com.gametek.gotcraft.proxy.ServerProxy")
    public static CommonProxy proxy;
	
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {     	
    	this.proxy.preInit(event);
    }
    
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		this.proxy.init(event);
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent event)
	{
		this.proxy.postInit(event);
	}
}
