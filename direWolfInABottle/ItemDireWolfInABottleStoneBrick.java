package jcj94.direWolfInABottle;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDireWolfInABottleStoneBrick extends Item {

	public ItemDireWolfInABottleStoneBrick(int par1) {
		super(par1);
	}
	public ItemStack onItemUse(ItemStack itemstack, World world, EntityPlayer player, int x, int y, int z)
	{
		int posX = (int) (player.posX-4);
		System.out.println(posX);
		int posY = (int) (player.posY-1);
		System.out.println(posY);
		int posZ = (int) (player.posZ-4);
		System.out.println(posZ);
		for(int blocksY = 0; blocksY < 7; blocksY++)
		{
			for(int blocksZ = 0; blocksZ < 10; blocksZ++)
			{
				for(int blocksX = 0; blocksX < 10; blocksX++)
				{
					if(blocksY == 0)
					{
						world.setBlock(Block.stoneBrick.blockID, posX, posY, posZ);
						posX++;
					}
					else if(blocksY > 5)
					{
						if(blocksZ < 1 || blocksZ > 9)
						{
							world.setBlock(Block.stoneBrick.blockID, posX, posY, posZ);
							posX++;
						}
					}
					else
					{
						if(blocksZ < 1 || blocksZ == 5 || blocksZ > 9)
						{
							world.setBlock(Block.stoneBrick.blockID, posX, posY, posZ);
							posX++;
						}
					}
				}
				posZ++;
			}
			posY++;
		}
		return itemstack;
	}
}
