package xyz.refinedev.phoenix.server;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
public class ServerData {

    private final String serverName;
    private String displayName = "";
    private String serverGroup = "";
    private String region = "";
    private String version = "";

    private long startedAt;

    private int port = 0;
    private long lastTick = 0;
    private double tps = 20.0;
    private int maxPlayers;

    private WhitelistInfo whitelistInfo;
    private boolean countPlayers = true;

    private List<UUID> onlinePlayers = new ArrayList<>();
    private HashMap<String, String> metaData = new HashMap<>();

    /**
     * Is the {@link ServerData} whitelisted?
     *
     * @return {@link Boolean} Whitelisted
     */
    public boolean isWhitelisted() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link ServerData} online?
     *
     * @return {@link Boolean} Online
     */
    public boolean isOnline() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
