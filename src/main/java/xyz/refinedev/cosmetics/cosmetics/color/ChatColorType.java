package xyz.refinedev.cosmetics.cosmetics.color;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;

@Getter
@AllArgsConstructor
public enum ChatColorType {
    WHITE("White", ChatColor.WHITE, 700),
    DARK_AQUA("Dark Aqua", ChatColor.DARK_AQUA, 700),
    LIGHT_GRAY("Light Gray", ChatColor.GRAY, 700),
    DARK_GREEN("Dark Green", ChatColor.DARK_GREEN, 700),
    DARK_PURPLE("Dark Purple", ChatColor.DARK_PURPLE, 700),
    BLUE("Blue", ChatColor.BLUE, 700),
    LIGHT_GREEN("Light Green", ChatColor.GREEN, 700),
    GOLD("Gold", ChatColor.GOLD, 700),
    AQUA("Aqua", ChatColor.AQUA, 700),
    YELLOW("Yellow", ChatColor.YELLOW, 700),
    RED("Red", ChatColor.RED, 700),
    LIGHT_PURPLE("Light Purple", ChatColor.LIGHT_PURPLE, 700),
    DARK_RED("Dark Red", ChatColor.DARK_RED, 700),
    NONE("None", ChatColor.RED, 700);

    private final String name;
    private final ChatColor color;
    private final int price;

    public static ChatColorType getByName(String input) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static List<ChatColorType> getAll() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static ChatColorType drawRandom() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isDisabled() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasPermission(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getPermissionForAll() {
        return "core.chat.colors.*";
    }

    public String getPermission() {
        return "core.chat.colors." + this.name().toLowerCase();
    }

}
