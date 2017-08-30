package com.camp.item;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

import com.example.examplemod.ExampleMod;
 
public class CustomShovel extends ItemSpade{
 
    public final String name = "CustomShovel";
     
    protected CustomShovel(ToolMaterial ruby) {
        super(ruby);
        this.setUnlocalizedName(ExampleMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabTools);
        // TODO Auto-generated constructor stub
    }
     
 
}