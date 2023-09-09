package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;
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
    public Rank getRank(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Rank getRank(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Rank getDefaultRank() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Rank> getDefaultRanks() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void deleteRank(Rank rank) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void updateRank(Rank rank) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void requestPermissionsUpdate() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Rank> getSortedRanks() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Rank> getSortedRanksReversed() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean canGrant(Profile granter, Rank rank) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
