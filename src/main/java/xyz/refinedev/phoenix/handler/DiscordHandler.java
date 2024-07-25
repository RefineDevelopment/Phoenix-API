package xyz.refinedev.phoenix.handler;

import lombok.RequiredArgsConstructor;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.Phoenix;
import xyz.refinedev.phoenix.profile.Profile;
import xyz.refinedev.phoenix.profile.grant.Grant;
import xyz.refinedev.phoenix.profile.punishment.Punishment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Creaxx
 * Created At: 05/10/2023
 */

@RequiredArgsConstructor
public class DiscordHandler {
    private final Phoenix plugin;
    private final ExecutorService executor = Executors.newFixedThreadPool(4);

    /**
     * Send a {@link Grant} to Discord
     *
     * @param grant {@link Grant}
     */
    public void sendGrant(Grant grant) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Send a Revoke {@link Grant} to Discord
     *
     * @param grant {@link Grant}
     */
    public void sendRevokeGrant(Grant grant) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Send a {@link Punishment} to Discord
     *
     * @param punishment {@link Punishment}
     */
    public void sendPunishment(Punishment punishment) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Send a Revoke {@link Punishment} to Discord
     *
     * @param punishment {@link Punishment}
     */
    public void sendRevokePunishment(Punishment punishment) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Send a server startup to discord
     *
     * @param server {@link String} Server
     * @param region {@link String} Region
     */
    public void sendServerStartup(String server, String region) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Send a server shutdown to discord
     *
     * @param server {@link String} Server
     * @param region {@link String} Region
     */
    public void sendServerShutdown(String server, String region) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }


    /**
     * Send a Staff Join to Discord
     *
     * @param profile {@link Profile} Profile
     * @param server  {@link String} Server
     * @param proxy   {@link String} Proxy
     */
    public void sendStaffJoin(Profile profile, String server, String proxy) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Send a Staff Switch to Discord
     *
     * @param profile {@link Profile} Profile
     * @param to      {@link String} Server To
     * @param from    {@link String} Server From
     */
    public void sendStaffSwitch(Profile profile, String to, String from) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Send a Staff Leave to Discord
     *
     * @param profile {@link Profile} Profile
     * @param server  {@link String} Server
     */
    public void sendStaffLeave(Profile profile, String server) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
