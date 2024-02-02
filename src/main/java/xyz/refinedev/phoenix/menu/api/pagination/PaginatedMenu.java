package xyz.refinedev.phoenix.menu.api.pagination;

import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.menu.api.Button;
import xyz.refinedev.phoenix.menu.api.Menu;

import java.util.Map;

public abstract class PaginatedMenu extends Menu {
    public PaginatedMenu() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Changes the page number
     *
     * @param player player viewing the inventory
     * @param mod    delta to modify the page number by
     */
    public final void modPage(Player player, int mod) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * @param player player viewing the inventory
     */
    public final int getPages(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    @Override
    public Map<Integer, Button> getButtons(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public int getMaxItemsPerPage(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * @param player player viewing the inventory
     * @return a Map of button that returns items which will be present on all pages
     */
    public Map<Integer, Button> getGlobalButtons(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * @param player player viewing the inventory
     * @return a map of button that will be paginated and spread across pages
     */
    public abstract Map<Integer, Button> getAllPagesButtons(Player player);

    public int getPage() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
