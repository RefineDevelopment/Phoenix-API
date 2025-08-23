package xyz.refinedev.phoenix.server;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.rank.IRank;
import xyz.refinedev.phoenix.whitelist.WhitelistAccess;

import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx (@Creaxx#0001)
 * 26-Jul-21 / 18:08
 * Phoenix / xyz.refinedev.core.bukkit.utils
 */

public interface IWhitelistInfo {
    /**
     * Get the whitelist {@link IRank}
     *
     * @return {@link IRank} Rank
     */
    @Nullable IRank getRank();

    /**
     * Get the enabled {@link WhitelistAccess} Types
     *
     * @return {@link List<String>} Access Types
     */
    @NotNull List<String> getNiceAccessTypes();

    boolean isWhitelisted();

    Set<WhitelistAccess> getAccessTypes();

    UUID getRankId();

    List<String> getUuids();
}