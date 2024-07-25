package xyz.refinedev.phoenix.handler;

import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.visibility.IVisibilityAdapter;

import java.util.Set;
import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 5/31/2023
 */

public class VisibilityHandler {
    /**
     * Add a {@link IVisibilityAdapter}
     *
     * @param adapter {@link IVisibilityAdapter}
     */
    public void addAdapter(IVisibilityAdapter adapter) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Can the Viewer see the Target?
     *
     * @param viewer {@link UUID} Viewer UUID
     * @param target {@link UUID} Target UUID
     * @return {@link Boolean} Visible
     */
    public boolean canSee(UUID viewer, UUID target) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Can the Viewer see the Target (Other Type)?
     *
     * @param viewer {@link UUID} Viewer UUID
     * @param target {@link UUID} Target UUID
     * @return {@link Boolean} Visible
     */
    public boolean canSeeOther(UUID viewer, UUID target) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Can the Viewer see the Target?
     *
     * @param viewer {@link Player} Viewer
     * @param target {@link Player} Target
     * @return {@link Boolean} Visible
     */
    public boolean canSee(Player viewer, Player target) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Can the Viewer see the Target (Other Type)?
     *
     * @param viewer {@link Player} Viewer
     * @param target {@link Player} Target
     * @return {@link Boolean} Visible
     */
    public boolean canSeeOther(Player viewer, Player target) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get all visible Players for {@link Player}
     *
     * @param player {@link Player} Viewer
     * @return {@link Set<Player>} Visible Players
     */
    public Set<Player> getAllVisibleTo(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get all visible Player Names for {@link Player}
     *
     * @param player {@link Player} Viewer
     * @return {@link Set<String>} Visible Player Names
     */
    public Set<Player> getAllVisibleToOther(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get all visible Player Names for {@link Player}
     *
     * @param player {@link Player} Viewer
     * @return {@link Set<String>} Visible Player Names
     */
    public Set<String> getAllVisibleToNames(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get all invisible Player Names for {@link Player}
     *
     * @param player {@link Player} Viewer
     * @return {@link Set<String>} Invisible Player Names
     */
    public Set<Player> getAllInvisibleTo(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get all invisible Player Names for {@link Player} (Other Type)
     *
     * @param player {@link Player} Viewer
     * @return {@link Set<String>} Invisible Player Names
     */
    public Set<Player> getAllInvisibleToOther(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
