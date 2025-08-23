package xyz.refinedev.phoenix.handler;

import xyz.refinedev.phoenix.antivpn.api.IAntiVPNProvider;
import xyz.refinedev.phoenix.profile.IProfile;
import xyz.refinedev.phoenix.profile.antivpn.IAntiVPNData;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 07/10/2023
 */

public interface IAntiVPNHandler {
    /**
     * Fetch the AntiVPN Whitelist from redis cache
     */
    void fetchAntiVpnBypass();

    /**
     * Whitelist a Profile from the AntiVPNM
     *
     * @param uuid {@link UUID} Profile UUID
     * @param save {@link Boolean} Save to Redis
     */
    void whitelist(UUID uuid, boolean save);

    /**
     * Unwhitelist a Profile from the AntiVPNM
     *
     * @param uuid {@link UUID} Profile UUID
     * @param save {@link Boolean} Save to Redis
     */
    void unwhitelist(UUID uuid, boolean save);

    void cacheVpnDataRedis(IAntiVPNData antiVPNData);

    Map<UUID, IAntiVPNData> fetchLatestVpnDataRedis(Set<IProfile> profiles);

    IAntiVPNData fetchLatestVpnDataRedis(UUID uuid, String hashedIp);

    List<IAntiVPNData> fetchVpnDataRedis(UUID uuid);

    void removeVpnDataRedis(IAntiVPNData antiVPNData);

    /**
     * Is an AntiVPN Provider present?
     *
     * @return {@link Boolean} Enabled
     */
    boolean isEnabled();

    /**
     * Is a Profile whitelisted from the AntiVPN
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link Boolean} Is Profile whitelisted
     */
    boolean hasBypass(UUID uuid);

    /**
     * Fetch {@link IAntiVPNData} for a Profile
     * and query {@link IAntiVPNProvider} if necessary
     *
     * @param uuid {@link UUID} Profile UUID
     * @param ip   {@link String} IP
     * @return {@link Boolean}
     */
    boolean check(UUID uuid, String ip);

    /**
     * Get cached {@link IAntiVPNData} for
     * a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link IAntiVPNData}
     */
    IAntiVPNData getAntiVPNData(UUID uuid);

    /**
     * Get cached {@link IAntiVPNData} for
     * an IP
     *
     * @param ip {@link String} IP
     * @return {@link IAntiVPNData}
     */
    IAntiVPNData getAntiVPNData(String ip);

    Set<UUID> getAntiVpnBypass();
}
