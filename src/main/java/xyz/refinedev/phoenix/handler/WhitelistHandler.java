package xyz.refinedev.phoenix.handler;

import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.rank.Rank;
import xyz.refinedev.phoenix.whitelist.WhitelistAccess;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public class WhitelistHandler {

    public void setEnabled(boolean status) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void updateRank(Rank rank) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isWhitelisted(String user, boolean permanent) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void whitelistPlayer(String user, boolean permanent) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void unwhitelistPlayer(String user) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void addAccessType(WhitelistAccess access) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void removeAccessType(WhitelistAccess access) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<String> getAccessTypesAsStrings() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasAccessType(WhitelistAccess access) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Rank getWhitelistRank() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public UUID getWhitelistRankUuid() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<String> getWhitelistedUsers() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isWhitelisted() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Set<WhitelistAccess> getAccessTypes() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
