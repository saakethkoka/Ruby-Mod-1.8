package com.camp.item;
 
import com.example.examplemod.ExampleMod;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
 
public class CustomAxe extends ItemAxe{
 
    public final String name = "CustomAxe";
     
    protected CustomAxe(ToolMaterial ruby) {
        super(ruby);
        this.setUnlocalizedName(ExampleMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabTools);
        
    }
     
 
}