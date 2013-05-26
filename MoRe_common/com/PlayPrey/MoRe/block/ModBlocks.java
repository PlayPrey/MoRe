package com.PlayPrey.MoRe.block;

import com.PlayPrey.MoRe.lib.BlockIDs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;


public class ModBlocks 
{
	public static Block diamondCane;
	public static void BlocksInit()
	{
		diamondCane = new diamondCane(BlockIDs.DC_ID);
		
		GameRegistry.registerBlock(diamondCane);
	}
}
