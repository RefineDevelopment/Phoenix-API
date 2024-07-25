package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.profile.Profile;

import java.util.List;
import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 06/12/2022
 * Project: Phoenix
 */

@Getter
@Setter
@RequiredArgsConstructor
public class ProfileHandler {
    /**
     * @param uuid {@link UUID} UUID
     * @param name {@link String} Name
     * @return {@link Profile} Profile
     */
    public @NotNull Profile createProfile(UUID uuid, String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Profile} ONLY from the Cache by its UUID
     *
     * @param uuid {@link UUID} UUID
     * @return {@link Profile} Profile
     */
    public @Nullable Profile getCachedProfile(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Profile} by its UUID
     *
     * @param uuid {@link UUID} UUID
     * @return {@link Profile} Profile
     */
    public @Nullable Profile getProfile(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }


    /**
     * Get a {@link Profile} ONLY from the Cache by its Name
     *
     * @param playerName {@link String} Name
     * @return {@link Profile} Profile
     */
    public @Nullable Profile getLocalProfileByName(String playerName) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Does a {@link Profile} with that name exist?
     *
     * @param name {@link String} Name
     * @return {@link Boolean} Exists
     */
    public boolean hasProfile(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the first {@link Profile} in the
     * Database with that Name (Ignore-Case)
     *
     * @param name {@link String} Name
     * @return {@link Profile} Profile
     */
    public @Nullable Profile getProfileFromName(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the first {@link Profile} in the
     * Database with that Name (Match-Case)
     *
     * @param name {@link String} Name
     * @return {@link Profile} Profile
     */
    public @Nullable Profile getProfileFromCapitalizedName(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the {@link UUID} of the first {@link Profile}
     * in the Database with that Name (Ignore-Case)
     *
     * @param name {@link String} Name
     * @return {@link UUID} UUID
     */
    public @Nullable UUID getUuidFromName(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a list of the Profiles in the
     * Database with that Name (Ignore-Case)
     *
     * @param name {@link String} Name
     * @return {@link List<Profile>} Profiles
     */
    public List<Profile> getProfilesFromName(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Has that name been marked as
     * having multiple profiles?
     *
     * @param name {@link String} Name
     * @return {@link Boolean} Has Multiple Profiles
     */
    public boolean hasMultipleProfiles(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
