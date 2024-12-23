package org.klepticat.ghostcraft.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.component.type.FoodComponents;

public class ModFoodComponents extends FoodComponents {
    public static final FoodComponent CHOCOLATE = new FoodComponent.Builder().nutrition(2).saturationModifier(0.1F).build();
}
