package xyz.refinedev.phoenix.handler;

import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;
import xyz.refinedev.phoenix.profile.cooldown.LocalCooldown;

import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 1/26/2023
 */

public class CooldownHandler {
    /**
     * Place a Profile on {@link LocalCooldown}
     *
     * @param name     {@link String} Cooldown Name
     * @param uuid     {@link UUID} Profile UUID
     * @param duration {@link Long} Cooldown Duration
     */
    public void placeOnCooldown(String name, UUID uuid, long duration) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is a Profile on a {@link LocalCooldown}?
     *
     * @param name {@link String} Cooldown Name
     * @param uuid {@link UUID} Profile UUID
     * @return {@link Boolean} Is On Cooldown
     */
    public boolean isOnCooldown(String name, UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Remaining Time for a {@link LocalCooldown}
     *
     * @param name {@link String} Cooldown Name
     * @param uuid {@link UUID} Profile UUID
     * @return {@link Long} Remaining (MS)
     */
    public long getRemaining(String name, UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get or Create a {@link LocalCooldown} for
     * a Profile
     *
     * @param name {@link String} Cooldown Name
     * @return {@link LocalCooldown} Cooldown
     */
    public @NotNull LocalCooldown getOrCreate(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the number of cooldowns for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link Integer} Count
     */
    public int getCooldownCount(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Clear a Profile's Cooldowns
     *
     * @param uuid {@link UUID} Profile UUID
     */
    public void clearCooldowns(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

}
