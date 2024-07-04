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
    public void updateLogins(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public CompletableFuture<List<Login>> updateLoginsAsync(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Map<UUID, List<Login>> getLoginsSync(Set<UUID> uuids) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Login> getLogins(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public CompletableFuture<Void> markPreviousAsLoggedOut(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void logoutPlayers(List<UUID> uuids) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void logoutPlayer(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
