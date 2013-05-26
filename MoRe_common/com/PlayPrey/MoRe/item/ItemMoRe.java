package com.PlayPrey.MoRe.item;

import com.PlayPrey.MoRe.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemMoRe extends Item
{

	public ItemMoRe(int id) 
	{
		super(id);
		
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		itemIcon = register.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}

}
