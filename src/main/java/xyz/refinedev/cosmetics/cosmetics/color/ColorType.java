package xyz.refinedev.cosmetics.cosmetics.color;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;

@Getter
@AllArgsConstructor
public enum ColorType {
    WHITE("White", ChatColor.WHITE, 500),
    DARK_AQUA("Dark Aqua", ChatColor.DARK_AQUA, 500),
    LIGHT_GRAY("Light Gray", ChatColor.GRAY, 500),
    DARK_GREEN("Dark Green", ChatColor.DARK_GREEN, 500),
    DARK_PURPLE("Dark Purple", ChatColor.DARK_PURPLE, 500),
    BLUE("Blue", ChatColor.BLUE, 500),
    LIGHT_GREEN("Light Green", ChatColor.GREEN, 500),
    GOLD("Gold", ChatColor.GOLD, 500),
    LIGHT_PURPLE("Light Purple", ChatColor.LIGHT_PURPLE, 500),
    AQUA("Aqua", ChatColor.AQUA, 500),
    YELLOW("Yellow", ChatColor.YELLOW, 500),
    RED("Red", ChatColor.RED, 500),
    DARK_RED("Dark Red", ChatColor.DARK_RED, 500),
    NONE("None", ChatColor.RED, 700);

    private final String name;
    private final ChatColor color;
    private final int price;

    public static ColorType getByName(String input) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static List<ColorType> getAll() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static ColorType drawRandom() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isDisabled() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasPermission(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getPermissionForAll() {
        return "core.colors.*";
    }

    public String getPermission() {
        return "core.colors." + this.name().toLowerCase();
    }
}
