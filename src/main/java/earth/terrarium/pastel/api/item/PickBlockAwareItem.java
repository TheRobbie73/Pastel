package earth.terrarium.pastel.api.item;

import net.minecraft.world.item.ItemStack;

public interface PickBlockAwareItem {
    void onPickBlock(ItemStack stack);
}
