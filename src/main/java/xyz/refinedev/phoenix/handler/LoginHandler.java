package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.login.Login;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 27/12/2022
 * Project: Phoenix
 */

@Getter
public class LoginHandler {
    /**
     * Update Logins for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     */
    public void updateLogins(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Update Logins for a Profile Async
     *
     * @param uuid {@link UUID} Profile UUID
     */
    public CompletableFuture<List<Login>> updateLoginsAsync(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Logins for these UUIDs
     *
     * @param uuids {@link Set<UUID>}
     * @return Login Map By UUID
     */
    public Map<UUID, List<Login>> getLoginsSync(Set<UUID> uuids) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Logins for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link List<Login>}
     */
    public List<Login> getLogins(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Mark a Profile's previous Login as Logged Out
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link CompletableFuture}
     */
    public CompletableFuture<Void> markPreviousAsLoggedOut(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
    /**
     * Logout a list of Profiles
     *
     * @param uuids {@link List<UUID>} Profile UUIDs
     */
    public void logoutPlayers(List<UUID> uuids) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Logout a Profile Async
     *
     * @param uuid {@link UUID} Profile UUID
     */
    public void logoutPlayer(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Logout a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     */
    public void logoutPlayerSync(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
