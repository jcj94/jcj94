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
		int block = Block.stoneBrick.blockID;
		int posX = x-4;
		//System.out.println(posX);
		int posY = y;
		//System.out.println(posY);
		int posZ = z-4;
		//System.out.println(posZ);
		for(int blocksY = 0; blocksY < 6; blocksY++)
		{
			for(int blocksZ = 0; blocksZ < 9; blocksZ++)
			{
				for(int blocksX = 0; blocksX < 9; blocksX++)
				{
					if(blocksY == 0)
					{
						world.setBlock(posX + blocksX, posY + blocksY, posZ + blocksZ, block);						
					}
					else
					{
						if(blocksZ == 0 || blocksZ == 8)
						{
							if(blocksX != 4 && blocksY < 3)
							{
								world.setBlock(posX + blocksX, posY + blocksY, posZ + blocksZ, block);
							}
							else if(blocksY > 2)
							{
								world.setBlock(posX + blocksX, posY + blocksY, posZ + blocksZ, block);
							}
						}
					}
					for(int blocksZZ = 0; blocksZZ < 9; blocksZZ++)
					{

						if(blocksZ != 4 && blocksY > 0 && blocksY < 3)
						{
							world.setBlock(posX, posY + blocksY, posZ + blocksZ, block);
							world.setBlock(posX + 8, posY + blocksY, posZ + blocksZ, block);
						}
						else if(blocksY > 2)
						{
							world.setBlock(posX, posY + blocksY, posZ + blocksZ, block);
							world.setBlock(posX + 8, posY + blocksY, posZ + blocksZ, block);
						}


					}
				}
			}
		}
		return true;
	}
}
