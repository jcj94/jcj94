package jcj94.direWolfInABottle.client;

import org.lwjgl.opengl.GL11;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import jcj94.direWolfInABottle.model.ModelDireWolfInABottle;

public class ItemRenderDWIAB implements IItemRenderer 
{


	protected ModelDireWolfInABottle bottleModel;

	public ItemRenderDWIAB()
	{
		bottleModel = new ModelDireWolfInABottle();
	}
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) 
	{
		switch(type)
		{
		case EQUIPPED: return true;
		default: return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) 
	{
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) 
	{
		switch(type)
		{
			case EQUIPPED:
			{
				GL11.glPushMatrix();
				Minecraft.getMinecraft().renderEngine.bindTexture("/jcj94/direWolfInABottle/model/DWIAB.png");

				if(!((EntityPlayer)data[1] == Minecraft.getMinecraft().renderViewEntity && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0 && !((Minecraft.getMinecraft().currentScreen instanceof GuiInventory || Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative) && RenderManager.instance.playerViewY == 180.0F)))
				{
					GL11.glRotatef(0, 1.00F, 0.00F, 0.00F);

					GL11.glRotatef(0, 0.00F, 1.00F, 0.00F);

					GL11.glRotatef(-80, 0.00F, 0.00F, 1.00F);

					GL11.glTranslatef(-0.25F, 0.75F, 0F);
				}
				else
				{
					GL11.glRotatef(0, 1.00F, 0.00F, 0.00F);

					GL11.glRotatef(0, 0.00F, 1.00F, 0.00F);

					GL11.glRotatef(-70, 0.00F, 0.00F, 1.00F);
					
				GL11.glTranslatef(-0.25F, 1F, 0F);
				}
				float scale = 0.4F;

				GL11.glScalef(scale, scale, scale);	
			
				bottleModel.render((Entity)data[1], 0.0f, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

				GL11.glPopMatrix();
			}default:
				break;
		}
	}
}
