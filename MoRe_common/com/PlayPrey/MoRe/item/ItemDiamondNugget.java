package com.PlayPrey.MoRe.item;

import net.minecraft.creativetab.CreativeTabs;

import com.PlayPrey.MoRe.MoRe;
import com.PlayPrey.MoRe.lib.Strings;



public class ItemDiamondNugget extends ItemMoRe
{
	public ItemDiamondNugget(int id)
	{
		super(id);
		this.setCreativeTab(MoRe.TabMoRe);
		this.setUnlocalizedName(Strings.DIAMONDNUGGET_NAME);
	}
}