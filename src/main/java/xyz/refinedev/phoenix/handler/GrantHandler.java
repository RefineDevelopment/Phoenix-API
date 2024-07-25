package xyz.refinedev.phoenix.handler;

import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;
import xyz.refinedev.phoenix.profile.Profile;
import xyz.refinedev.phoenix.profile.grant.Grant;
import xyz.refinedev.phoenix.rank.Rank;
import xyz.refinedev.phoenix.scope.Scope;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 27/12/2022
 * Project: Phoenix
 */

public class GrantHandler {
    /**
     * Grant a {@link Rank} to a {@link Profile}
     *
     * @param sender    {@link UUID} Sender
     * @param target    {@link Profile} Target
     * @param duration  {@link Long} Duration
     * @param permanent {@link Boolean} Permanent
     * @param reason    {@link String} Reason
     * @param rank      {@link Rank} Rank
     * @param scopes    {@link List<Scope>} Scopes
     */
    public void grant(UUID sender, Profile target, long duration, boolean permanent, String reason, Rank rank, List<Scope> scopes) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Remove a {@link Grant} from a {@link Profile}
     *
     * @param sender {@link UUID} Sender
     * @param target {@link Profile} Target
     * @param grant  {@link Grant} Grant
     * @param reason {@link String} Reason
     */
    public void ungrant(UUID sender, Profile target, Grant grant, String reason) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Highest {@link Rank} for a {@link Profile}
     * without taking into account disguise and invisible Ranks
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link Rank} Rank
     */
    public @NotNull Rank getHighestRank(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Highest {@link Rank} for a {@link Profile}
     * including invisible Ranks
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link Rank} Rank
     */
    public @NotNull Rank getGeneralRank(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Update the Grants for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     */
    public void updateGrants(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Update the Grants for a Profile Async
     *
     * @param uuid {@link UUID} Profile UUID
     */
    public CompletableFuture<List<Grant>> updateGrantsAsync(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Grants for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link List<Grant>}
     */
    public @NotNull List<Grant> getGrants(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Active Grants for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link List<Grant>}
     */
    public @NotNull List<Grant> getActiveGrants(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Active Ranks for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link List<Rank>}
     */
    public @NotNull List<Rank> getActiveRanks(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Issued Grants for a Profile Async
     *
     * @param uuid {@link UUID} Profile UUID
     * @return Grants
     */
    public CompletableFuture<List<Grant>> findByIssuedBy(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
