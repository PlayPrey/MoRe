package com.PlayPrey.MoRe.block;

import com.PlayPrey.MoRe.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class diamondCane extends BlockMoRe
{
	public diamondCane(int id) {
		super(id, Material.grass);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName(Strings.DIAMONDCANE_NAME);
		
	}

}
