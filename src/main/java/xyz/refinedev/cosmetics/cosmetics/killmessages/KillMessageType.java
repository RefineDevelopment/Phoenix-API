package xyz.refinedev.cosmetics.cosmetics.killmessages;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;

@Getter
@AllArgsConstructor
public enum KillMessageType {
    COMPUTER_NERD("Computer Nerd", null, 1000),
    MEMES("Memes", null, 1000),
    PVP_PACK("PvP Pack", null, 1000),
    ADVANCED("Advanced", null, 1000),
    OLDMAN("Oldman", null, 1000),
    SOCIALDISTANCE("Social Distancing", null, 1000),
    SOUP4DUMMIES("Soup 4 Dummies", null, 1000),
    TRIUMPH("Triumph", null, 1000),
    NOBLE("Noble", null, 1000),
    DRAMATIC("Dramatic", null, 1000),
    BUZZ("Buzz", null, 1000),
    PIRATE("Pirate", null, 1000),
    GLORIOUS("Glorious", null, 1000),
    MOON("Moon", null, 1000),
    PRIMAL("Primal", null, 1000),
    LOVE("Love", null, 1000),
    WESTERN("Western", null, 1000),
    BBQ("BBQ", null, 1000),
    HONOR("Honor", null, 1000),
    FIRE("Fire", null, 1000),
    GALACTIC("Galactic", null, 1000),
    EVIL("Evil", null, 1000),
    NOOB("Noob", null, 1000),
    HELL("Hell", null, 1000),
    OFFERING("Offering", null, 1000),
    NONE("None", null, 0);

    private final String name;
    private final Material material;
    private final int price;

    public static KillMessageType getByName(String input) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static List<KillMessageType> getAll() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isDisabled() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static String drawRandom(KillMessageType type) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static List<String> getMessages(KillMessageType type) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasPermission(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getPermissionForAll() {
        return "core.killmessages.*";
    }

    public String getPermission() {
        return "core.killmessages." + this.name().toLowerCase();
    }
}
