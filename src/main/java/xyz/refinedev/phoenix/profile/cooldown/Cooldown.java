package xyz.refinedev.phoenix.profile.cooldown;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 07/12/2022
 * Project: Phoenix
 */

@Getter
@Setter
public class Cooldown {
    private long start;
    private long expire;
    private String name;

    public Cooldown(long ms, String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the MS passed since the creation of the {@link Cooldown}
     *
     * @return {@link Long}
     */
    public long getPassed() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the MS remaining of the {@link Cooldown}
     *
     * @return {@link Long}
     */
    public long getRemaining() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Has the {@link Cooldown} expired?
     *
     * @return {@link Boolean} Expired
     */
    public boolean hasExpired() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the seconds remaining of the {@link Cooldown}
     *
     * @return {@link Long}
     */
    public int getSecondsLeft() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Cancel the {@link Cooldown}
     */
    public void cancel() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
