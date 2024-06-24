package xyz.refinedev.cosmetics.cosmetics.particle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.cosmetics.cosmetics.killeffect.EffectCallable;

import java.util.List;

@Getter
@AllArgsConstructor
public enum ParticleType {

    ANGRY("Angry", (location) -> {
    }),
    BLOOD("Blood", (location) -> {
    }),
    CHESS("Chess", (location) -> {
    }),
    COAL("Coal", (location) -> {
    }),
    DIAMOND("Diamond", (location) -> {
    }),
    FIREWORK("Firework", (location) -> {
    }),
    FLAME("Flame", (location) -> {
    }),
    HAPPY("Happy", (location) -> {
    }),
    HEART("Heart", (location) -> {
    }),
    LAVA("Lava", (location) -> {
    }),
    REDSTONE("Redstone", (location) -> {
    }),
    NONE("None", (location) -> {
    });

    private final String name;
    private final EffectCallable callable;

    public static List<ParticleType> getAll() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static ParticleType getByName(String input) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasPermission(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getPermissionForAll() {
        return "core.particle.*";
    }

    public String getPermission() {
        return "core.particle." + this.name().toLowerCase();
    }

}
