package xyz.refinedev.phoenix.visibility;

import org.bukkit.entity.Player;

import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 5/31/2023
 */
public interface IVisibilityAdapter {

    boolean canSee(Player player, Player other);
    boolean canSee(UUID player, UUID other);
}
