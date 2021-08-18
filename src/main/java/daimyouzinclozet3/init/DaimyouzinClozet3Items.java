package daimyouzinclozet3.init;

import java.util.LinkedList;
import java.util.List;

import daimyouzinclozet3.main.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DaimyouzinClozet3Items {

	/* アイテムのインスタンスを生成 Instantiate an item. */
    public static void init() { }


    /* アイテムを登録する、ここから Register Items. From here. ↓*/
    public static void register() { }

    public static void registerItem(Item item) {
        RegistrationHandler.ITEMS.add(item);
    }
    /*ここまで So far↑ */


    /* ドロップ時やインベントリにおける、アイテムやアイテムブロックの描画を登録。ここから↓
     * Register rendering of Items and ItemBlocks in drop and inventory. From here↓*/
     public static void registerRenders() { }

     @SuppressWarnings("unused")
	private static void registerRender(Item item) {
         ModelLoader.setCustomModelResourceLocation(item, 0,
                 new ModelResourceLocation(item.getRegistryName(),"inventory"));
     }
     /*ここまで So far↑ */

     /* ------------------------------------------------------------------------
      * ここから From here. ↓ */

     /* アイテムやアイテムブロックを登録する【内部クラス】
     * Register Items and ItemBlocks. 【Inner Classs】 */
     @Mod.EventBusSubscriber(modid = Reference.MOD_ID)
     public static class RegistrationHandler {

         public static final List<Item> ITEMS = new LinkedList<>();

         @SubscribeEvent
         public static void registerItems(final RegistryEvent.Register<Item> event) {

            DaimyouzinClozet3Items.init();
             DaimyouzinClozet3Items.register();
             ITEMS.stream().forEach(item -> event.getRegistry().register(item));
         }
     }

}
