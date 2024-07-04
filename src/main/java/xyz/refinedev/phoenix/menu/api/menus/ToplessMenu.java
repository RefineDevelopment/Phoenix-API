package xyz.refinedev.phoenix.menu.api.menus;

import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.menu.api.Button;
import xyz.refinedev.phoenix.menu.api.Menu;

import java.util.Map;

//LIKE DRIZZYS PICKS
public abstract class ToplessMenu extends Menu {
    @Override
    public Map<Integer, Button> getButtons(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Map<Integer, Button> getTopLevelButtons(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public abstract Map<Integer, Button> getAllButtons(Player player);
}
