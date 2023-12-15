package xyz.refinedev.phoenix.rank.permission;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.scope.Scope;

import java.util.List;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 08/01/2023
 * Project: Phoenix
 */

@Getter
@Setter
@AllArgsConstructor
public class ProfilePermission {

    private final String permission;
    private final long expiration;
    private List<Scope> scopes;

    public ProfilePermission(String permission, long duration) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasExpired() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isScope(String server, String group) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isScope() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isGlobal() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasGroup(String group) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasServer(String server) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<String> getNiceScopes() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasScope(Scope toCheck) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
