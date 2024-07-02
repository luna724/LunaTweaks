package com.luna724.lunatweaks;

import com.luna724.lunatweaks.mixin.MixinGuiChest;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChestTextureHandler {

    private static final ResourceLocation SMALL_CHEST_TEXTURE = new ResourceLocation("ltweaks", "textures/gui/container/generic_27.png");
    private static final ResourceLocation LARGE_CHEST_TEXTURE = new ResourceLocation("minecraft", "textures/gui/container/generic_54.png");

    @SubscribeEvent
    public void onGuiOpen(GuiOpenEvent event) {
        if (event.getGui() instanceof GuiChest) {
            GuiChest guiChest = (GuiChest) event.getGui();
            IInventory lowerChestInventory = ((MixinGuiChest) guiChest).getLowerChestInventory();

            if (lowerChestInventory.getSizeInventory() == 27) {
                Minecraft.getMinecraft().getTextureManager().bindTexture(SMALL_CHEST_TEXTURE);
            } else if (lowerChestInventory.getSizeInventory() == 54) {
                Minecraft.getMinecraft().getTextureManager().bindTexture(LARGE_CHEST_TEXTURE);
            }
        }
    }
}
