package xyz.refinedev.phoenix.profile.grant;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.profile.log.Logable;
import xyz.refinedev.phoenix.rank.Rank;
import xyz.refinedev.phoenix.scope.Scope;

import java.util.ArrayList;
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
public class Grant extends Logable {
    private UUID rankId;
    private List<Scope> scopes = new ArrayList<>();

    /**
     * Is a {@link Grant} Active on any {@link Scope}?
     *
     * @return {@link Boolean} Active
     */
    @Override
    public boolean isActive() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Grant} Active on the current {@link Scope}?
     *
     * @return {@link Boolean} Active
     */
    public boolean isActiveOnOneScope() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Grant} Active on a specific Server or Group?
     *
     * @return {@link Boolean} Active
     */
    public boolean isScope(String server, String group) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Grant} available on the current {@link Scope}?
     *
     * @return {@link Boolean} Available
     */
    public boolean isScope() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Grant} Global?
     *
     * @return {@link Boolean} Global
     */
    public boolean isGlobal() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Grant} specifically available on that Group?
     *
     * @return {@link Boolean} Available
     */
    public boolean hasGroup(String group) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Grant} specifically available on that Server?
     *
     * @return {@link Boolean} Available
     */
    public boolean hasServer(String server) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Active formatted Scopes
     *
     * @return {@link List<String>} Scopes
     */
    public @NotNull List<String> getNiceActiveScopes() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Current Scopes that are currently Active
     *
     * @return {@link List<Scope>}
     */
    public @NotNull List<Scope> getActiveScopes() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Grant} specifically available on that Scope?
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

    /**
     * Get the Remaining Duration of the {@link Grant}
     *
     * @return {@link Long} Remaining
     */
    public long getRemainingDuration() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the {@link Rank} of the {@link Grant}
     *
     * @return {@link Rank}
     */
    public @Nullable Rank getRank() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
