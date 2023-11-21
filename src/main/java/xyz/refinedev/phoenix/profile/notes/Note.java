package xyz.refinedev.phoenix.profile.notes;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.SharedAPI;

import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * @since 1/14/2023
 */

@Getter
@Setter
public class Note {

    private UUID uuid = UUID.randomUUID();
    private UUID issuedBy;
    private long issuedAt;
    private String note;

    public String getNiceIssuedBy() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    @Override
    public int hashCode() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    @Override
    public boolean equals(Object o) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
