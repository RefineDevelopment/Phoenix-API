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

    private String prefix = "";
    private String color = "&f";
    private int weight = 0;
    private int price = 800;
    private boolean purchasable = true;

    public void save() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void load() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void delete() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getPermission() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

}
