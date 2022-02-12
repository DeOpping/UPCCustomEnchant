package dev.deopping.tutorialenchant;

import dev.deopping.tutorialenchant.enchants.TutorialEnchant;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin enabled!");

        if (Bukkit.getPluginManager().getPlugin("UltraPrisonCore") == null) {
            this.getLogger().warning("Unable to hook into UltraPrisonCore! Disabling...");
            this.getServer().getPluginManager().disablePlugin(this);
            return;
        }

        getLogger().info("Registering enchants...");
        this.tutorialEnchant = new TutorialEnchant();
        tutorialEnchant.register();
        getLogger().info("Registered any enchants!");

    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled!");
    }

    // Initializations
    private TutorialEnchant tutorialEnchant;
    public TutorialEnchant getTutorialEnchant() {
        return tutorialEnchant;
    }

}