package com.PlayPrey.MoRe.item;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;

import com.PlayPrey.MoRe.block.ModBlocks;
import com.PlayPrey.MoRe.lib.ItemIDs;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.item.Item;

public class ModItems 
{
	public static Item DiamondNugget;
	
	
	public static void ItemInit() 
	{
		DiamondNugget = new ItemDiamondNugget(ItemIDs.DIAMONDNUGGET_ID);
	}
	public static void recipesInit(){

		GameRegistry.addRecipe(new ItemStack(Item.diamond,1,0), new Object[]{
			"DDD","DDD","DDD",'D', ModItems.DiamondNugget
		});
	}
}
