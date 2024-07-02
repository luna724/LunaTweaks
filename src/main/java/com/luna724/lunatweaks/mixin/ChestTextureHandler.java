package com.luna724.lunatweaks.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiChest.class)
public class ChestTextureHandler {

    private static final ResourceLocation SMALL_CHEST_TEXTURE = new ResourceLocation("ltweaks", "textures/gui/container/generic_27.png");
    private static final ResourceLocation LARGE_CHEST_TEXTURE = new ResourceLocation("minecraft", "textures/gui/container/generic_54.png");

    @Inject(method = "drawScreen", at = @At("HEAD"))
    private void onDrawScreen(int mouseX, int mouseY, float partialTicks, CallbackInfo info) {
        GuiChest guiChest = (GuiChest) (Object) this;
        IInventory lowerChestInventory = ((MixinGuiChest) guiChest).getLowerChestInventory();

        if (lowerChestInventory.getSizeInventory() == 27) {
            Minecraft.getMinecraft().getTextureManager().bindTexture(SMALL_CHEST_TEXTURE);
        } else if (lowerChestInventory.getSizeInventory() == 54) {
            Minecraft.getMinecraft().getTextureManager().bindTexture(LARGE_CHEST_TEXTURE);
        }
    }
}
