package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.SharedAPI;
import xyz.refinedev.phoenix.server.ServerData;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
public class NetworkHandler {
    private final SharedAPI api;

    private Set<ServerData> servers = new HashSet<>();
    private Set<ServerData> proxies = new HashSet<>();

    private String serverName, displayName, serverGroup, region, website, store, discord, teamspeak, twitter, ip;
    private boolean serverJoinable = false;

    public NetworkHandler(SharedAPI api) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Fetch servers from redis and cache.
     */
    public void fetchServers() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Fetch proxies from redis and cache.
     */
    public void fetchProxies() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Delete a Server from Redis and the Cache
     *
     * @param serverData {@link ServerData} Server
     */
    public void deleteServer(ServerData serverData) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Delete a Proxy from Redis and the Cache
     *
     * @param serverData {@link ServerData} Proxy
     */
    public void deleteProxy(ServerData serverData) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the current Server of a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link ServerData} Server
     */
    public @Nullable ServerData getPresence(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the current formatted Server of a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link String} Server Name
     */
    public String getNicePresence(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the current Proxy of a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link ServerData} Proxy
     */
    public ServerData getProxy(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the current formatted Proxy of a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link String} Proxy Name
     */
    public String getNiceProxy(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is a server online?
     *
     * @param name {@link String} Server Name
     * @return {@link Boolean} Server Online
     */
    public boolean isServerOnline(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is a profile online?
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link Boolean} Online
     */
    public boolean isOnline(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is a profile online?
     *
     * @param uuid  {@link UUID} Profile UUID
     * @param proxy {@link Boolean} Check on the Proxy only
     * @return {@link Boolean} Online
     */
    public boolean isOnline(UUID uuid, boolean proxy) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get or Create a Server
     *
     * @param name {@link String} Name
     * @return {@link ServerData} Server
     */
    public @NotNull ServerData getOrAddServer(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get or Create a Proxy
     *
     * @param name {@link String} Name
     * @return {@link ServerData} Proxy
     */
    public @NotNull ServerData getOrAddProxyServer(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a Server from its Name
     *
     * @param name {@link String} Name
     * @return {@link ServerData} Server
     */
    public @Nullable ServerData getServerByName(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a Proxy from its Name
     *
     * @param name {@link String} Name
     * @return {@link ServerData} Proxy
     */
    public @Nullable ServerData getProxyByName(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get all Groups
     *
     * @return {@link List<String>} Groups
     */
    public @NotNull List<String> getGroups() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get all Proxy Groups
     *
     * @return {@link List<String>} Proxy Groups
     */
    public @NotNull List<String> getProxyGroups() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Servers in a Group
     *
     * @param group {@link String} Group
     * @return {@link Set<ServerData>} Servers
     */
    public @NotNull Set<ServerData> getServersInGroup(String group) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Proxies in a Group
     *
     * @param group {@link String} Group
     * @return {@link Set<ServerData>} Proxies
     */
    public @NotNull Set<ServerData> getProxiesInGroup(String group) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Server Names in a Group
     *
     * @param group {@link String} Group
     * @return {@link List<String>} Server Names
     */
    public @NotNull List<String> getServersByGroup(String group) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Does a Group exist?
     *
     * @param group {@link String} Group
     * @return {@link Boolean} Exists
     */
    public boolean doesGroupExist(String group) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the UUIDs of all Profiles currently online
     *
     * @return {@link Set<UUID>} UUIDs
     */
    public @NotNull Set<UUID> getAllUuids() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the UUIDs of all Profiles currently online
     * on servers with {@link ServerData#isCountPlayers()}
     *
     * @return {@link Set<UUID>} UUIDs
     */
    public @NotNull Set<UUID> getAllUuidsOnCount() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Online Profile UUIDs of a Server
     *
     * @param serverData {@link ServerData} Server
     * @return {@link List<UUID>} UUIDs
     */
    public @NotNull List<UUID> getOnlinePlayers(ServerData serverData) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Online Profile UUIDs of a Server
     * that are currently vanished
     *
     * @param serverData {@link ServerData} Server
     * @return {@link List<UUID>} UUIDs
     */
    public @NotNull List<UUID> getOnlyVanishedOnlinePlayers(ServerData serverData) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Online Profile UUIDs of a Server
     * that are not currently vanished
     *
     * @param serverData {@link ServerData} Server
     * @return {@link List<UUID>} UUIDs
     */
    public List<UUID> getNonVanishedOnlinePlayers(ServerData serverData) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the max player count
     *
     * @return {@link Integer} Max
     */
    public int getMax() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the current amount of non-vanished online players
     *
     * @return {@link Integer} Online
     */
    public int getOnline() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the current amount online
     * including vanished players
     *
     * @return {@link Integer} Online
     */
    public int getAllOnline() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}

