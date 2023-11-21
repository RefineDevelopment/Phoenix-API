package xyz.refinedev.phoenix.rank;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
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
 * @since 06/12/2022
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

    public List<String> getAvailablePermissions() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isScope(String server, String group) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isScope() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<String> getNiceScopes() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasPermission(String value) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void removePermission(String perm) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Permission getPermission(String perm) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasInheritance(Rank rank) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasInheritance(UUID rankId) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void addInheritance(Rank rank) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void removeInheritance(Rank rank) {
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

    public boolean hasScope(Scope toCheck) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Rank findDependencyLock(Rank rank) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
