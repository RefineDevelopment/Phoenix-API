package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.server.ServerData;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
public class NetworkHandler {
    private Set<ServerData> servers = new HashSet<>();
    private Set<ServerData> proxies = new HashSet<>();

    private String serverName, displayName, serverGroup, region, website, store, discord, teamspeak, twitter, ip;
    private boolean serverJoinable = false;

    public void fetchServers() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void fetchProxies() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void deleteServer(ServerData serverData) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void deleteProxy(ServerData serverData) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getPresence(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getProxy(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public ServerData getOrAddServer(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public ServerData getOrAddProxyServer(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public ServerData getServerByName(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isServerOnline(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isOnline(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public ServerData getProxyByName(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<String> getGroups() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<String> getProxyGroups() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Set<ServerData> getServersInGroup(String group) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Set<ServerData> getProxiesInGroup(String group) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<String> getServersByGroup(String group) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean doesGroupExist(String group) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isUuidOnline(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public ServerData getServer(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<UUID> getAllUuids() {
        throw new IllegalPluginAccessException("You need to install the plugin.");

    }

    public Set<UUID> getAllUuidsOnCount() {
        throw new IllegalPluginAccessException("You need to install the plugin.");

    }

    public List<UUID> getOnlinePlayers(ServerData serverData) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<UUID> getOnlyVanishedOnlinePlayers(ServerData serverData) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<UUID> getNonVanishedOnlinePlayers(ServerData serverData) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public int getMax() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public int getOnline() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public int getAllOnline() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}

