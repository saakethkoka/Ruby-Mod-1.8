package comp.camp.block;
 
import net.minecraftforge.fml.common.registry.GameRegistry;
 
 
public class BlockManager {
 
    public static CustomBlock customBlock;
    public static CustomBlock2 customBlock2; 
    
    public static void mainRegistry() {
        initializeBlock();
        registerBlock();
    }
 
    public static void initializeBlock() {
        customBlock = new CustomBlock();
        customBlock2 = new CustomBlock2();
        
    }
 
    public static void registerBlock() {
        GameRegistry.registerBlock(customBlock, customBlock.name);
        GameRegistry.registerBlock(customBlock2, customBlock2.name);
    }
 
}