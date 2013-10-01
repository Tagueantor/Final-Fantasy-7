package tagueantor.ff7;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import tagueantor.ff7.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

//Declaring Mod ID, Name and version using Reference file.
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class FinalFantasy7 {

	//Pre-Initialisation Event
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	};
	
	//Initialisation Event
	@EventHandler
	public void load(FMLInitializationEvent event) {
		
	};
	
	//Post-Initialisation Event
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	};
	
	//Declaring statics for Crafting Materials.
	public static Item MythrilIngot;
	public static Item MythrilPole;
	public static Item MythrilClawBlade;
	
public FinalFantasy7() {
	//Identifying ID's and Creative Tab location for Crafting Materials.
	MythrilIngot(1980).setUnlocalizedName("MythrilIngot").setCreativeTab(CreativeTabs.tabMaterials);
	MythrilPole(1981).setUnlocalizedName("MythrilPole").setCreativeTab(CreativeTabs.tabMaterials);
	MythrilClawBlade(1982).setUnlocalizedName("MythrilClawBlade").setCreativeTab(CreativeTabs.tabMaterials);
	
	
	
	
}
	
	
}
