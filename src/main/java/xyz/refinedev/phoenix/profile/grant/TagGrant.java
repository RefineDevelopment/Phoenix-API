package xyz.refinedev.phoenix.profile.grant;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.log.Logable;
import xyz.refinedev.phoenix.profile.tag.Tag;

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
public class TagGrant extends Logable {
    private String tagName;

    @Override
    public boolean isActive() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isntActive() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public long getRemainingDuration() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Tag getTag() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
