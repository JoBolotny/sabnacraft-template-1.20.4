package net.kibito.sabnacraft.item.custom;

import net.kibito.sabnacraft.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class ScanerItem extends Item {
    public ScanerItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        BlockPos pos = context.getBlockPos();

        if (!world.isClient() && player != null) {
            BlockState state = world.getBlockState(pos);
            Block block = state.getBlock();

            // Отправляем информацию о блоке
            sendBlockInfo(player, block);

            // Показываем рецепт в чате
            showRecipe(player, block);

            // Наносим урон предмету
            context.getStack().damage(1, player,
                    p -> p.sendToolBreakStatus(context.getHand()));
        }

        return ActionResult.SUCCESS;
    }

    private void sendBlockInfo(PlayerEntity player, Block block) {
        String blockName = block.getName().getString();
        String hardness = String.format("%.1f", block.getHardness());
        String resistance = String.format("%.1f", block.getBlastResistance());

        player.sendMessage(Text.literal("=== Информация о блоке ==="), false);
        player.sendMessage(Text.literal("Название: " + blockName), false);
        player.sendMessage(Text.literal("Твёрдость: " + hardness), false);
        player.sendMessage(Text.literal("Взрыв. стойкость: " + resistance), false);

        if (block == Blocks.AIR) {
            player.sendMessage(Text.literal("Это воздух!"), false);
        }
    }

    private void showRecipe(PlayerEntity player, Block block) {
        // Здесь можно добавить свои собственные рецепты
        if (block == Blocks.CRAFTING_TABLE) {
            player.sendMessage(Text.literal("Тут можно сделать почти всё!"), false);
        }
        else if (block == Blocks.FURNACE) {
            player.sendMessage(Text.literal("Тут можно плавить предметы"), false);
        } else if (block == ModBlocks.SILVER_ORE) {
            player.sendMessage(Text.literal("Можно переплавить и получить серебряный слиток"), false);
        } else {
            player.sendMessage(Text.literal("Этот блок изучен вами"), false);
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("ПКМ по блоку для сканирования"));
        tooltip.add(Text.literal("Прочность: " + (stack.getMaxDamage() - stack.getDamage()) + "/" + stack.getMaxDamage()));
    }
}
