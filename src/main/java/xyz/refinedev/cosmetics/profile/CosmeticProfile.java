package xyz.refinedev.cosmetics.profile;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.cosmetics.cosmetics.color.ChatColorType;
import xyz.refinedev.cosmetics.cosmetics.color.ColorType;
import xyz.refinedev.cosmetics.cosmetics.killeffect.KillEffectType;
import xyz.refinedev.cosmetics.cosmetics.killmessages.KillMessageType;
import xyz.refinedev.cosmetics.cosmetics.particle.ParticleType;
import xyz.refinedev.cosmetics.cosmetics.trail.TrailType;

import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
public class CosmeticProfile {
    private final UUID uniqueId;

    private ColorType nameColor = ColorType.NONE;
    private ChatColorType chatColor = ChatColorType.NONE;
    private KillEffectType killEffectType = KillEffectType.NONE;
    private TrailType trailType = TrailType.NONE;
    private ParticleType particleType = ParticleType.NONE;
    private KillMessageType killMessageType = KillMessageType.NONE;
    private int coins = 0;

    public void loadProfile() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void saveProfile() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void addCoins(int amount, String reason) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void removeCoins(int amount) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
