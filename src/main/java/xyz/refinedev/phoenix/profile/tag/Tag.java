package xyz.refinedev.phoenix.profile.tag;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;

@Getter
@Setter
@RequiredArgsConstructor
public class Tag {
    private final String name;

    private String prefix;
    private String color;
    private int priority;
    private int price;
    private boolean purchasable;

    /**
     * Get the Displayname of the {@link Tag}
     *
     * @return {@link String} Display Name
     */
    public String getDisplayName() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
