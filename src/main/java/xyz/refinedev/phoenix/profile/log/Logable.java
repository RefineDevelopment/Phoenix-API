package xyz.refinedev.phoenix.profile.log;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.utils.Expirable;

import java.util.UUID;

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
public class Logable extends Expirable {

    public UUID uuid = UUID.randomUUID();
    public UUID target, issuedBy, removedBy;
    public String issuedOn, removedOn;
    public String reason, removedReason;

    public String getNiceIssuedBy() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getNiceRemovedBy() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getNiceTarget() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
