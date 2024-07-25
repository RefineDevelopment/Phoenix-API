package xyz.refinedev.phoenix.rank;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.rank.permission.Permission;
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
@RequiredArgsConstructor
public class Rank {

    @SerializedName("_id")
    private final UUID uuid;

    private String name = "Unknown";
    private boolean defaultRank = false;
    private int priority = 1, price = 0;
    private List<Permission> permissions = new ArrayList<>();
    private List<UUID> inheritance = new ArrayList<>();
    private List<Scope> scopes = new ArrayList<>();
    private String prefix = "", displayName = "SetDisplayName", suffix = "", color = "&a", playerListPrefix = "";
    private boolean visible = true, staff = false, subscription = false, grantable = true, purchasable = false;

    public Rank(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the list of available Permissions on the current scope
     *
     * @return {@link List<String>} Permissions
     */
    public List<String> getAvailablePermissions() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Rank} Active on a specific Server or Group?
     *
     * @return {@link Boolean} Active
     */
    public boolean isScope(String server, String group) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Rank} available on the current {@link Scope}?
     *
     * @return {@link Boolean} Available
     */
    public boolean isScope() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the formatted Scopes
     *
     * @return {@link List<Scope>}
     */
    public List<String> getNiceScopes() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Does the {@link Rank} have the permission?
     *
     * @param value {@link String} Permission
     * @return {@link Boolean} Has Permission
     */
    public boolean hasPermission(String value) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Remove a Permission from the {@link Rank}
     *
     * @param perm {@link String} Permission
     */
    public void removePermission(String perm) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the {@link Permission} Object from
     * a String Permission
     *
     * @param perm {@link String} Permission
     * @return {@link Permission}
     */
    public Permission getPermission(String perm) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Does the {@link Rank} inherit from
     * another {@link Rank}
     *
     * @param rank {@link Rank} Rank
     * @return {@link Boolean} Inherit
     */
    public boolean hasInheritance(Rank rank) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Does the {@link Rank} inherit from
     * another {@link Rank}
     *
     * @param rankId {@link UUID} Rank UUID
     * @return {@link Boolean} Inherit
     */
    public boolean hasInheritance(UUID rankId) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Add an inheritance to the {@link Rank}
     *
     * @param rank {@link Rank} Rank
     */
    public void addInheritance(Rank rank) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Remove an inheritance from the {@link Rank}
     *
     * @param rank {@link Rank} Rank
     */
    public void removeInheritance(Rank rank) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Rank} Global?
     *
     * @return {@link Boolean} Global
     */
    public boolean isGlobal() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Rank} specifically available on that Group?
     *
     * @return {@link Boolean} Available
     */
    public boolean hasGroup(String group) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Rank} specifically available on that Server?
     *
     * @return {@link Boolean} Available
     */
    public boolean hasServer(String server) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Rank} specifically available on that Scope?
     *
     * @return {@link Boolean} Available
     */
    public boolean hasScope(Scope toCheck) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Find a circular inheritance lock for the {@link Rank}
     *
     * @param rank {@link Rank}
     * @return {@link Rank} Inheritance Lock
     */
    public @Nullable Rank findDependencyLock(Rank rank) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
