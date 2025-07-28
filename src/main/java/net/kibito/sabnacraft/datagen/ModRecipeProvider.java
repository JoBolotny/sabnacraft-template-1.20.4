package net.kibito.sabnacraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.kibito.sabnacraft.block.ModBlocks;
import net.kibito.sabnacraft.item.Moditems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> SILVER_SMETABLES = List.of(Moditems.RAW_SILVER, ModBlocks.DEEPSLATE_SILVER_ORE,ModBlocks.SILVER_ORE);
    private static final List<ItemConvertible> FLINT = List.of(Items.FLINT);
    private static final List<ItemConvertible> PEEPER = List.of(Moditems.PEEPER);
    private static final List<ItemConvertible> NICKEL = List.of(Moditems.RAW_NICKEL);
    private static final List<ItemConvertible> LITHIUM = List.of(Moditems.RAW_LITHIUM);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, SILVER_SMETABLES, RecipeCategory.MISC, Moditems.SILVER_INGOT,
                0.7f, 200,"silver");
        offerBlasting(exporter, SILVER_SMETABLES, RecipeCategory.MISC, Moditems.SILVER_INGOT,
                0.7f, 100,"silver");
        offerBlasting(exporter, FLINT,RecipeCategory.MISC, Moditems.CRYSTAL_FLINT,
                0.7f,200,"flint");
        offerSmelting(exporter, FLINT,RecipeCategory.MISC, Moditems.CRYSTAL_FLINT,
                0.7f,400,"flint");
        offerSmelting(exporter, PEEPER,RecipeCategory.MISC, Moditems.COOKED_PEEPER,
                0.7f,200,"peeper");
        offerSmelting(exporter, NICKEL,RecipeCategory.MISC, Moditems.NICKEL_INGOT,
                0.7f,200,"nickel");
        offerBlasting(exporter, NICKEL,RecipeCategory.MISC, Moditems.NICKEL_INGOT,
                0.7f,200,"nickel");
        offerSmelting(exporter, LITHIUM,RecipeCategory.MISC, Moditems.LITHIUM_INGOT,
                0.7f,200,"lithium");
        offerBlasting(exporter, LITHIUM,RecipeCategory.MISC, Moditems.LITHIUM_INGOT,
                0.7f,200,"lithium");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Moditems.SILVER_INGOT,RecipeCategory.DECORATIONS,
                ModBlocks.SILVER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, Moditems.RUBY,RecipeCategory.DECORATIONS,
                ModBlocks.RUBY_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.WIRING_KIT, 1)
                .pattern(" s ")
                .pattern("crc")
                .pattern(" s ")
                .input('s', Moditems.SILVER_INGOT)
                .input('c', Items.COPPER_INGOT)
                .input('r', Items.REDSTONE)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Moditems.SILVER_INGOT), conditionsFromItem(Moditems.SILVER_INGOT))
                        .offerTo(exporter,new Identifier(getRecipeName(Moditems.WIRING_KIT)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.WIRING_KIT, 1)
                .pattern("fif")
                .pattern("cgc")
                .pattern("frf")
                .input('g',Items.GOLD_INGOT)
                .input('r',Items.REDSTONE)
                .input('c',Items.COPPER_INGOT)
                .input('i',Items.IRON_INGOT)
                .input('f',Moditems.CRYSTAL_FLINT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Moditems.CRYSTAL_FLINT), conditionsFromItem(Moditems.CRYSTAL_FLINT))
                        .offerTo(exporter,new Identifier(getRecipeName(Moditems.COMPUTER_CHIP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.ADVANCED_WIRING_KIT, 1)
                .pattern(" g ")
                .pattern("w c")
                .pattern(" g ")
                .input('g',Items.GOLD_INGOT)
                .input('w',Moditems.WIRING_KIT)
                .input('c',Moditems.COMPUTER_CHIP)
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Moditems.WIRING_KIT),conditionsFromItem(Moditems.WIRING_KIT))
                .criterion(hasItem(Moditems.COMPUTER_CHIP),conditionsFromItem(Moditems.COMPUTER_CHIP))
                        .offerTo(exporter,new Identifier(getRecipeName(Moditems.ADVANCED_WIRING_KIT)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LODESTONE, 1)
                .pattern("sss")
                .pattern("scs")
                .pattern("sss")
                .input('s', Items.CHISELED_STONE_BRICKS)
                .input('c', Items.COPPER_INGOT)
                .criterion(hasItem(Items.CHISELED_STONE_BRICKS),conditionsFromItem(Items.CHISELED_STONE_BRICKS))
                        .offerTo(exporter,new Identifier(getRecipeName(Items.LODESTONE)));




    }
}
