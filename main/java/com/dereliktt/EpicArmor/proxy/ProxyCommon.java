package com.dereliktt.EpicArmor.proxy;

import com.dereliktt.EpicArmor.armor.CustomArmor;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ProxyCommon {
	
	public static Item knight_helm;;
	public static Item knight_chest;
	public static Item knight_legs;
	public static Item knight_boots;
	
	public static Item commander_helm;;
	public static Item commander_chest;
	public static Item commander_legs;
	public static Item commander_boots;
	
	public static Item elfwarrior_helm;;
	public static Item elfwarrior_chest;
	public static Item elfwarrior_legs;
	public static Item elfwarrior_boots;
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Armor Materials (Name, Durability, Damage Reduction[4], enchantability) 
		ArmorMaterial KnightArmorMat = EnumHelper.addArmorMaterial("KnightArmorMat", 17, new int[]{2, 6, 5, 3}, 11);
		ArmorMaterial CommanderArmorMat = EnumHelper.addArmorMaterial("CommanderArmorMat", 15, new int[]{3, 7, 6, 3}, 26);
		ArmorMaterial elfwarriorArmorMat = EnumHelper.addArmorMaterial("CommanderArmorMat", 15, new int[]{3, 7, 6, 3}, 26);
		
		knight_helm = new CustomArmor(KnightArmorMat, 1, 0).setUnlocalizedName("knight_helm").setCreativeTab(this.tabEpicArmor);
		knight_chest = new CustomArmor(KnightArmorMat, 1, 1).setUnlocalizedName("knight_chest").setCreativeTab(this.tabEpicArmor);
		knight_legs = new CustomArmor(KnightArmorMat, 1, 2).setUnlocalizedName("knight_legs").setCreativeTab(this.tabEpicArmor);
		knight_boots = new CustomArmor(KnightArmorMat, 1, 3).setUnlocalizedName("knight_boots").setCreativeTab(this.tabEpicArmor);	
		
		commander_helm = new CustomArmor(CommanderArmorMat, 1, 0).setUnlocalizedName("commander_helm").setCreativeTab(this.tabEpicArmor);
		commander_chest = new CustomArmor(CommanderArmorMat, 1, 1).setUnlocalizedName("commander_chest").setCreativeTab(this.tabEpicArmor);
		commander_legs = new CustomArmor(CommanderArmorMat, 1, 2).setUnlocalizedName("commander_legs").setCreativeTab(this.tabEpicArmor);
		commander_boots = new CustomArmor(CommanderArmorMat, 1, 3).setUnlocalizedName("commander_boots").setCreativeTab(this.tabEpicArmor);	
		
		elfwarrior_helm = new CustomArmor(elfwarriorArmorMat, 1, 0).setUnlocalizedName("elfwarrior_helm").setCreativeTab(this.tabEpicArmor);
		elfwarrior_chest = new CustomArmor(elfwarriorArmorMat, 1, 1).setUnlocalizedName("elfwarrior_chest").setCreativeTab(this.tabEpicArmor);
		elfwarrior_legs = new CustomArmor(elfwarriorArmorMat, 1, 2).setUnlocalizedName("elfwarrior_legs").setCreativeTab(this.tabEpicArmor);
		elfwarrior_boots = new CustomArmor(elfwarriorArmorMat, 1, 3).setUnlocalizedName("elfwarrior_boots").setCreativeTab(this.tabEpicArmor);	
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		//Register Items
		GameRegistry.registerItem(knight_helm, "knight_helm");
    	GameRegistry.registerItem(knight_chest, "knight_chest");
    	GameRegistry.registerItem(knight_legs, "knight_legs");
    	GameRegistry.registerItem(knight_boots, "knight_boots");
    	
    	GameRegistry.registerItem(commander_helm, "commander_helm");
    	GameRegistry.registerItem(commander_chest, "commander_chest");
    	GameRegistry.registerItem(commander_legs, "commander_legs");
    	GameRegistry.registerItem(commander_boots, "commander_boots");
    	
    	GameRegistry.registerItem(elfwarrior_helm, "elfwarrior_helm");
    	GameRegistry.registerItem(elfwarrior_chest, "elfwarrior_chest");
    	GameRegistry.registerItem(elfwarrior_legs, "elfwarrior_legs");
    	GameRegistry.registerItem(elfwarrior_boots, "elfwarrior_boots");
    	
    	//Register Recipes
    	GameRegistry.addRecipe(new ItemStack(knight_legs), new Object[]{"III","G G","I I", 'I', Items.iron_ingot, 'G', Items.gold_ingot} );
	    GameRegistry.addRecipe(new ItemStack(knight_chest), new Object[]{"G G","III","IGI", 'I', Items.iron_ingot, 'G', Items.gold_ingot} );
	    GameRegistry.addRecipe(new ItemStack(knight_boots), new Object[]{"G G","I I", 'I', Items.iron_ingot, 'G', Items.gold_ingot} );
	    GameRegistry.addRecipe(new ItemStack(knight_helm), new Object[]{" W ","III","I I", 'I', Items.iron_ingot, 'W', new ItemStack(Blocks.wool,1,11)} );
	    
	    GameRegistry.addRecipe(new ItemStack(commander_legs), new Object[]{"GGG","I I","G G", 'I', Items.iron_ingot, 'G', Items.gold_ingot} );
	    GameRegistry.addRecipe(new ItemStack(commander_chest), new Object[]{"I I","GGG","GIG", 'I', Items.iron_ingot, 'G', Items.gold_ingot} );
	    GameRegistry.addRecipe(new ItemStack(commander_boots), new Object[]{"I I","G G", 'I', Items.iron_ingot, 'G', Items.gold_ingot} );
	    GameRegistry.addRecipe(new ItemStack(commander_helm), new Object[]{" W ","GGG","G G", 'G', Items.gold_ingot, 'W', new ItemStack(Blocks.wool,1,14)} );
	    
	    GameRegistry.addRecipe(new ItemStack(elfwarrior_legs), new Object[]{"WWW","W W","W W", 'W', new ItemStack(Blocks.wool,1,0)});
	    GameRegistry.addRecipe(new ItemStack(elfwarrior_chest), new Object[]{"L L","WLW","III", 'L', new ItemStack(Blocks.wool,1,5), 'W', new ItemStack(Blocks.wool,1,0), 'I', new ItemStack(Blocks.iron_bars,1,0)} );
	    GameRegistry.addRecipe(new ItemStack(elfwarrior_boots), new Object[]{"W W","L L", 'W', new ItemStack(Blocks.wool,1,5), 'L', Items.leather});
	    GameRegistry.addRecipe(new ItemStack(elfwarrior_helm), new Object[]{"WWW","W W"," W ", 'W', new ItemStack(Blocks.wool,1,5)});
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs tabEpicArmor= new CreativeTabs("tabepicarmor") {

	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem(){
	        ItemStack iStack = new ItemStack(knight_helm);
	        return iStack.getItem();
	    }
	};
}
