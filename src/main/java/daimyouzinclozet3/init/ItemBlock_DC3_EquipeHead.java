package daimyouzinclozet3.init;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlock_DC3_EquipeHead extends ItemBlock{

	    public ItemBlock_DC3_EquipeHead(Block block) {
	        super(block);
	    }


	@Override

	public boolean isValidArmor(ItemStack stack, EntityEquipmentSlot armorType, Entity entity) {
	if(armorType == EntityEquipmentSlot.HEAD) {
	return true;
	}else {
	return false;
	}
	}

	}
