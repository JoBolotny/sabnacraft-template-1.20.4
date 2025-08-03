package net.kibito.sabnacraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.kibito.sabnacraft.block.ModBlocks;
import net.kibito.sabnacraft.item.Moditems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }



    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SILVER_ORE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.KYANITE_CLUSTER,Blocks.GLASS_PANE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(Moditems.RUBY, Models.GENERATED);
        itemModelGenerator.register(Moditems.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(Moditems.WIRING_KIT, Models.GENERATED);
        itemModelGenerator.register(Moditems.ADVANCED_WIRING_KIT, Models.GENERATED);
        itemModelGenerator.register(Moditems.CRYSTAL_FLINT, Models.GENERATED);
        itemModelGenerator.register(Moditems.COMPUTER_CHIP, Models.GENERATED);
        itemModelGenerator.register(Moditems.POWER_CELL, Models.GENERATED);
        itemModelGenerator.register(Moditems.BATTERY, Models.GENERATED);
        itemModelGenerator.register(Moditems.ION_POWER_CELL, Models.GENERATED);
        itemModelGenerator.register(Moditems.ION_BATTERY, Models.GENERATED);
        itemModelGenerator.register(Moditems.RAW_LITHIUM, Models.GENERATED);
        itemModelGenerator.register(Moditems.RAW_NICKEL, Models.GENERATED);
        itemModelGenerator.register(Moditems.SULPHUR, Models.GENERATED);
        itemModelGenerator.register(Moditems.GEL_SACK, Models.GENERATED);
        itemModelGenerator.register(Moditems.RUBBER, Models.GENERATED);
        itemModelGenerator.register(Moditems.LITHIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(Moditems.NICKEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(Moditems.KYANITE, Models.GENERATED);
        itemModelGenerator.register(Moditems.SILVER_INGOT, Models.GENERATED);


        itemModelGenerator.register(Moditems.ION_CUBE, Models.GENERATED);
        itemModelGenerator.register(Moditems.PEEPER, Models.GENERATED);
        itemModelGenerator.register(Moditems.COOKED_PEEPER, Models.GENERATED);
        itemModelGenerator.register(Moditems.SCANER, Models.GENERATED);
    }
}
