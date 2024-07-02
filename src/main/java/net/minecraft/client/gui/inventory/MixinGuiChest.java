package net.minecraft.client.gui.inventory;

import com.luna724.lunatweaks.GuiChestAccessor;
import net.minecraft.inventory.IInventory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(GuiChest.class)
public abstract class MixinGuiChest implements GuiChestAccessor {

    @Shadow
    private IInventory lowerChestInventory;

    @Override
    public IInventory getLowerChestInventory() {
        return lowerChestInventory;
    }
}
