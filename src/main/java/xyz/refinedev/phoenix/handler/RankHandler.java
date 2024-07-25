package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.SharedAPI;
import xyz.refinedev.phoenix.profile.Profile;
import xyz.refinedev.phoenix.rank.Rank;

import java.util.List;
import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 07/12/2022
 * Project: Phoenix
 */

@Getter
public class RankHandler {
    public RankHandler(SharedAPI api) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a Rank by its Name
     *
     * @param name {@link String} Name
     * @return {@link Rank}
     */
    public @Nullable Rank getRank(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a Rank by its UUID
     *
     * @param uuid {@link UUID} UUID
     * @return {@link Rank}
     */
    public @Nullable Rank getRank(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the highest Default {@link Rank}
     *
     * @return {@link Rank}
     */
    public @Nullable Rank getDefaultRank() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a list of Default Ranks
     *
     * @return {@link List<Rank>}
     */
    public @NotNull List<Rank> getDefaultRanks() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Delete a {@link Rank}
     *
     * @param rank {@link Rank} Rank
     */
    public void deleteRank(Rank rank) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Update a {@link Rank}
     *
     * @param rank {@link Rank} Rank
     */
    public void updateRank(Rank rank) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Force every server to recalculate all permissions for players
     */
    public void requestPermissionsUpdate() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get all Sorted Ranks
     *
     * @return {@link List<Rank>}
     */
    public @NotNull List<Rank> getSortedRanks() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get all Sorted Ranks in reversed order
     *
     * @return {@link List<Rank>}
     */
    public @NotNull List<Rank> getSortedRanksReversed() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Create a Default Rank
     */
    public void createDefaultRank() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Can the granter grant the specified Rank?
     *
     * @param granter {@link Profile} Granter
     * @param rank    {@link Rank} Rank
     * @return {@link Boolean} Can Grant
     */
    public boolean canGrant(Profile granter, Rank rank) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
