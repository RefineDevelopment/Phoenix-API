package xyz.refinedev.phoenix.handler;

import xyz.refinedev.phoenix.profile.Profile;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;
import java.util.UUID;

/**
 * This Project is the property of Phoenix Development © 2022
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 06/12/2022
 * Project: pxCore
 */

public class ProfileHandler {

    public Profile createProfile(UUID uuid, String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Profile getProfile(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Profile getLocalProfileByName(String playerName) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public UUID getUuidFromName(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Profile> getProfiles() {
        throw new IllegalPluginAccessException("You need to install the plugin");
    }
}
