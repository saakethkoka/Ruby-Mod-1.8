package com.camp.item;
 
import com.example.examplemod.ExampleMod;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
 
public class CustomSword extends ItemSword{
 
    public final String name = "CustomSword";
     
    protected CustomSword(ToolMaterial ruby) {
        super(ruby);
        this.setUnlocalizedName(ExampleMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabTools);
        // TODO Auto-generated constructor stub
    }
     
 
}