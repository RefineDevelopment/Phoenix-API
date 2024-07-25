package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.Profile;
import xyz.refinedev.phoenix.profile.disguise.DisguiseData;
import xyz.refinedev.phoenix.profile.disguise.DisguiseHistory;
import xyz.refinedev.phoenix.profile.disguise.Skin;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * @author Creaxx
 * Created At: 3/24/2023
 */

@Getter
public class DisguiseHandler {
    /**
     * Disguise a {@link Profile}
     *
     * @param profile      {@link Profile} Profile
     * @param disguiseData {@link DisguiseData} Disguise Data
     * @param redisguise   {@link Boolean} Redisguise
     */
    public void disguise(Profile profile, DisguiseData disguiseData, boolean redisguise) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Undisguise a  {@link Profile}
     *
     * @param profile {@link Profile} Profile
     * @param cache   {@link Boolean} Remove Disguise from Cache
     */
    public void undisguise(Profile profile, boolean cache) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a List of available Disguise Names
     *
     * @return {@link List<String>}
     */
    public List<String> getAvailableNames() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Skin} by Name
     *
     * @param name {@link String} Name
     * @return Skin
     */
    public CompletableFuture<Skin> getSkinByName(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Fetch a Profiles Disguise History
     *
     * @param uuid {@link UUID} Profile UUID
     * @return Disguise History
     */
    public CompletableFuture<List<DisguiseHistory>> fetchDisguiseHistory(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a Random Name for Disguise
     *
     * @return {@link String} Random Name
     */
    public String getRandomName() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a Random Skin for Disguise
     *
     * @return {@link Skin} Random Skin
     */
    public Skin getRandomSkin() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get all Names currently in Use
     *
     * @return Names
     */
    public CompletableFuture<Set<String>> getNamesInUse() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Cache disguise to redis
     *
     * @param uuid     {@link UUID} UUID
     * @param fakeName {@link String} Fake Name
     * @param set      {@link Boolean} Set/Remove
     */
    public void cacheDisguise(UUID uuid, String fakeName, boolean set) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get UUID by Fake Name
     *
     * @param fakeName {@link String} Fake Name
     * @return {@link String} UUID
     */
    public String getUuidByFakeName(String fakeName) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a list of disguised profiles
     *
     * @return {@link List<Profile>}
     */
    public List<Profile> getAllDisguisedProfiles() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Has a Profile previously disguised?
     *
     * @param uuid {@link UUID} UUID
     * @return {@link Boolean} Previously Disguised
     */
    public boolean hasPreviouslyDisguised(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Cache Previous Disguise Data
     *
     * @param uuid {@link UUID}
     * @param data {@link DisguiseData}
     */
    public void updatePreviousDisguiseData(UUID uuid, DisguiseData data) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a Profile's previous Disguise Data
     *
     * @param uuid {@link UUID} UUID
     * @return {@link DisguiseData} Disguise Data
     */
    public DisguiseData getPreviousDisguiseData(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Check if a name is currently in use?
     *
     * @param name {@link String} Name
     * @return Boolean
     */
    public CompletableFuture<Boolean> isNameInUse(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
