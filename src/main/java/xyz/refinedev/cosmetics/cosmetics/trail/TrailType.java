package xyz.refinedev.cosmetics.cosmetics.trail;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;

@Getter
@AllArgsConstructor
public enum TrailType {
    CRIT("Crit", null, 1100),
    AURA("Aura", null, 1100),
    WATER_SPLASH("Water Splash", null, 1100),
    ANGRY_VILLAGER("Angry Villager", null, 1100),
    HAPPY_VILLAGER("Happy Villager", null, 1100),
    DRIP_LAVA("Drip Lava", null, 1100),
    SNOWBALL("Snowball", null, 1100),
    SLIME("Slime", null, 1100),
    REDSTONE("Redstone", null, 1100),
    SMOKE("Smoke", null, 1100),
    EXPLOSION("Explosion", null, 1100),
    FOOTSTEP("Footstep", null, 1100),
    PORTAL("Portal", null, 1100),
    CLOUD("Cloud", null, 1100),
    ENCHANT("Enchant", null, 1100),
    SPARK("Spark", null, 1100),
    SPELL("Spell", null, 1100),
    HEART("Heart", null, 1100),
    FLAME("Flame", null, 1100),
    NOTE("Note", null, 1100),
    NONE("None", null, 1100);

    private final String name;
    private final Object effect;
    @Getter
    private final int price;

    public static TrailType getByName(String input) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static List<TrailType> getAll() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isDisabled() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static TrailType drawRandom() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasPermission(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getPermissionForAll() {
        return "core.trails.*";
    }

    public String getPermission() {
        return "core.trails." + this.name().toLowerCase();
    }
}
