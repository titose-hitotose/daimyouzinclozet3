package daimyouzinclozet3.init;

import java.util.LinkedList;
import java.util.List;

import daimyouzinclozet3.init.block.Katura01;
import daimyouzinclozet3.main.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DaimyouzinClozet3Blocks {

	public static Block katura01;

	 /* ブロックのインスタンスを生成 Instantiate blocks. */
    public static void init() {

    	 katura01 = new Katura01().setRegistryName("katura01")
         		.setUnlocalizedName("katura01").setCreativeTab(DaimyouzinClozet3Tabs.kabureru);
    }

    /* ブロックを登録する、ここから Register Blocks. From here. ↓*/
    public static void register() {

    	 registerBlock(katura01,new ItemBlock_DC3_EquipeHead(katura01));

    }

    /** ブロックの登録 Register Blocks. **/
    public static void registerBlockNotItem(Block block) {
        registerBlock(block, new ItemBlock(block));
    }

    /** アイテムブロックの登録 Register ItemBlocks. **/
    public static void registerBlock(Block block, ItemBlock item) {
        RegistrationHandler.BLOCKS.add(block);
        item.setRegistryName(block.getRegistryName());
        DaimyouzinClozet3Items.RegistrationHandler.ITEMS.add(item);
    }

    /*ここまで So far↑ */

    /* ドロップ時やインベントリにおける、アイテムブロックの描画を登録。ここから↓
     * Register rendering of ItemBlocks in drop and inventory. From here↓*/
     public static void registerRenders() {

    	 registerRender(katura01);

     }

     @SideOnly(Side.CLIENT)
     private static void registerRender(Block block) {
         ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
                 new ModelResourceLocation(block.getRegistryName(),"inventory"));
     }


     /*ここまで So far↑ */

     /* ------------------------------------------------------------------------
      * ここから From here. ↓ */

     /* ブロックの登録を行う【内部クラス】
      * Register blocks 【Inner Class】 */
     @Mod.EventBusSubscriber(modid = Reference.MOD_ID)
     public static class RegistrationHandler {

         public static final List<Block> BLOCKS = new LinkedList<>();

         @SubscribeEvent
         public static void registerItems(final RegistryEvent.Register<Block> event) {

             DaimyouzinClozet3Blocks.init();
             DaimyouzinClozet3Blocks.register();
             BLOCKS.stream().forEach(block -> event.getRegistry().register(block));
         }
     }
}
