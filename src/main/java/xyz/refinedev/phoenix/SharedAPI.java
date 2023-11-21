package xyz.refinedev.phoenix;

import com.google.gson.Gson;
import xyz.refinedev.phoenix.handler.*;
import xyz.refinedev.phoenix.hook.ICosmeticsHook;
import xyz.refinedev.phoenix.hook.ILevelHook;
import xyz.refinedev.phoenix.hook.IModUtilsHook;
import lombok.Getter;
import lombok.Setter;

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
public class SharedAPI {

    @Getter public static SharedAPI instance;

    private Gson gson;

    private ProfileHandler profileHandler;
    private RankHandler rankHandler;
    private TagHandler tagHandler;
    private NetworkHandler networkHandler;
    private CommandLogHandler commandLogHandler;
    private ChatSnapshotHandler chatSnapshotHandler;
    private RebootHandler rebootHandler;
    private WhitelistHandler whitelistHandler;
    private FilterHandler filterHandler;
    private PlaceholderHandler placeholderHandler;

    private long startedAt;
    private long stoppedAt;

    private IModUtilsHook modUtilsHook;
    private ILevelHook levelHook;
    private ICosmeticsHook cosmeticsHook;
}
