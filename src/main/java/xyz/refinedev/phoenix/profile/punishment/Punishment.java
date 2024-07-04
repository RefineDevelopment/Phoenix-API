package xyz.refinedev.phoenix.profile.punishment;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.log.Logable;

/**
 * This Project is the property of Phoenix Development © 2022
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * @since 06/12/2022
 * Project: pxCore
 */

@Getter
@Setter
public class Punishment extends Logable {

    private PunishmentType punishmentType;
    private boolean silent, removedSilent, voided = false, shadow = false;
    private String punishmentID = getRandomSaltedString(6).toUpperCase();
    private String address = "";

    public boolean isActive() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isntActive() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static String getRandomSaltedString(int size) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
