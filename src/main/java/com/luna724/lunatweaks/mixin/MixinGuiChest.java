package com.luna724.lunatweaks.mixin;

import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.inventory.IInventory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(GuiChest.class)
public interface MixinGuiChest {
    @Accessor("lowerChestInventory")
    IInventory getLowerChestInventory();
}
