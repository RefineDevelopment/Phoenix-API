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
    public List<String> getAvailableNames() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public CompletableFuture<Skin> getSkinByName(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public CompletableFuture<List<DisguiseHistory>> fetchDisguiseHistory(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getRandomName() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Skin getRandomSkin() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public CompletableFuture<Set<String>> getNamesInUse() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getUuidByFakeName(String fakeName) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Profile> getAllDisguisedProfiles() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasPreviouslyDisguised(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void updatePreviousDisguiseData(UUID uuid, DisguiseData data) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public DisguiseData getPreviousDisguiseData(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public CompletableFuture<Boolean> isNameInUse(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
