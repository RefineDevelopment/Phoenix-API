package xyz.refinedev.phoenix.utils.auth.api;

import org.bukkit.entity.Player;

/**
 * @author Creaxx
 * Created At: 3/26/2023
 */
public interface Authenticator {

    String getName();

    void setup(Player player);

    boolean authenticate(Player player, String input);

    boolean canSetup(Player player);

    boolean canAuthenticate(Player player);

    boolean isEnabled();

    default boolean isAsync() {
        return false;
    }

}
