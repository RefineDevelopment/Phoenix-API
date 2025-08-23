package xyz.refinedev.phoenix.handler;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.rank.IRank;
import xyz.refinedev.phoenix.whitelist.WhitelistAccess;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface IWhitelistHandler {
    void initialize();

    /**
     * Enable/Disable the Whitelist
     *
     * @param status {@link Boolean} Enabled
     */
    void setEnabled(boolean status);

    /**
     * Update the {@link IRank} required
     * to join the server while whitelisted
     *
     * @param rank {@link IRank} Rank
     */
    void updateRank(IRank rank);

    /**
     * Is the User whitelisted?
     *
     * @param user      {@link String} UUID/Name
     * @param permanent {@link Boolean} Permanent/Temporary
     * @return {@link Boolean} Whitelisted
     */
    boolean isWhitelisted(String user, boolean permanent);

    /**
     * Whitelist a User
     *
     * @param user      {@link String} UUID/Name
     * @param permanent {@link Boolean} Permanent
     */
    void whitelistPlayer(String user, boolean permanent);

    /**
     * Unwhitelist a User
     *
     * @param user {@link String} UUID/Name
     */
    void unwhitelistPlayer(String user);

    /**
     * Add a {@link WhitelistAccess} Type
     *
     * @param access {@link WhitelistAccess} Access Type
     */
    void addAccessType(WhitelistAccess access);

    /**
     * Remove a {@link WhitelistAccess} Type
     *
     * @param access {@link WhitelistAccess} Access Type
     */
    void removeAccessType(WhitelistAccess access);

    /**
     * Get the Enabled {@link WhitelistAccess} Types
     *
     * @return {@link List<String>}
     */
    @NotNull
    List<String> getAccessTypesAsStrings();

    /**
     * Is a {@link WhitelistAccess} Type enabled?
     *
     * @param access {@link WhitelistAccess} Access Type
     * @return {@link Boolean} Enabled
     */
    boolean hasAccessType(WhitelistAccess access);

    /**
     * Get the current whitelist {@link IRank}
     *
     * @return {@link IRank}
     */
    @Nullable
    IRank getWhitelistRank();

    /**
     * Get the current whitelist {@link IRank} UUID
     *
     * @return {@link UUID}
     */
    @Nullable
    UUID getWhitelistRankUuid();

    List<String> getWhitelistedUsers();

    List<String> getTokenUsers();

    boolean isWhitelisted();

    Set<WhitelistAccess> getAccessTypes();

    boolean isNameBased();
}
