package xyz.refinedev.phoenix.settings.api;

import org.bukkit.entity.Player;
import xyz.refinedev.phoenix.Phoenix;
import xyz.refinedev.phoenix.menu.api.Button;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 8/25/2022
 * Project: Phoenix
 */

public abstract class PlayerSettings {

    public abstract Map<Integer, Button> getButtons(Player player);

    public abstract boolean hasPermission(Player player);

    public abstract int getPriority();

    public String name() {
        return "General";
    }

    public List<String> description() {
        return Collections.emptyList();
    }

    public static void addSetting(PlayerSettings settings) {
        Phoenix.getInstance().getPlayerSettings().add(settings);
    }

}
