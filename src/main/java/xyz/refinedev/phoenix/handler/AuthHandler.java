package xyz.refinedev.phoenix.handler;

import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.utils.auth.api.Authenticator;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author Creaxx
 * @version pxAPI
 * @since 02/02/2024
 */

public class AuthHandler {
    public Authenticator getAuthenticatorByType(String type) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Authenticator> getAuthenticators() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Map<UUID, Integer> getAuthAttempts() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}