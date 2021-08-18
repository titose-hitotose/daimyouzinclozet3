package daimyouzinclozet3.proxy;

import daimyouzinclozet3.init.DaimyouzinClozet3Armor;
import daimyouzinclozet3.init.DaimyouzinClozet3Blocks;
import daimyouzinclozet3.init.DaimyouzinClozet3Items;
import daimyouzinclozet3.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

public class ClientProxy {

	public static boolean rendering = false;
	public static Entity renderEntity = null;
	public static Entity backupEntity = null;

	/* エンティティの登録、コンフィグ読込など
	* Register Entity and Config. */
	public void preInit() { }

	/* レシピ・鉱石などの追加 Register Recipe and Ore. */
	public void init() { }

	/* 他Modとの連携 Cooperation with other Mod. */
	public void postInit() { }

	/* シングルプレイかどうか Single play or not? */
	public boolean isSinglePlayer() {
		return Minecraft.getMinecraft().isSingleplayer();
	}

	/* サーバープレイかどうか Sever play or not? */
	public boolean isDedicatedServer() {
		return false;
	}


    /* ------------------------------------------------------------------------
     * ここから From here. ↓ */

	/* ドロップ時やインベントリにおける、アイテムやアイテムブロックの描画を登録する【内部クラス】
	 * Register rendering of Items and ItemBlocks in drop and inventory. 【Inner Classs】 */
	@Mod.EventBusSubscriber(modid = Reference.MOD_ID, value = Side.CLIENT)
	public static class RegistrationHandler {

		@SubscribeEvent
		public static void registerModels(ModelRegistryEvent event) {
			DaimyouzinClozet3Blocks.registerRenders();
			DaimyouzinClozet3Armor.registerRenders();
			DaimyouzinClozet3Items.registerRenders();




		}


}
}
