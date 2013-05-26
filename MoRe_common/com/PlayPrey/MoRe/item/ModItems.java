package com.PlayPrey.MoRe.item;

import com.PlayPrey.MoRe.lib.ItemIDs;

import net.minecraft.item.Item;

public class ModItems 
{
	public static Item DiamondNugget;
	
	
	public static void ItemInit() 
	{
		DiamondNugget = new ItemDiamondNugget(ItemIDs.DIAMONDNUGGET_ID);
	}
	
}
