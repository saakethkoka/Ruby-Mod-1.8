package com.camp.item;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

import com.example.examplemod.ExampleMod;
 
public class CustomHoe extends ItemHoe{
 
    public final String name = "CustomHoe";
     
    protected CustomHoe(ToolMaterial ruby) {
        super(ruby);
        this.setUnlocalizedName(ExampleMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabTools);
        // TODO Auto-generated constructor stub
    }
     
 
}