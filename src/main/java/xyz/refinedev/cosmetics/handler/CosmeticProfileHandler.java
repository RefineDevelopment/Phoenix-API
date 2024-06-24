package xyz.refinedev.cosmetics.handler;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.cosmetics.profile.CosmeticProfile;

import java.util.UUID;

@Getter
@Setter
public class CosmeticProfileHandler {
    public CosmeticProfile getProfile(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public CosmeticProfile getProfile(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
