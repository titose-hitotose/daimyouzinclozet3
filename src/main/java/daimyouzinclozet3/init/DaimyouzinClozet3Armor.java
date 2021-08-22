package daimyouzinclozet3.init;

import java.util.LinkedList;
import java.util.List;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DaimyouzinClozet3Armor {


	public static void init() {
		//アイテムのインスタンス(実体)生成

	}

	public static void register() {

	}

	public static void registerItem(Item item) {
		RegistrationHandler.ITEMS.add(item);
	}

	public static void registerRenders() {
		//アイテムのモデルを登録

	}

	@SuppressWarnings("unused")
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}

	@Mod.EventBusSubscriber(modid = daimyouzinclozet3.main.Reference.MOD_ID)
	public static class RegistrationHandler {

		public static final List<Item> ITEMS = new LinkedList<>();

		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {

			DaimyouzinClozet3Armor.init();
			DaimyouzinClozet3Armor.register();
			ITEMS.stream().forEach(item -> event.getRegistry().register(item));
		}
	}
}
