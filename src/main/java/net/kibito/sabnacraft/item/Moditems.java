package net.kibito.sabnacraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kibito.sabnacraft.Sabnacraft;
import net.kibito.sabnacraft.item.custom.ScanerItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

public class Moditems {
    public static final Item PEEPER = registerItem("peeper",new Item(new FabricItemSettings()));
    public static final Item RAW_SILVER = registerItem("raw_silver",new Item(new FabricItemSettings()));
    public static final Item KYANITE = registerItem("kyanite",new Item(new FabricItemSettings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot",new Item(new FabricItemSettings()));
    public static final Item ADVANCED_WIRING_KIT = registerItem("advanced_wiring_kit",new Item(new FabricItemSettings()));
    public static final Item WIRING_KIT = registerItem("wiring_kit",new Item(new FabricItemSettings()));
    public static final Item COMPUTER_CHIP = registerItem("computer_chip",new Item(new FabricItemSettings()));
    public static final Item CRYSTAL_FLINT = registerItem("crystal_flint",new Item(new FabricItemSettings()));
    public static final Item ION_CUBE = registerItem("ion_cube",new Item(new FabricItemSettings()));
    public static final Item RAW_LITHIUM = registerItem("raw_lithium",new Item(new FabricItemSettings()));
    public static final Item RAW_NICKEL = registerItem("raw_nickel",new Item(new FabricItemSettings()));
    public static final Item NICKEL_INGOT = registerItem("nickel_ingot",new Item(new FabricItemSettings()));
    public static final Item SCANER = registerItem("scaner",
            new ScanerItem(new FabricItemSettings().maxDamage(64)));

    private static void addItemToIngredientTabItemGroup(@NotNull FabricItemGroupEntries entries){
        entries.add(RAW_SILVER);
    }

    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM, new Identifier(Sabnacraft.MOD_ID, name),item);
    }
    public static  void registerModItems(){
        Sabnacraft.LOGGER.info("Register mod item for" + Sabnacraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Moditems::addItemToIngredientTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Moditems::addItemToIngredientTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Moditems::addItemToIngredientTabItemGroup);
    }

}
