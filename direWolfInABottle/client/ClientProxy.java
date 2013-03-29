package jcj94.direWolfInABottle.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;
import jcj94.direWolfInABottle.CommonProxy;

public class ClientProxy extends CommonProxy {

	
	@Override
	public void registerRenderers() 
	{
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		MinecraftForgeClient.preloadTexture(BLOCK_PNG);
	}

}