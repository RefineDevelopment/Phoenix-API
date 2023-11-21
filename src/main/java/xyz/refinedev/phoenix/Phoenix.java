package xyz.refinedev.phoenix;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.handler.*;
import xyz.refinedev.phoenix.hook.ICosmeticsHook;
import xyz.refinedev.phoenix.hook.ILevelHook;
import xyz.refinedev.phoenix.hook.IModUtilsHook;
import xyz.refinedev.phoenix.settings.api.PlayerSettings;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Creaxx
 * Created At: 03/01/2023
 * Project: pxAPI
 */

@Getter
@Setter
public class Phoenix {

    @Getter
    public static Phoenix instance;

    private ChatHandler chatHandler;
    private RebootHandler rebootHandler;
    private VisibilityHandler visibilityHandler;

    private final List<PlayerSettings> playerSettings = new ArrayList<>();
}
