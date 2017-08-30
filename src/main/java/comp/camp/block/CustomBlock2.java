package comp.camp.block;
 
import com.example.examplemod.ExampleMod;
 
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
 
public class CustomBlock2 extends Block {
 
    public static final String name = "CustomBlock2";
     
    public CustomBlock2() {
        super(Material.rock);
        this.setUnlocalizedName(ExampleMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setHardness(5.0f);
        this.setHarvestLevel("pickaxe", 3);

    }
 
}