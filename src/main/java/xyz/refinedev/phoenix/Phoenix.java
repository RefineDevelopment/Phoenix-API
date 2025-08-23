package xyz.refinedev.phoenix;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import net.j4c0b3y.api.config.ConfigHandler;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.cache.api.IUUIDCache;
import xyz.refinedev.phoenix.handler.*;
import xyz.refinedev.phoenix.hook.ICosmeticsHook;
import xyz.refinedev.phoenix.hook.ILevelHook;
import xyz.refinedev.phoenix.hook.IModUtilsHook;
import xyz.refinedev.phoenix.packet.api.IPacketHandler;
import xyz.refinedev.phoenix.settings.api.PlayerSettings;
import xyz.refinedev.phoenix.utils.ExecuteOnMainThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/**
 * <p>
 * This Project is property of Refine Development.<br>
 * Copyright © 2023, All Rights Reserved.<br>
 * Redistribution of this Project is not allowed.<br>
 * </p>
 *
 * @author Creaxx
 * @since 03/01/2023
 * @version pxAPI
 */

@Getter
@Setter
public class Phoenix implements CommonPlatform {

    @Getter
    public static Phoenix INSTANCE;

    public static String VERSION;
    public static String MAIN_COLOR;
    public static String SECONDARY_COLOR;
    public static String MIDDLE_COLOR;

    @Setter private Gson gson;

    @Setter private IDatabaseHandler databaseHandler;
    @Setter private ConfigHandler configHandler;
    @Setter private IProfileHandler profileHandler;
    @Setter private IRankHandler rankHandler;
    @Setter private IHashHandler hashHandler;
    @Setter private INetworkHandler networkHandler;
    @Setter private IWhitelistHandler whitelistHandler;
    @Setter private IFilterHandler filterHandler;
    @Setter private ITagHandler tagHandler;
    @Setter private IGrantHandler grantHandler;
    @Setter private IPunishmentHandler punishmentHandler;
    @Setter private ICooldownHandler cooldownHandler;
    @Setter private ICommandLogHandler commandLogHandler;
    @Setter private INotificationHandler notificationHandler;
    @Setter private IChatSnapshotHandler chatSnapshotHandler;
    @Setter private IPunishmentLadderHandler punishmentLadderHandler;
    @Setter private ISecurityHandler securityHandler;
    @Setter private IPlaceholderHandler placeholderHandler;
    @Setter private ILoginHandler loginHandler;
    @Setter private IChatLogHandler chatLogHandler;
    @Setter private ICustomTagHandler customTagHandler;
    @Setter private IAnalyticsHandler analyticsHandler;
    @Setter private IAntiVPNHandler antiVPNHandler;
    @Setter private IPacketHandler packetHandler;

    @Setter private DisguiseHandler disguiseHandler;
    @Setter private AuthHandler authHandler;
    @Setter private RebootHandler rebootHandler;
    @Setter private ChatHandler chatHandler;
    @Setter private VisibilityHandler visibilityHandler;
    @Setter private HookHandler hookHandler;
    @Setter private IUUIDCache uuidCache;

    @Setter private long startedAt = 0;
    @Setter private long stoppedAt = 0;
    @Setter private Map<String, String> metaData = new ConcurrentHashMap<>();

    @Setter private IModUtilsHook modUtilsHook;
    @Setter private ILevelHook levelHook;
    @Setter private ICosmeticsHook cosmeticsHook;

    @Setter private ExecuteOnMainThread executeOnMainThread;
    @Setter public boolean apiEnabled = false;
    @Setter public boolean debugMode = false;
    @Setter public boolean useModernPrefixes = false;
    @Setter public boolean usingMongoDB = true;
    @Setter private Thread mainThread;

    private final List<PlayerSettings> playerSettings = new ArrayList<>();

    public static Phoenix getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean start(Logger logger) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    @Override
    public boolean isMainThread(Thread thread) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    @Override
    public void shutdown() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    @Override
    public boolean isMongoDB() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    @Override
    public Logger getLogger() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    @Override
    public void setLogger(Logger logger) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
