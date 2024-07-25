package xyz.refinedev.phoenix.rank.permission;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;
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
public class Permission {
    private final String permission;
    private List<Scope> scopes;

    public Permission(String permission) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Permission} Active on a specific Server or Group?
     *
     * @return {@link Boolean} Active
     */
    public boolean isScope(String server, String group) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Permission} available on the current {@link Scope}?
     *
     * @return {@link Boolean} Available
     */
    public boolean isScope() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Permission} Global?
     *
     * @return {@link Boolean} Global
     */
    public boolean isGlobal() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Permission} specifically available on that Group?
     *
     * @return {@link Boolean} Available
     */
    public boolean hasGroup(String group) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Permission} specifically available on that Server?
     *
     * @return {@link Boolean} Available
     */
    public boolean hasServer(String server) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Permission} specifically available on that Scope?
     *
     * @return {@link Boolean} Available
     */
    public boolean hasScope(Scope toCheck) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the formatted Scopes
     *
     * @return {@link List<Scope>}
     */
    public @NotNull List<String> getNiceScopes() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
