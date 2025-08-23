package xyz.refinedev.phoenix;

import lombok.experimental.UtilityClass;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.IProfile;
import xyz.refinedev.phoenix.server.IServerData;
import xyz.refinedev.phoenix.utils.Pair;

import java.util.List;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 15/12/2022
 * Project: Phoenix
 */

@UtilityClass
public class BungeeAPI {
    public boolean isUuid(String string) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a Random Server for the Player
     *
     * @param player {@link ProxiedPlayer} Player
     * @return {@link ServerInfo} Server
     */
    public ServerInfo getRandomServer(ProxiedPlayer player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a Random Auth Server for the Player
     *
     * @param player {@link ProxiedPlayer} Player
     * @return {@link ServerInfo} Server
     */
    public ServerInfo getRandomAuthServer(ProxiedPlayer player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a Player's UUID by Fake Name
     *
     * @param fakeName {@link String} Fake Name
     * @return {@link String} UUID
     */
    public String getUuidByFakeName(String fakeName) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Kick unwhitelisted Players
     */
    public void kickUnwhitelistedUsers() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a Result for if a Profile can
     * join with current whitelist settings
     *
     * @param profile {@link IProfile} Profile
     * @return {@link Pair<Boolean, String>} Can Join, Kick Message
     */
    public Pair<Boolean, String> canJoinWhitelist(IProfile profile) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }


    /**
     * Get a Result for if a Profile can join
     * a server with current whitelist settings
     *
     * @param profile    {@link IProfile} Profile
     * @param serverData {@link IServerData} Server
     * @return {@link Boolean} Can Join
     */
    public boolean canJoinWhitelist(IProfile profile, IServerData serverData) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Format a List in to a Kick Message
     *
     * @param source {@link List<String>} Source
     * @return {@link String} Kick Message
     */
    public String getKickMessage(List<String> source) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
