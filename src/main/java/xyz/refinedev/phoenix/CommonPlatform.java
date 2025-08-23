package xyz.refinedev.phoenix;

import com.google.gson.Gson;
import net.j4c0b3y.api.config.ConfigHandler;
import xyz.refinedev.phoenix.cache.api.IUUIDCache;
import xyz.refinedev.phoenix.handler.*;
import xyz.refinedev.phoenix.hook.ICosmeticsHook;
import xyz.refinedev.phoenix.hook.ILevelHook;
import xyz.refinedev.phoenix.hook.IModUtilsHook;
import xyz.refinedev.phoenix.packet.api.IPacketHandler;
import xyz.refinedev.phoenix.utils.ExecuteOnMainThread;

import java.util.Map;
import java.util.logging.Logger;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 06/12/2022
 * Project: Phoenix
 */

public interface CommonPlatform {
    /**
     * Enable the {@link CommonPlatform} with a {@link Logger}
     * of your choice
     *
     * @param logger {@link Logger}
     * @return {@link Boolean} Enabled
     */
    boolean start(Logger logger);

    boolean isMainThread(Thread thread);

    /**
     * Disable the {@link CommonPlatform}
     */
    void shutdown();

    boolean isMongoDB();

    Gson getGson();

    Logger getLogger();

    IDatabaseHandler getDatabaseHandler();

    IProfileHandler getProfileHandler();

    IRankHandler getRankHandler();

    IHashHandler getHashHandler();

    INetworkHandler getNetworkHandler();

    IWhitelistHandler getWhitelistHandler();

    IFilterHandler getFilterHandler();

    ITagHandler getTagHandler();

    IGrantHandler getGrantHandler();

    IPunishmentHandler getPunishmentHandler();

    ICooldownHandler getCooldownHandler();

    ICommandLogHandler getCommandLogHandler();

    INotificationHandler getNotificationHandler();

    IChatSnapshotHandler getChatSnapshotHandler();

    IPunishmentLadderHandler getPunishmentLadderHandler();

    ISecurityHandler getSecurityHandler();

    IPlaceholderHandler getPlaceholderHandler();

    ILoginHandler getLoginHandler();

    IChatLogHandler getChatLogHandler();

    ICustomTagHandler getCustomTagHandler();

    IAnalyticsHandler getAnalyticsHandler();

    IAntiVPNHandler getAntiVPNHandler();

    IPacketHandler getPacketHandler();

    ConfigHandler getConfigHandler();
    
    IUUIDCache getUuidCache();

    long getStartedAt();

    long getStoppedAt();

    Map<String, String> getMetaData();

    IModUtilsHook getModUtilsHook();

    ILevelHook getLevelHook();

    ICosmeticsHook getCosmeticsHook();

    ExecuteOnMainThread getExecuteOnMainThread();

    boolean isApiEnabled();

    boolean isDebugMode();

    boolean isUseModernPrefixes();

    boolean isUsingMongoDB();

    Thread getMainThread();

    void setGson(Gson gson);

    void setLogger(Logger logger);

    void setPacketHandler(IPacketHandler packetHandler);

    void setDatabaseHandler(IDatabaseHandler databaseHandler);

    void setProfileHandler(IProfileHandler profileHandler);

    void setRankHandler(IRankHandler rankHandler);

    void setHashHandler(IHashHandler hashHandler);

    void setNetworkHandler(INetworkHandler networkHandler);

    void setWhitelistHandler(IWhitelistHandler whitelistHandler);

    void setFilterHandler(IFilterHandler filterHandler);

    void setTagHandler(ITagHandler tagHandler);

    void setGrantHandler(IGrantHandler grantHandler);

    void setPunishmentHandler(IPunishmentHandler punishmentHandler);

    void setCooldownHandler(ICooldownHandler cooldownHandler);

    void setCommandLogHandler(ICommandLogHandler commandLogHandler);

    void setNotificationHandler(INotificationHandler notificationHandler);

    void setChatSnapshotHandler(IChatSnapshotHandler chatSnapshotHandler);

    void setPunishmentLadderHandler(IPunishmentLadderHandler punishmentLadderHandler);

    void setSecurityHandler(ISecurityHandler securityHandler);

    void setPlaceholderHandler(IPlaceholderHandler placeholderHandler);

    void setLoginHandler(ILoginHandler loginHandler);

    void setChatLogHandler(IChatLogHandler chatLogHandler);

    void setCustomTagHandler(ICustomTagHandler customTagHandler);

    void setAnalyticsHandler(IAnalyticsHandler analyticsHandler);

    void setAntiVPNHandler(IAntiVPNHandler antiVPNHandler);

    void setConfigHandler(ConfigHandler configHandler);

    void setUuidCache(IUUIDCache uuidCache);

    void setStartedAt(long startedAt);

    void setStoppedAt(long stoppedAt);

    void setMetaData(Map<String, String> metaData);

    void setModUtilsHook(IModUtilsHook modUtilsHook);

    void setLevelHook(ILevelHook levelHook);

    void setCosmeticsHook(ICosmeticsHook cosmeticsHook);

    void setExecuteOnMainThread(ExecuteOnMainThread executeOnMainThread);

    void setApiEnabled(boolean enabled);

    void setDebugMode(boolean debugMode);

    void setUseModernPrefixes(boolean useModernPrefixes);

    void setMainThread(Thread mainThread);
}
