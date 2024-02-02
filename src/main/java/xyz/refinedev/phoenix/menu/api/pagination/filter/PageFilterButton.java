package xyz.refinedev.phoenix.menu.api.pagination.filter;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.menu.api.Button;

public class PageFilterButton<T> extends Button {
    public PageFilterButton(FilterablePaginatedMenu<T> menu) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get itemStack of the Button
     *
     * @param player {@link Player} viewing the menu
     * @return {@link ItemStack}
     */
    public ItemStack getItem(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

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

    public boolean shouldUpdate(Player player, ClickType clickType) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
