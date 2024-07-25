package xyz.refinedev.phoenix.profile.punishment;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.log.Logable;

import java.util.ArrayList;
import java.util.List;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 06/12/2022
 * Project: Phoenix
 */

@Getter
@Setter
public class Punishment extends Logable {
    private PunishmentType punishmentType;
    private boolean silent, removedSilent, ip, voided, shadow;
    private String punishmentID;
    private String address;
    private List<Proof> proof = new ArrayList<>();

    /**
     * Get a random String
     *
     * @param size {@link Integer} String Length
     * @return {@link String}
     */
    public static String getRandomSaltedString(int size) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is a {@link Punishment} Active?
     *
     * @return {@link Boolean} Active
     */
    public boolean isActive() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is a {@link Punishment} not Active?
     *
     * @return {@link Boolean} Active
     */
    public boolean isntActive() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
