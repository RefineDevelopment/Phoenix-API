package xyz.refinedev.phoenix.handler;

import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.grant.Grant;
import xyz.refinedev.phoenix.rank.Rank;

import java.util.List;
import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 27/12/2022
 * Project: Phoenix
 */

public class GrantHandler {

    public Rank getGeneralRank(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Grant> getGrants() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Grant> getGrants(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Grant> getActiveGrants(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Rank> getActiveRanks(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Grant> findByIssuedBy(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
