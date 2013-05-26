package com.PlayPrey.MoRe.block;

import com.PlayPrey.MoRe.item.ModItems;
import com.PlayPrey.MoRe.lib.BlockIDs;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;


public class ModBlocks 
{
	public static com.PlayPrey.MoRe.block.diamondCane diamondCane;
	public static void BlocksInit()
	{
		diamondCane = new diamondCane(BlockIDs.DC_ID);
		
		GameRegistry.registerBlock(diamondCane);
		
		
	}
	
	
		
}
