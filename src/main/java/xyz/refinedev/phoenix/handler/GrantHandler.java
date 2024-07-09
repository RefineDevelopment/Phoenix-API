package xyz.refinedev.phoenix.handler;

import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.packet.api.PacketHandler;
import xyz.refinedev.phoenix.profile.Profile;
import xyz.refinedev.phoenix.profile.grant.Grant;
import xyz.refinedev.phoenix.rank.Rank;
import xyz.refinedev.phoenix.scope.Scope;

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

    public void grant(UUID sender, Profile target, long duration, boolean permanent, String reason, Rank rank, List<Scope> scopes) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void ungrant(UUID sender, Profile target, Grant grant, String reason) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
    
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
