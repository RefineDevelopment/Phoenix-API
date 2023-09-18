package xyz.refinedev.phoenix;

import com.google.gson.Gson;
import xyz.refinedev.phoenix.handler.*;
import xyz.refinedev.phoenix.hook.ICosmeticsHook;
import xyz.refinedev.phoenix.hook.ILevelHook;
import xyz.refinedev.phoenix.hook.IModUtilsHook;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Creaxx
 * Created At: 03/01/2023
 * Project: pxAPI
 */

@Getter
@Setter
public class SharedAPI {
    @Getter
    public static SharedAPI instance;
    private Gson gson;

    private ProfileHandler profileHandler;
    private RankHandler rankHandler;
    private TagHandler tagHandler;
    private NetworkHandler networkHandler;
    private CommandLogHandler commandLogHandler;
    private ChatSnapshotHandler chatSnapshotHandler;
    private MetadataHandler metadataHandler;
    private RebootHandler rebootHandler;
    private FilterHandler filterHandler;

    private long startedAt;
    private long stoppedAt;

    private IModUtilsHook modUtilsHook;
    private ILevelHook levelHook;
    private ICosmeticsHook cosmeticsHook;
}
