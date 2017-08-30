package com.camp.item;
 
import com.example.examplemod.ExampleMod;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
 
public class CustomPickaxe extends ItemPickaxe{
 
    public final String name = "CustomPickaxe";
     
    protected CustomPickaxe(ToolMaterial ruby) {
        super(ruby);
        this.setUnlocalizedName(ExampleMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabTools);
        
        // TODO Auto-generated constructor stub
    }
     
 
}