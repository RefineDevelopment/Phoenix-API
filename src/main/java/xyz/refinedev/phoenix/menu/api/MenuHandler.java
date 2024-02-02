package xyz.refinedev.phoenix.menu.api;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.Phoenix;

import java.util.UUID;

/**
 * This Project is property of Refine Development © 2021
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created: 8/7/2021
 * Project: Phoenix
 */

@Getter
@SuppressWarnings("unused")
public class MenuHandler {
    /**
     * Create an instance of MenuHandler with support for configuration
     *
     * @param plugin {@link Phoenix} plugin
     */
    public MenuHandler(Phoenix plugin) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }


    /**
     * Get the menu that is opened to the player by
     * their UniqueId
     *
     * @param player {@link Player}
     * @return {@link Menu} queried menu
     */
    public Menu getByPlayer(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the menu that is opened to the player by
     * their UniqueId
     *
     * @param player {@link Player}
     * @return {@link Menu} queried menu
     */
    public Menu getByPlayer(UUID player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void openMenuAsync(Menu menu, Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void openMenuSync(Menu menu, Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Open the menu for the Player
     *
     * @param menu   The Menu player is supposed to get displayed
     * @param player Player viewing the menu
     */
    public void openMenu(Menu menu, Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
