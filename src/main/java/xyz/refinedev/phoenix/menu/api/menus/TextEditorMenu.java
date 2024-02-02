package xyz.refinedev.phoenix.menu.api.menus;

import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.menu.api.Button;
import xyz.refinedev.phoenix.menu.api.pagination.PaginatedMenu;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Creaxx
 * Created At: 2/5/2023
 */

public abstract class TextEditorMenu extends PaginatedMenu {
    public TextEditorMenu(LinkedList<String> lines) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    @Override
    public String getTitle(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    @Override
    public void onClose(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public abstract void onSave(Player player, List<String> lines);

    @Override
    public Map<Integer, Button> getAllPagesButtons(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    @Override
    public Map<Integer, Button> getGlobalButtons(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

}
