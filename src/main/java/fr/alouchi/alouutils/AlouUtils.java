package fr.alouchi.alouutils;

import fr.alouchi.alouutils.command.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class AlouUtils extends JavaPlugin {

    private static AlouUtils instance;
    @Override
    public void onEnable() {
        instance = this;
        registerEvent();
        registerCommand();
    }

    @Override
    public void onDisable() {

    }

    public static AlouUtils getInstance() {
        return instance;
    }

    private void registerEvent() {
        PluginManager pluginManager = Bukkit.getPluginManager();
    }

    private void registerCommand() {
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("gm").setExecutor(new GamamodeCommand());
        getCommand("kickall").setExecutor(new KickAllCommand());
        getCommand("enderchest").setExecutor(new EnderChestCommand());
        getCommand("god").setExecutor(new GodCommand());
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("heal").setExecutor(new HealCommand());
    }
}