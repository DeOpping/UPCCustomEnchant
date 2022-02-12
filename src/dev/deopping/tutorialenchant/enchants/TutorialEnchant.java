package dev.deopping.tutorialenchant.enchants;

import me.drawethree.ultraprisoncore.enchants.UltraPrisonEnchants;
import me.drawethree.ultraprisoncore.enchants.enchants.UltraPrisonEnchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class TutorialEnchant extends UltraPrisonEnchantment {

    private final double chance;

    public TutorialEnchant() {
        super(UltraPrisonEnchants.getInstance(), 99);
        this.chance = this.plugin.getConfig().get().getDouble("enchants." + id + ".Chance");
    }

    @Override
    public String getAuthor() {
        return "Mantice";
    }

    @Override
    public void onEquip(Player player, ItemStack itemStack, int i) {
        player.sendMessage("You equipped the pickaxe!");
    }

    @Override
    public void onUnequip(Player player, ItemStack itemStack, int i) {
        player.sendMessage("You unequipped the pickaxe!");
    }

    @Override
    public void onBlockBreak(BlockBreakEvent blockBreakEvent, int i) {
        Player player = blockBreakEvent.getPlayer();
        player.sendMessage("You broke a block!");
    }

    @Override
    public void reload() {

    }
}
