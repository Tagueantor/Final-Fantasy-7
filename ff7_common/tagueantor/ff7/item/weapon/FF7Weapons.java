package tagueantor.ff7.item.weapon;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class FF7Weapons {

//Material Declarations
	public static EnumToolMaterial FF7WeaponTier1 = EnumHelper.addToolMaterial("FF7WeaponTier1", 3, 65536, 7.0F, 10, 30);
	public static EnumToolMaterial FF7WeaponTier2 = EnumHelper.addToolMaterial("FF7WeaponTier2", 3, 65536, 7.0F, 15, 30);
	public static EnumToolMaterial FF7WeaponTier3 = EnumHelper.addToolMaterial("FF7WeaponTier3", 3, 65536, 7.0F, 20, 30);
	public static EnumToolMaterial FF7WeaponTier4 = EnumHelper.addToolMaterial("FF7WeaponTier4", 3, 65536, 7.0F, 25, 30);
	public static EnumToolMaterial FF7WeaponTier5 = EnumHelper.addToolMaterial("FF7WeaponTier5", 3, 65536, 7.0F, 30, 30);
	public static EnumToolMaterial FF7WeaponTier6 = EnumHelper.addToolMaterial("FF7WeaponTier6", 3, 65536, 7.0F, 35, 30);
	public static EnumToolMaterial FF7WeaponTier7 = EnumHelper.addToolMaterial("FF7WeaponTier7", 3, 65536, 7.0F, 40, 30);
	public static EnumToolMaterial FF7WeaponTier8 = EnumHelper.addToolMaterial("FF7WeaponTier8", 3, 65536, 7.0F, 45, 30);
	public static EnumToolMaterial FF7WeaponTier9 = EnumHelper.addToolMaterial("FF7WeaponTier9", 3, 65536, 7.0F, 50, 30);
	public static EnumToolMaterial FF7WeaponTier10 = EnumHelper.addToolMaterial("FF7WeaponTier10", 3, 65536, 7.0F, 55, 30);
	public static EnumToolMaterial FF7WeaponTier11 = EnumHelper.addToolMaterial("FF7WeaponTier11", 3, 65536, 7.0F, 60, 30);
	public static EnumToolMaterial FF7WeaponTier12 = EnumHelper.addToolMaterial("FF7WeaponTier12", 3, 65536, 7.0F, 65, 30);
	public static EnumToolMaterial FF7WeaponTier13 = EnumHelper.addToolMaterial("FF7WeaponTier13", 3, 65536, 7.0F, 70, 30);
	public static EnumToolMaterial FF7WeaponTier14 = EnumHelper.addToolMaterial("FF7WeaponTier14", 3, 65536, 7.0F, 80, 30);
	public static EnumToolMaterial FF7WeaponTier15 = EnumHelper.addToolMaterial("FF7WeaponTier15", 3, 65536, 7.0F, 90, 30);
	public static EnumToolMaterial FF7WeaponTier16 = EnumHelper.addToolMaterial("FF7WeaponTier16", 3, 65536, 7.0F, 100, 30);
	
	
//Declaring weapon Statics
	//Declaring Cloud's Weapons
	public static Item BusterSword;
	
	
	
public FF7Weapons() {
	
	//Declaring ID, Material Type, etc. of Cloud's Weapons
	BusterSword = new tagueantor.ff7.item.weapon.cloud.BusterSword(2000, FF7WeaponTier1).setUnlocalizedName("BusterSword").setCreativeTab(CreativeTabs.tabCombat);



}
	
}
