package tagueantor.ff7.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class MythrilClawBlade extends Item {

	public MythrilClawBlade(int par1) {
		super(par1);
	}
	public void updateIcons (IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("FinalFantasyVII:MythrilClawBlade");
	}
}
