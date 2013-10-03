package tagueantor.ff7;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import tagueantor.ff7.lib.Reference;
import tagueantor.ff7.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

//Declaring Mod ID, Name and version using Reference file.
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)


public class FinalFantasy7 {

	//Instance code. Useful quite often, but for unknown reasons.
	@Instance(Reference.MOD_ID)
	public static FinalFantasy7 instance;
	
	//Declaring Proxies (Optimising code for multiplayer reasons.
	@SidedProxy(clientSide = Reference.ClientProxy, serverSide = Reference.CommonProxy)
	public static CommonProxy proxy;
	
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
	public void modsLoaded(FMLPostInitializationEvent event) {
		
	};
	
	//Declaring statics for Crafting Materials.
	public static Item MythrilIngot;
	public static Item MythrilPole;
	public static Item MythrilClawBlade;
	
public FinalFantasy7() {
	//Identifying ID's and Creative Tab location for Crafting Materials.
	MythrilIngot = new tagueantor.ff7.item.MythrilIngot(1980).setUnlocalizedName("MythrilIngot").setCreativeTab(CreativeTabs.tabMaterials);
	MythrilPole = new tagueantor.ff7.item.MythrilPole(1981).setUnlocalizedName("MythrilPole").setCreativeTab(CreativeTabs.tabMaterials);
	MythrilClawBlade = new tagueantor.ff7.item.MythrilClawBlade(1982).setUnlocalizedName("MythrilClawBlade").setCreativeTab(CreativeTabs.tabMaterials);
	
	
	//Language Registry of Crafting Materials.
	LanguageRegistry.addName(MythrilIngot, "Mythril Ingot");
	LanguageRegistry.addName(MythrilPole, "Mythril Pole");
	LanguageRegistry.addName(MythrilClawBlade, "Mythriil Claw Blade");

	
	
}
	
	
}
