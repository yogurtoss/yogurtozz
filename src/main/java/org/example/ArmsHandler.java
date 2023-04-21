package org.example;


import org.bukkit.entity.Item;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ArmsHandler {

    public static void handle(Gun gun, Player player) {
        ItemStack gunItem = new ItemStack(gun.getGunMaterial());

        ItemMeta meta = gunItem.getItemMeta();
        meta.setDisplayName(gun.getName());

        gunItem.setItemMeta(meta);

        player.getInventory().addItem(gunItem);

    }

}
