package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.rank.Rank;
import xyz.refinedev.phoenix.whitelist.WhitelistAccess;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
public class WhitelistHandler {
    private final List<String> whitelistedUsers = new ArrayList<>();
    private boolean whitelisted = false;
    private Set<WhitelistAccess> accessTypes;

    /**
     * Enable/Disable the Whitelist
     *
     * @param status {@link Boolean} Enabled
     */
    public void setEnabled(boolean status) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Update the {@link Rank} required
     * to join the server while whitelisted
     *
     * @param rank {@link Rank} Rank
     */
    public void updateRank(Rank rank) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the User whitelisted?
     *
     * @param user      {@link String} UUID/Name
     * @param permanent {@link Boolean} Permanent/Temporary
     * @return {@link Boolean} Whitelisted
     */
    public boolean isWhitelisted(String user, boolean permanent) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Whitelist a User
     *
     * @param user      {@link String} UUID/Name
     * @param permanent {@link Boolean} Permanent
     */
    public void whitelistPlayer(String user, boolean permanent) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Unwhitelist a User
     *
     * @param user {@link String} UUID/Name
     */
    public void unwhitelistPlayer(String user) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Add a {@link WhitelistAccess} Type
     *
     * @param access {@link WhitelistAccess} Access Type
     */
    public void addAccessType(WhitelistAccess access) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Remove a {@link WhitelistAccess} Type
     *
     * @param access {@link WhitelistAccess} Access Type
     */
    public void removeAccessType(WhitelistAccess access) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Enabled {@link WhitelistAccess} Types
     *
     * @return {@link List<String>}
     */
    public @NotNull List<String> getAccessTypesAsStrings() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is a {@link WhitelistAccess} Type enabled?
     *
     * @param access {@link WhitelistAccess} Access Type
     * @return {@link Boolean} Enabled
     */
    public boolean hasAccessType(WhitelistAccess access) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the current whitelist {@link Rank}
     *
     * @return {@link Rank}
     */
    public @Nullable Rank getWhitelistRank() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the current whitelist {@link Rank} UUID
     *
     * @return {@link UUID}
     */
    public @Nullable UUID getWhitelistRankUuid() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
