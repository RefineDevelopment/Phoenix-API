package xyz.refinedev.phoenix.handler;

import lombok.RequiredArgsConstructor;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.antivpn.AntiVPNData;

import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 07/10/2023
 * <p>
 * THIS IS A PROXY ONLY HANDLER!
 */

@RequiredArgsConstructor
public class AntiVPNHandler {
    /**
     * Whitelist a Profile from the AntiVPNM
     *
     * @param uuid {@link UUID} Profile UUID
     * @param save {@link Boolean} Save to Redis
     *             <p>
     *             THIS IS A PROXY ONLY HANDLER!
     */
    public void whitelist(UUID uuid, boolean save) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Unwhitelist a Profile from the AntiVPNM
     *
     * @param uuid {@link UUID} Profile UUID
     * @param save {@link Boolean} Save to Redis
     *             <p>
     *             THIS IS A PROXY ONLY HANDLER!
     */
    public void unwhitelist(UUID uuid, boolean save) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is an AntiVPN Provider present?
     *
     * @return {@link Boolean} Enabled
     * <p>
     * THIS IS A PROXY ONLY HANDLER!
     */
    public boolean isEnabled() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Fetch {@link AntiVPNData} for a Profile
     * and query AntiVPNProvider if necessary
     *
     * @param uuid {@link UUID} Profile UUID
     * @param ip   {@link String} IP
     * @return {@link AntiVPNData}
     * <p>
     * THIS IS A PROXY ONLY HANDLER!
     */
    public AntiVPNData check(UUID uuid, String ip) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get cached {@link AntiVPNData} for
     * a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link AntiVPNData}
     * <p>
     * THIS IS A PROXY ONLY HANDLER!
     */
    public AntiVPNData getAntiVPNData(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get cached {@link AntiVPNData} for
     * an IP
     *
     * @param ip {@link String} IP
     * @return {@link AntiVPNData}
     * <p>
     * THIS IS A PROXY ONLY HANDLER!
     */
    public AntiVPNData getAntiVPNData(String ip) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
