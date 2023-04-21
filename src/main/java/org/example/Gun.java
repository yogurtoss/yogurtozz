package org.example;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public enum Gun {

    AK47(10, 30, "AK47", Material.COAL_ORE),
    GLOCK(4, 20, "Glock-17", Material.INK_SACK);

    public static Gun getGunfrom(ItemStack itemStack) {
        ItemMeta meta = itemStack.getItemMeta();

        return null;
    }



    private double damage;
    private int bulletsNum;
    private String name;
    private Material gunMaterial;

    Gun(double damage, int bulletsNum, String name, Material gunMaterial) {
        this.damage = damage;
        this.bulletsNum = bulletsNum;
        this.name = name;
        this.gunMaterial = gunMaterial;
    }

    public void shot(ItemStack itemStack, Player player) {

    }

    public void reload (ItemStack itemStack) {

    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getBulletsNum() {
        return bulletsNum;
    }

    public void setBulletsNum(int bulletsNum) {
        this.bulletsNum = bulletsNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getGunMaterial() {
        return gunMaterial;
    }

    public void setGunMaterial(Material gunMaterial) {
        this.gunMaterial = gunMaterial;
    }
}
