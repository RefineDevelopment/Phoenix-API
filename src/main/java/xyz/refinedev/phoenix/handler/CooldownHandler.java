package xyz.refinedev.phoenix.handler;

import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.cooldown.LocalCooldown;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author _lightspark_
 * Created At: 01.01.2024 22:50
 * Project: Phoenix-API @ xyz.refinedev.phoenix.handler
 */
public class CooldownHandler {

    private final Map<String, LocalCooldown> cooldowns = new HashMap<>();

    public void placeOnCooldown(String name, UUID uuid, long duration) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isOnCooldown(String name, UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public long getRemaining(String name, UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public LocalCooldown getOrCreate(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public int getCooldownCount(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void clearCooldowns(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

}