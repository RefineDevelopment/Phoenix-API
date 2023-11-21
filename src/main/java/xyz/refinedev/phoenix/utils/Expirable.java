package xyz.refinedev.phoenix.utils;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;

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
public class Expirable {

    public boolean active = true;
    public long issuedAt, removedAt, duration;
    public boolean permanent;

    public boolean isActive() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getNiceDuration() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getNiceExpire() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

}
