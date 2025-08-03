package net.kibito.sabnacraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kibito.sabnacraft.Sabnacraft;
import net.kibito.sabnacraft.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup SABNACRAFT = Registry.register(Registries.ITEM_GROUP,new Identifier(Sabnacraft.MOD_ID,"sabnacraft"),
            FabricItemGroup.builder().displayName(Text.translatable("sabnacraft"))
                    .icon(() ->new ItemStack(Moditems.PEEPER)).entries((displayContext, entries) -> {
                entries.add(Moditems.KYANITE);
                entries.add(Moditems.RAW_SILVER);
                entries.add(Moditems.SILVER_INGOT);
                entries.add(Moditems.WIRING_KIT);
                entries.add(Moditems.ADVANCED_WIRING_KIT);
                entries.add(Moditems.COMPUTER_CHIP);
                entries.add(Moditems.CRYSTAL_FLINT);
                entries.add(Moditems.SCANER);
                entries.add(Moditems.ION_CUBE);
                entries.add(Moditems.RAW_LITHIUM);
                entries.add(Moditems.RAW_NICKEL);
                entries.add(Moditems.NICKEL_INGOT);
                entries.add(Moditems.PEEPER);
                entries.add(Moditems.COOKED_PEEPER);
                entries.add(Moditems.BATTERY);
                entries.add(Moditems.ION_BATTERY);
                entries.add(Moditems.POWER_CELL);
                entries.add(Moditems.ION_POWER_CELL);
                entries.add(Moditems.GEL_SACK);
                entries.add(Moditems.LITHIUM_INGOT);
                entries.add(Moditems.RUBBER);
                entries.add(Moditems.RUBY);
                entries.add(Moditems.SULPHUR);

                entries.add(ModBlocks.SILVER_BLOCK);
                entries.add(ModBlocks.RUBY_BLOCK);
                entries.add(ModBlocks.SILVER_ORE);
                entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);
                entries.add(ModBlocks.KYANITE_CLUSTER);

                    }).build() );

    public static void registerItemGroup(){
        Sabnacraft.LOGGER.info("Registered Item Groups for" + Sabnacraft.MOD_ID);
    }
}
