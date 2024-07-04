package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.visibility.IVisibilityAdapter;

import java.util.Set;
import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 5/31/2023
 */

@Getter
public class VisibilityHandler {

    public void addAdapter(IVisibilityAdapter adapter) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean canSee(UUID viewer, UUID target) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean canSee(Player viewer, Player target) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Set<Player> getAllVisibleTo(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Set<String> getAllVisibleToNames(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Set<Player> getAllInvisibleTo(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
