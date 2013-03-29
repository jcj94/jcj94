package jcj94.direWolfInABottle;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDireWolfInABottleStoneBrick extends Item {

	public ItemDireWolfInABottleStoneBrick(int par1) {
		super(par1);
	}
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player, int x, int y, int z)
	{
		for(int blocksY = 0; blocksY < 7; blocksY++)
		{
			for(int blocksZ = 0; blocksZ < 10; blocksZ++)
			{
				for(int blocksX = 0; blocksX < 10; blocksX++)
				{
					if(blocksY < 1)
					{
					
					}
					else if(blocksY > 5)
					{
						if(blocksZ < 1 || blocksZ > 9)
						{
							
						}
					}
					else
					{
						if(blocksZ < 1 || blocksZ == 5 || blocksZ > 9)
						{
							
						}
					}
				}
			}
		}
		return itemstack;
	}
}
