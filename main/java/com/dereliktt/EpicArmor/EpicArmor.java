package com.dereliktt.EpicArmor;

import com.dereliktt.EpicArmor.armor.CustomArmor;
import com.dereliktt.EpicArmor.proxy.ProxyClient;
import com.dereliktt.EpicArmor.proxy.ProxyCommon;
import com.dereliktt.EpicArmor.resources.References;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

@Mod(modid = "EpicArmor", name = "Epic Armor", version = "0.1")
public class EpicArmor {

	@SidedProxy(clientSide=References.proxy_client, serverSide=References.proxy_server)
	public static ProxyCommon proxy;

	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.Init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

}
