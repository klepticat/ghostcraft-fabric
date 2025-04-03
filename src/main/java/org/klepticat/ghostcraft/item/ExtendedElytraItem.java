package org.klepticat.ghostcraft.item;

import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ExtendedElytraItem extends ElytraItem {
    public Identifier TEXTURE = Identifier.ofVanilla("textures/entity/elytra.png");

    public static boolean itemIsElytra(ItemStack instance) {
        return instance.getItem() instanceof ElytraItem;
    }

    public ExtendedElytraItem(Settings settings, Identifier texture) {
        this(settings);
        this.TEXTURE = texture;
    }

    private ExtendedElytraItem(Settings settings) {
        super(settings);
    }
}
