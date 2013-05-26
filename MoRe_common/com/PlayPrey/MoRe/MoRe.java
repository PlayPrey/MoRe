package com.PlayPrey.MoRe;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;

import com.PlayPrey.MoRe.block.ModBlocks;
import com.PlayPrey.MoRe.config.ConfigurationHandler;
import com.PlayPrey.MoRe.core.handler.LocalizationHandler;
import com.PlayPrey.MoRe.core.proxy.CommonProxy;
import com.PlayPrey.MoRe.item.ModItems;
import com.PlayPrey.MoRe.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod
(
		modid = Reference.MOD_ID,
		name  = Reference.MOD_NAME,
		version= Reference.VERSION
)

@NetworkMod
(
	channels = {Reference.CHANNEL_NAME},
	serverSideRequired = false,	
	clientSideRequired = true
		
)

public class MoRe 
{
	@SidedProxy
	(
			clientSide = Reference.CLIENT_PROXY_LOCATION ,
			serverSide = Reference.COMMON_PROXY_LOCATION
	)
	public static CommonProxy proxy;
	
	public static CreativeTabs TabMoRe = new com.PlayPrey.MoRe.creativetabs.TabMoRe(CreativeTabs.getNextID(), Reference.MOD_ID);	
	@PreInit
	public void preInit (FMLPreInitializationEvent event)
	{
		ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));

		ModBlocks.BlocksInit();
		ModItems.ItemInit();
		
		LocalizationHandler.loadLanguages();
		
	}
	@Init
	public void init (FMLInitializationEvent event)
	{

	}
	@PostInit
	public void postInit (FMLPostInitializationEvent event)
	{
		
	}
	
}
