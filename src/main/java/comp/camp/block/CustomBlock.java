package comp.camp.block;
 
import com.example.examplemod.ExampleMod;
 
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
 
public class CustomBlock extends Block {
 
    public static final String name = "CustomBlock";
     
    public CustomBlock() {
        super(Material.rock);
        this.setUnlocalizedName(ExampleMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setHardness(5.0f);
        this.setHarvestLevel("pickaxe", 3);
    }
 
}