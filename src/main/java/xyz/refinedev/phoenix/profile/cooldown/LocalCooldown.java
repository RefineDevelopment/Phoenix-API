package xyz.refinedev.phoenix.profile.cooldown;

import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 1/26/2023
 */

public class LocalCooldown {
    /**
     * Does the Profile have an active cooldown
     *
     * @param uniqueId {@link UUID} UUID
     * @return {@link Boolean} Active
     */
    public boolean isActive(UUID uniqueId) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Put a Profile on Cooldown
     *
     * @param uniqueId {@link UUID} UUID
     * @param duration {@link Long} Duration
     */
    public void placeOnCooldown(UUID uniqueId, long duration) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Remaining MS for the {@link LocalCooldown}
     *
     * @param uniqueId {@link UUID} UUID
     * @return {@link Long} Remaining (MS)
     */
    public long getRemaining(UUID uniqueId) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Remove a Profile from the {@link LocalCooldown}
     *
     * @param uuid {@link UUID} UUID
     */
    public void removeUuid(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}