package org.example;

import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {


    private static Plugin instance;

    public static Plugin getInstance() {
        return instance;
    }


    @Override
    public void onEnable() {
        instance = this;

    }


    @Override
    public void onDisable() {
        instance = null;
    }

}