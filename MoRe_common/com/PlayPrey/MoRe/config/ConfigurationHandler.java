package com.PlayPrey.MoRe.config;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import com.PlayPrey.MoRe.lib.BlockIDs;
import com.PlayPrey.MoRe.lib.ItemIDs;
import com.PlayPrey.MoRe.lib.Reference;
import com.PlayPrey.MoRe.lib.Strings;

import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler 
{
	public static Configuration config;
	public static void init(File file)
	{
		config = new Configuration(file);

		try
		{
			config.load();
			
			BlockIDs.DC_ID = config.getBlock(Strings.DIAMONDCANE_NAME, BlockIDs.DC_ID_DEFAULT).getInt(BlockIDs.DC_ID_DEFAULT);
			ItemIDs.DIAMONDNUGGET_ID = config.getItem(Strings.DIAMONDNUGGET_NAME, ItemIDs.DIAMONDNUGGET_ID_DEFAULT).getInt(ItemIDs.DIAMONDNUGGET_ID_DEFAULT);

		}
		catch(Exception e)
		{
			FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + "could not find the configuration file.");
		}
		finally
		{
			config.save();
		}

	}
}