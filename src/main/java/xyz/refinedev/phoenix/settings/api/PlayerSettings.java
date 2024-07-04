package xyz.refinedev.phoenix.settings.api;

import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.menu.api.Button;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * This Project is the property of Phoenix Development © 2022
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * @since 8/25/2022
 * Project: pxCore
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

    public void addSetting(PlayerSettings settings) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

}
