package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.punishment.ladder.PunishmentLadder;

/**
 * @author Creaxx
 * Created At: 4/1/2023
 */

@Getter
public class PunishmentLadderHandler {

    public void createLadder(String name, String reason, boolean require) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public PunishmentLadder getByName(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
