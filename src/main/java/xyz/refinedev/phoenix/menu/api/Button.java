package xyz.refinedev.phoenix.menu.api;

import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;

@Getter
public abstract class Button {

    /**
     * Create a quick and easy placeholder Button
     */
    public static Button placeholder(Material material, byte data, String... title) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static Button placeholder(Material material, byte data, String title, List<String> lore) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static Button placeholder() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }


    public static Button placeholder(ItemStack itemStack) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static Button placeholder(Material itemStack) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Play a fail sound upon clicking
     *
     * @param player {@link Player} hearing the sound
     */
    public static void playFail(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Play a successful sound upon clicking
     *
     * @param player {@link Player} hearing the sound
     */
    public static void playSuccess(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Play a neutral sound upon clicking
     *
     * @param player {@link Player} hearing the sound
     */
    public static void playNeutral(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get itemStack of the Button
     *
     * @param player {@link Player} viewing the menu
     * @return {@link ItemStack}
     */
    public abstract ItemStack getItem(Player player);

    /**
     * This method is called upon clicking an
     * item on the menu
     *
     * @param player    {@link Player} clicking
     * @param clickType {@link ClickType}
     */
    public void clicked(Player player, ClickType clickType) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * This method is called when the player clicks
     * on an item of a certain slot
     *
     * @param player     {@link Player} clicking
     * @param slot       {@link Integer} slot
     * @param clickType  {@link ClickType} clickType
     * @param hotbarSlot the hotbar slot of the player
     */
    public void clicked(Player player, int slot, ClickType clickType, int hotbarSlot) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Should the click cancel the event and do nothing
     *
     * @param player    The player clicking
     * @param clickType {@link ClickType}
     * @return {@link Boolean}
     */
    public boolean shouldCancel(Player player, ClickType clickType) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Should the click update the menu
     *
     * @param player    The player clicking
     * @param clickType {@link ClickType}
     * @return {@link Boolean}
     */
    public boolean shouldUpdate(Player player, ClickType clickType) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

}