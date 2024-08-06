package xyz.refinedev.phoenix;

import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.server.RegisteredServer;
import lombok.experimental.UtilityClass;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.Profile;
import xyz.refinedev.phoenix.server.ServerData;
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
public class VelocityAPI {
    public boolean isUuid(String string) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a Random Server for the Player
     *
     * @param player {@link RegisteredServer} Player
     * @return {@link Player} Server
     */
    public RegisteredServer getRandomServer(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a Random Auth Server for the Player
     *
     * @param player {@link Player} Player
     * @return {@link RegisteredServer} Server
     */
    public RegisteredServer getRandomAuthServer(Player player) {
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
     * @param profile {@link Profile} Profile
     * @return {@link Pair<Boolean, TextComponent>} Can Join, Kick Message
     */
    public Pair<Boolean, TextComponent> canJoinWhitelist(Profile profile) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a Result for if a Profile can join
     * a server with current whitelist settings
     *
     * @param profile    {@link Profile} Profile
     * @param serverData {@link ServerData} Server
     * @return {@link Boolean} Can Join
     */
    public boolean canJoinWhitelist(Profile profile, ServerData serverData) {
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
