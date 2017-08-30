package com.camp.item;
 
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.example.examplemod.ExampleMod;
 
public class ItemManager {
 
    public static CustomItem customItem; 
    public static CustomPickaxe customPickaxe;
    public static CustomArmor customHelm;
    public static CustomSword customSword;
    public static CustomShovel customShovel;
    public static CustomAxe customAxe;
    public static CustomHoe customHoe;
    public static CustomArmor customChest;
    public static CustomArmor customLeggings;
    public static CustomArmor customBoots;
     
    
     
    public static void mainRegistry() {
        initializeItem();
        registerItem();
    }
    
    public static void initializeItem() {
        customItem = new CustomItem();
        customPickaxe = new CustomPickaxe(ExampleMod.customToolMaterial);
        customHelm = new CustomArmor(ExampleMod.customArmorMaterial, 0, 0, "CustomHelm");
        customSword = new CustomSword(ExampleMod.CUSTOMToolmaterial);
        customShovel = new CustomShovel(ExampleMod.CustomToolMaterial);
        customAxe = new CustomAxe(ExampleMod.CUSTOMTOOLMATERIAL);
        customHoe = new CustomHoe(ExampleMod.CuStOmToOlMaTeRiAl);
        customChest = new CustomArmor(ExampleMod.CustomArmorMaterial, 0, 1, "CustomChest");
        customLeggings = new CustomArmor(ExampleMod.CUstomArmorMaterial, 0, 2, "CustomLeggings");
        customBoots = new CustomArmor(ExampleMod.CUstomArmorMaterial, 0, 3, "CustomBoots");
    }
 
    public static void registerItem() {
        GameRegistry.registerItem(customItem, customItem.name);
        GameRegistry.registerItem(customPickaxe, customPickaxe.name);
        GameRegistry.registerItem(customHelm, customHelm.name);
        GameRegistry.registerItem(customSword, customSword.name);
        GameRegistry.registerItem(customShovel, customShovel.name);
        GameRegistry.registerItem(customAxe, customAxe.name);
        GameRegistry.registerItem(customHoe, customHoe.name);
        GameRegistry.registerItem(customChest, customChest.name);
        GameRegistry.registerItem(customLeggings, customLeggings.name);
        GameRegistry.registerItem(customBoots, customBoots.name);
        
       
        
    }
 
}