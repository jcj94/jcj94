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
	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int l, float f, float f1, float f3)
	{
		int posX = x-4;
		//System.out.println(posX);
		int posY = y-1;
		//System.out.println(posY);
		int posZ = z-4;
		//System.out.println(posZ);
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
						System.out.println("Placing block at " + posX + ", " + posY + ", " + posZ);
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
		return true;
	}
}
