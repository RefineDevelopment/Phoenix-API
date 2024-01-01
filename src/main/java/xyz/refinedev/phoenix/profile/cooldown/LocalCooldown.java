package xyz.refinedev.phoenix.profile.cooldown;

import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author _lightspark_
 * Created At: 01.01.2024 22:51
 * Project: Phoenix-API @ xyz.refinedev.phoenix.profile.cooldown
 */
public class LocalCooldown {

    private final Map<UUID, Long> cooldownMap = new HashMap<>();

    public boolean isActive(UUID uniqueId) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void placeOnCooldown(UUID uniqueId, long duration) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public long getRemaining(UUID uniqueId) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void removeUuid(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
