package tagueantor.ff7;

import tagueantor.ff7.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

//Declaring Mod ID, Name and version using Refence file.
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
	
	
	
	
	
}
