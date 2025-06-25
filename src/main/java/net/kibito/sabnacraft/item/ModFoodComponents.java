package net.kibito.sabnacraft.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent PEEPER = new FoodComponent.Builder().hunger(2).saturationModifier(0.25f)
            .build();
    public static final FoodComponent COOKED_PEEPER = new FoodComponent.Builder().hunger(10).saturationModifier(5f)
            .build();
}
