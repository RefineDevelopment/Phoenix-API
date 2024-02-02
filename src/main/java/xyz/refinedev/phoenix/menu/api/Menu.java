package xyz.refinedev.phoenix.menu.api;

import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.Phoenix;
import xyz.refinedev.phoenix.SharedAPI;

import java.util.HashMap;
import java.util.Map;

public abstract class Menu {
    /**
     * Returns the size of buttons
     *
     * @param buttons {@link HashMap}
     * @return The amount of buttons
     */
    public int size(Map<Integer, Button> buttons) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Size of the inventory
     *
     * @return {@link Integer}
     */
    public int getSize() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get slot at a particular x and y
     *
     * @return The slot
     */
    public int getSlot(int x, int y) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get menu's title
     *
     * @param player {@link Player} viewing the menu
     * @return {@link String} the title of the menu
     */
    public abstract String getTitle(Player player);

    /**
     * Map of slots and buttons on that particular slot
     *
     * @param player {@link Player} player viewing the menu
     * @return {@link Map}
     */
    public abstract Map<Integer, Button> getButtons(Player player);

    /**
     * This method runs when the menu is opened
     *
     * @param player {@link Player} player viewing the menu
     */
    public void onOpen(Player player) {
    }

    /**
     * This method runs when the menu is closed
     *
     * @param player {@link Player} player viewing the menu
     */
    public void onClose(Player player) {
    }

    public Phoenix getPlugin() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public SharedAPI getApi() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Map<Integer, Button> getButtons() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isAutoUpdate() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isUpdateAfterClick() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isClosedByMenu() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isOpenedByMenu() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isBordered() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isInventoryChanged() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void setButtons(Map<Integer, Button> buttons) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void setAutoUpdate(boolean autoUpdate) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void setUpdateAfterClick(boolean updateAfterClick) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void setClosedByMenu(boolean closedByMenu) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void setOpenedByMenu(boolean openedByMenu) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void setBordered(boolean bordered) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void setInventoryChanged(boolean inventoryChanged) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
