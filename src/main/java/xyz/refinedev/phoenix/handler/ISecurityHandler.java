package xyz.refinedev.phoenix.handler;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.profile.grant.IGrant;
import xyz.refinedev.phoenix.profile.security.ISecurityUser;
import xyz.refinedev.phoenix.rank.IRank;
import xyz.refinedev.phoenix.repository.ISecurityRepository;

import java.util.List;
import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 4/17/2023
 */

public interface ISecurityHandler {
    /**
     * Is a Profile a {@link ISecurityUser}
     *
     * @param uuid  {@link UUID} Profile UUID
     * @param admin {@link Boolean} Admin User
     * @return {@link Boolean} Security
     */
    boolean hasSecurity(UUID uuid, boolean admin);

    /**
     * Is a Profile a {@link ISecurityUser}
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link Boolean} Security
     */
    boolean hasSecurity(UUID uuid);

    /**
     * Add a Profile as a {@link ISecurityUser}
     *
     * @param uuid     {@link UUID} Profile UUID
     * @param issuedBy {@link UUID} Issued By
     * @param admin    {@link Boolean} Admin User
     */
    void addSecurity(UUID uuid, UUID issuedBy, boolean admin);

    /**
     * Remove a Profile from being a {@link ISecurityUser}
     *
     * @param uuid {@link UUID} Profile UUID
     */
    void removeSecurity(UUID uuid);

    /**
     * Get all Ranks that trigger the security punishment
     *
     * @return {@link List<IRank>}
     */
    @NotNull List<UUID> getRankIdsToTrigger();

    /**
     * Get a {@link IGrant} that will trigger
     * the security punishment
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link IGrant}
     */
    @Nullable IGrant getGrantInTrigger(UUID uuid);

    ISecurityRepository getRepository();
}
