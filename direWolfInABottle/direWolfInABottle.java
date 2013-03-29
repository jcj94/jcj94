package jcj94.direWolfInABottle;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="Metroid", name="Metroid Mod", version="0.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class direWolfInABottle {


	// The instance of your mod that Forge uses.
	@Instance("Generic")
	public static direWolfInABottle instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="jcj94.direWolfInABottle.client.ClientProxy", serverSide="jcj94.direWolfInABottle.CommonProxy")
	public static CommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) 
	{
		// Stub Method
	}

	@Init
	public void load(FMLInitializationEvent event) 
	{
		
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event) 
	{
		// Stub Method
	}
}