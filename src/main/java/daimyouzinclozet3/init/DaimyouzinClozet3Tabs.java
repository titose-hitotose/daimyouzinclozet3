package daimyouzinclozet3.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;


public class DaimyouzinClozet3Tabs {

	public static final CreativeTabs kabureru = new CreativeTabs("kabureru") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(DaimyouzinClozet3Blocks.katura01);
		}

	};

}
