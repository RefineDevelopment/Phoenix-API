package xyz.refinedev.phoenix.handler;

import org.jetbrains.annotations.NotNull;
import xyz.refinedev.phoenix.profile.IProfile;
import xyz.refinedev.phoenix.profile.grant.IGrant;
import xyz.refinedev.phoenix.rank.IRank;
import xyz.refinedev.phoenix.repository.IGrantRepository;
import xyz.refinedev.phoenix.scope.IScope;

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

public interface IGrantHandler {
    /**
     * Grant a {@link IRank} to a {@link IProfile}
     *
     * @param sender    {@link UUID} Sender
     * @param target    {@link IProfile} Target
     * @param duration  {@link Long} Duration
     * @param permanent {@link Boolean} Permanent
     * @param reason    {@link String} Reason
     * @param rank      {@link IRank} Rank
     * @param scopes    {@link List<IScope>} Scopes
     */
    void grant(UUID sender, IProfile target, long duration, boolean permanent, String reason, IRank rank, List<IScope> scopes);

    /**
     * Remove a {@link IGrant} from a {@link IProfile}
     *
     * @param sender {@link UUID} Sender
     * @param target {@link IProfile} Target
     * @param grant  {@link IGrant} Grant
     * @param reason {@link String} Reason
     */
    void ungrant(UUID sender, IProfile target, IGrant grant, String reason);

    /**
     * Get the Highest {@link IRank} for a {@link IProfile}
     * without taking into account disguise and invisible Ranks
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link IRank} Rank
     */
    @NotNull
    IRank getHighestRank(UUID uuid);

    /**
     * Get the Highest {@link IRank} for a {@link IProfile}
     * including invisible Ranks
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link IRank} Rank
     */
    @NotNull
    IRank getGeneralRank(UUID uuid);

    /**
     * Update the Grants for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     */
    void updateGrants(UUID uuid);

    /**
     * Update and get the Grants for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link List<IGrant>} Grants
     */
    List<IGrant> updateGrants(UUID uuid, boolean cache);

    /**
     * Update the Grants for a Profile Async
     *
     * @param uuid {@link UUID} Profile UUID
     */
    CompletableFuture<List<IGrant>> updateGrantsAsync(UUID uuid);

    /**
     * Get the Grants for a Profile from the Database Async
     *
     * @param uuid {@link UUID} Profile UUID
     * @return Grants
     */
    @NotNull
    CompletableFuture<List<IGrant>> getDatabaseGrants(UUID uuid);

    /**
     * Get the Grants for a Profile from the Database
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link List<IGrant>}
     */
    @NotNull
    List<IGrant> getDatabaseGrantsSync(UUID uuid);

    /**
     * Get the Grants for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link List<IGrant>}
     */
    @NotNull
    List<IGrant> getGrants(UUID uuid);

    /**
     * Get the Active Grants for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link List<IGrant>}
     */
    @NotNull
    List<IGrant> getActiveGrants(UUID uuid);

    /**
     * Get the Active Ranks for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link List<IRank>}
     */
    @NotNull
    List<IRank> getActiveRanks(UUID uuid);

    /**
     * Get the Issued Grants for a Profile Async
     *
     * @param uuid {@link UUID} Profile UUID
     * @return Grants
     */
    CompletableFuture<List<IGrant>> findByIssuedBy(UUID uuid);

    IGrantRepository getRepository();
}
