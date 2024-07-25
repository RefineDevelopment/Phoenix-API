package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.utils.auth.api.Authenticator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Creaxx
 * Created At: 3/26/2023
 */

@Getter
public class AuthHandler {
    private final List<Authenticator> authenticators = new ArrayList<>();
    private final Map<UUID, Integer> authAttempts = new ConcurrentHashMap<>();


    /**
     * Get an {@link Authenticator} by its Type
     *
     * @param type {@link String} Type
     * @return {@link Authenticator}
     */
    public @Nullable Authenticator getAuthenticatorByType(String type) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
