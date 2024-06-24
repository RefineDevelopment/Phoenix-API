package xyz.refinedev.cosmetics.cosmetics.killeffect;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;

@Getter
@AllArgsConstructor
public enum KillEffectType {
    ANGRY("Angry", (location) -> {
    }, 1200),
    BLOOD("Blood", (location) -> {
    }, 1200),
    CHESS("Chess", (location) -> {
    }, 1200),
    COAL("Coal", (location) -> {
    }, 1200),
    COOKIE("Cookie", (location) -> {
    }, 1200),
    DIAMOND("Diamond", (location) -> {
    }, 1200),
    EMERALD("Emerald", (location) -> {
    }, 1200),
    GOLD("Gold", (location) -> {
    }, 1200),
    HALLOWEEN("Halloween", (location) -> {
    }, 1200),
    IRON("Iron", (location) -> {
    }, 1200),
    CLOUD("Cloud", (location) -> {
    }, 1200),
    FIREWORK("Firework", (location) -> {
    }, 1200),
    TNT("TNT", (location) -> {
    }, 1200),
    FLAME("Flame", (location) -> {
    }, 1200),
    HAPPY("Happy", (location) -> {
    }, 1200),
    LIGHTING("Lighting", (location) -> {
    }, 1200),
    NOTE("Note", (location) -> {
    }, 1200),
    HEART("Heart", (location) -> {
    }, 1200),
    LAVA("Lava", (location) -> {
    }, 1200),
    THUNDER("Thunder", (location) -> {
    }, 1200),
    NUKE("Nuke", (loc) -> {
    }, 1200),
    NONE("None", (location) -> {
    }, 700);

    private final String name;
    private final EffectCallable callable;
    private final int price;

    public static List<KillEffectType> getAll() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static KillEffectType getByName(String input) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasPermission(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isDisabled() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getPermissionForAll() {
        return "core.killeffect.*";
    }

    public String getPermission() {
        return "core.killeffect." + this.name().toLowerCase();
    }

    public KillEffectType drawRandom() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
