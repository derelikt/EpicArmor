package com.dereliktt.EpicArmor.proxy;

import java.util.HashMap;
import java.util.Map;

import com.dereliktt.EpicArmor.EpicArmor;
import com.dereliktt.EpicArmor.armor.CustomArmor;
import com.dereliktt.EpicArmor.models.ModelEpicArmorKnight;
import com.dereliktt.EpicArmor.models.ModelEpicArmorCommander;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;


public class ProxyClient extends ProxyCommon{
	
	public static ProxyCommon proxy;
	
	public static final Map<Item, ModelBiped> armorModels = new HashMap<Item, ModelBiped>();
	
	public static void register_renderers(){
		
			
			ModelEpicArmorKnight knight_armor = new ModelEpicArmorKnight(1F);
			ModelEpicArmorKnight knight_leggings = new ModelEpicArmorKnight(0.5F);
			
			armorModels.put(knight_helm, knight_armor);
			armorModels.put(knight_chest, knight_armor);
			armorModels.put(knight_legs, knight_leggings);
			armorModels.put(knight_boots, knight_armor);
			
			ModelEpicArmorCommander commander_armor = new ModelEpicArmorCommander(1F);
			ModelEpicArmorCommander commander_leggings = new ModelEpicArmorCommander(0.5F);
			
			armorModels.put(commander_helm, commander_armor);
			armorModels.put(commander_chest, commander_armor);
			armorModels.put(commander_legs, commander_leggings);
			armorModels.put(commander_boots, commander_armor);
		    
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		super.Init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
		this.register_renderers();
	}
	
	
}
	
