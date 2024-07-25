package xyz.refinedev.phoenix.profile.tag;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.ArrayList;
import java.util.List;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx (@Creaxx#0001)
 * 09-Oct-21 / 15:46
 * Phoenix / xyz.refinedev.core.bukkit.profile.tags
 */

@Getter
@Setter
@RequiredArgsConstructor
public class TagCategory {
    private final String name;

    private int priority = 0;
    private List<String> tags = new ArrayList<>();
    private boolean def = false;
    private boolean visible = false;

    /**
     * Get the tags list as {@link Tag} Objects
     *
     * @return {@link List<Tag>}
     */
    public List<Tag> getAsTags() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}