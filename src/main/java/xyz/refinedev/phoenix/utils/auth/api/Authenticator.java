package xyz.refinedev.phoenix.utils.auth.api;

import org.bukkit.entity.Player;

/**
 * @author Creaxx
 * Created At: 3/26/2023
 */
public interface Authenticator {

    public String getName();

    public void setup(Player player);

    public boolean authenticate(Player player, String input);

    public boolean canSetup(Player player);

    public boolean canAuthenticate(Player player);

    public boolean isEnabled();

}
