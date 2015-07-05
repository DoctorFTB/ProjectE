package moze_intel.projecte.gameObjs.items;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import moze_intel.projecte.gameObjs.gui.GUIManual;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PEManual extends Item{

	public PEManual(){
		this.setUnlocalizedName("pe_manual");
		this.setMaxStackSize(1);
	}
	
    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (world.isRemote) {
        		FMLCommonHandler.instance().showGuiScreen(new GUIManual());
            return stack;
        }
        return stack;
    }
    
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register)
	{
		this.itemIcon = register.registerIcon("assets/minecraft/textures/book_normal.png");
	}

}
