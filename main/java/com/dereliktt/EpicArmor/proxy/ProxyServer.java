package com.dereliktt.EpicArmor.proxy;

import java.util.HashMap;
import java.util.Map;

import com.dereliktt.EpicArmor.EpicArmor;
import com.dereliktt.EpicArmor.models.ModelEpicArmorKnight;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;


public class ProxyServer extends ProxyCommon{
	public static ProxyCommon proxy;
	
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
	}
	
}
	
