package xyz.refinedev.phoenix;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.handler.*;
import xyz.refinedev.phoenix.hook.ICosmeticsHook;
import xyz.refinedev.phoenix.hook.ILevelHook;
import xyz.refinedev.phoenix.hook.IModUtilsHook;

import java.util.logging.Logger;

/**
 * <p>
 * This Project is property of Refine Development.<br>
 * Copyright © 2023, All Rights Reserved.<br>
 * Redistribution of this Project is not allowed.<br>
 * </p>
 *
 * @author Creaxx
 * @version pxAPI
 * @since 03/01/2023
 */

@Getter
@Setter
public class SharedAPI {

    @Getter
    public static SharedAPI instance;
    private Gson gson;
    private Logger logger;

    private ProfileHandler profileHandler;
    private RankHandler rankHandler;
    private TagHandler tagHandler;
    private NetworkHandler networkHandler;
    private CommandLogHandler commandLogHandler;
    private ChatSnapshotHandler chatSnapshotHandler;
    private WhitelistHandler whitelistHandler;
    private FilterHandler filterHandler;
    private PlaceholderHandler placeholderHandler;
    private GrantHandler grantHandler;
    private PunishmentHandler punishmentHandler;
    private PunishmentLadderHandler punishmentLadderHandler;
    private SecurityHandler securityHandler;
    private CooldownHandler cooldownHandler;
    private LoginHandler loginHandler;

    private long startedAt;
    private long stoppedAt;

    private IModUtilsHook modUtilsHook;
    private ILevelHook levelHook;
    private ICosmeticsHook cosmeticsHook;

    public void enable(Logger logger) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void disable() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
