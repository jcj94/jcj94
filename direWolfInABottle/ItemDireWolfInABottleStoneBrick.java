package jcj94.direWolfInABottle;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDireWolfInABottleStoneBrick extends Item {

	public ItemDireWolfInABottleStoneBrick(int par1) {
		super(par1);
	}
	@Override
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
    {
		
        return itemstack;
    }
}
