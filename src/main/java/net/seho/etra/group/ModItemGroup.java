package net.seho.etra.group;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup ETRA_TAB = new ItemGroup("etraTab") {
        @Override
        public ItemStack makeIcon() {
            return null;
        }
    };

}
