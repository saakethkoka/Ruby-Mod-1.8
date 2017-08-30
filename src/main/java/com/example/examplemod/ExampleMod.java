package com.example.examplemod;
 
import com.camp.item.ItemManager;
import com.camp.world.CustomWorldGenerator;

import comp.camp.block.BlockManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBase.Height;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
 
@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    public static BiomeGenBase customBiome;
    public static CustomWorldGenerator customOreGenerator;    
public static ToolMaterial customToolMaterial;
public static ToolMaterial CUSTOMToolmaterial;
public static ToolMaterial CustomToolMaterial;
public static ToolMaterial CUSTOMTOOLMATERIAL;
public static ToolMaterial CUSTOMToolMATERIAL;
public static ToolMaterial CuStOmToOlMaTeRiAl;
public static ArmorMaterial customArmorMaterial;
public static ArmorMaterial CustomArmorMaterial;
public static ArmorMaterial CUstomArmorMaterial;
public static ArmorMaterial CUStomArmorMaterial;
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	customArmorMaterial =EnumHelper.addArmorMaterial("Ruby", "customarmor", 2000 , new int[]{4,9,7,4},4);
        customToolMaterial = EnumHelper.addToolMaterial("Ruby", 3, 1000, 12, 4.0f, 20);
        CUSTOMToolmaterial = EnumHelper.addToolMaterial("Ruby", 3, 1000, 4, 4.0f, 20);
        CustomToolMaterial = EnumHelper.addToolMaterial("Ruby", 3, 1000, 13, 4.0f, 20);
        CUSTOMTOOLMATERIAL = EnumHelper.addToolMaterial("Ruby", 3, 1000, 12, 4.0f, 20);
        CUSTOMToolMATERIAL = EnumHelper.addToolMaterial("Ruby", 3, 1000, 4, 4.0f, 20);
        CuStOmToOlMaTeRiAl = EnumHelper.addToolMaterial("Ruby", 3, 1000, 12, 4.0f, 20);
        CustomArmorMaterial =EnumHelper.addArmorMaterial("Ruby", "customarmor", 2000 , new int[]{4,9,7,4},4);
        CUstomArmorMaterial =EnumHelper.addArmorMaterial("Ruby", "customarmor", 2000 , new int[]{4,9,7,4},4);
        CUStomArmorMaterial =EnumHelper.addArmorMaterial("Ruby", "customarmor", 2000 , new int[]{4,9,7,4},4);
        
        ItemManager.mainRegistry();
        BlockManager.mainRegistry();
        }
    
    @EventHandler
    public void preLoad(FMLPreInitializationEvent event)
    {
        
    }
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        if(event.getSide().isClient())
        {
            
        }
    }
    
    @SideOnly(Side.CLIENT)
    public static void registerItem(Item item, int metadata, String itemName)
    {
        ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
        mesher.register(item, metadata, new ModelResourceLocation(itemName, "inventory"));
    }
    
    @EventHandler
    
  
   
    public void init(FMLInitializationEvent event)
    {
        // some example code
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.customSword,1), " x ", " x ", " y ", 'x', ItemManager.customItem, 'y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.customPickaxe,1), "xxx", " y ", " y ", 'x', ItemManager.customItem, 'y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.customShovel,1), " x ", " y ", " y ", 'x', ItemManager.customItem, 'y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.customAxe,1), "xx ", "xy ", " y ", 'x', ItemManager.customItem, 'y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.customHoe,1), "xx ", " y ", " y ", 'x', ItemManager.customItem, 'y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(BlockManager.customBlock), "xxx", "xxx", "xxx", 'x', ItemManager.customItem, 'y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.customHelm,1),"xxx", "x x", 'x', ItemManager.customItem, 'y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.customChest), "x x", "xxx", "xxx", 'x', ItemManager.customItem, 'y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.customLeggings), "xxx", "x x", "x x", 'x', ItemManager.customItem, 'y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.customBoots),"x x", "x x", 'x', ItemManager.customItem, 'y', Items.stick);
        customOreGenerator = new CustomWorldGenerator();
        GameRegistry.registerWorldGenerator(customOreGenerator, 2);
        GameRegistry.addSmelting(new ItemStack(BlockManager.customBlock2),new ItemStack(ItemManager.customItem, 1), 0.5f);
        
       
        if(event.getSide() == Side.CLIENT)
        {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
 
            renderItem.getItemModelMesher().register(ItemManager.customItem, 0, new ModelResourceLocation(this.MODID + ":" + ItemManager.customItem.name, "inventory"));
            renderItem.getItemModelMesher().register(Item.getItemFromBlock(BlockManager.customBlock), 0, new ModelResourceLocation(this.MODID + ":" + BlockManager.customBlock.name, "inventory"));
            renderItem.getItemModelMesher().register(Item.getItemFromBlock(BlockManager.customBlock2), 0, new ModelResourceLocation(this.MODID + ":" + BlockManager.customBlock2.name, "inventory"));
            renderItem.getItemModelMesher().register(ItemManager.customPickaxe, 0, new ModelResourceLocation(this.MODID + ":" + ItemManager.customPickaxe.name, "inventory"));
            renderItem.getItemModelMesher().register(ItemManager.customSword, 0, new ModelResourceLocation(this.MODID + ":" + ItemManager.customSword.name, "inventory"));
            renderItem.getItemModelMesher().register(ItemManager.customShovel, 0, new ModelResourceLocation(this.MODID + ":" + ItemManager.customShovel.name, "inventory"));
            renderItem.getItemModelMesher().register(ItemManager.customAxe, 0, new ModelResourceLocation(this.MODID + ":" + ItemManager.customAxe.name, "inventory"));
            renderItem.getItemModelMesher().register(ItemManager.customHoe, 0, new ModelResourceLocation(this.MODID + ":" + ItemManager.customHoe.name, "inventory"));
            renderItem.getItemModelMesher().register(ItemManager.customHelm, 0, new ModelResourceLocation(this.MODID + ":" + ItemManager.customHelm.name, "inventory"));
            renderItem.getItemModelMesher().register(ItemManager.customChest, 0, new ModelResourceLocation(this.MODID + ":" + ItemManager.customChest.name, "inventory"));
            renderItem.getItemModelMesher().register(ItemManager.customLeggings, 0, new ModelResourceLocation(this.MODID + ":" + ItemManager.customLeggings.name, "inventory"));
            renderItem.getItemModelMesher().register(ItemManager.customBoots, 0, new ModelResourceLocation(this.MODID + ":" + ItemManager.customBoots.name, "inventory"));

            
        }
        //int biomeId = getEmptyBiomeID();
        //customBiome = new CustomBiome(biomeId, true).setBiomeName("Ancient lands").setHeight(new Height(1.5f, 0.05f));
        //BiomeEntry customEntry = new BiomeEntry(customBiome, 150);
        //BiomeManager.addBiome(BiomeType.WARM, customEntry);
        //BiomeManager.addSpawnBiome(customBiome);
    //}
 
    //private static int lastBiomeID = 0;
    //public static int getEmptyBiomeID(){
       // int i;
       // BiomeGenBase[] array = BiomeGenBase.getBiomeGenArray();
        //loop through biome array to find an empty id.
        //for(i = lastBiomeID; i < array.length; i++){
            //if( array[i] == null){
                // Found an empty spot
                // Set lastBiomeID then return index.
                //lastBiomeID = i;
                //return i;
            //}
        //}
        // didn't find an empty spot
        //return -1;
        
        
        }
    }


