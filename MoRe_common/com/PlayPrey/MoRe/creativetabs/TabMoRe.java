package com.PlayPrey.MoRe.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import com.PlayPrey.MoRe.item.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabMoRe extends CreativeTabs
{
	public TabMoRe(int id, String name)
	{
		super(id, name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack()
	{

		return new ItemStack(ModItems.DiamondNugget,1,0);

	}
}
