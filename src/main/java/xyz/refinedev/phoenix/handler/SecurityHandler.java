package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.profile.grant.Grant;
import xyz.refinedev.phoenix.profile.security.SecurityUser;
import xyz.refinedev.phoenix.rank.Rank;

import java.util.List;
import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 4/17/2023
 */

@Getter
public class SecurityHandler {
    /**
     * Is a Profile a {@link SecurityUser}
     *
     * @param uuid  {@link UUID} Profile UUID
     * @param admin {@link Boolean} Admin User
     * @return {@link Boolean} Security
     */
    public boolean hasSecurity(UUID uuid, boolean admin) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is a Profile a {@link SecurityUser}
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link Boolean} Security
     */
    public boolean hasSecurity(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Add a Profile as a {@link SecurityUser}
     *
     * @param uuid     {@link UUID} Profile UUID
     * @param issuedBy {@link UUID} Issued By
     * @param admin    {@link Boolean} Admin User
     */
    public void addSecurity(UUID uuid, UUID issuedBy, boolean admin) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Remove a Profile from being a {@link SecurityUser}
     *
     * @param uuid     {@link UUID} Profile UUID
     */
    public void removeSecurity(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get all Ranks that trigger the security punishment
     *
     * @return {@link List<Rank>}
     */
    public @NotNull List<UUID> getRankIdsToTrigger() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Grant} that will trigger
     * the security punishment
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link Grant}
     */
    public @Nullable Grant getGrantInTrigger(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

}
