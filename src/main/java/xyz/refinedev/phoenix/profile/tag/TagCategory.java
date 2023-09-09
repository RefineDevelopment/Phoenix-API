package xyz.refinedev.phoenix.profile.tag;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class TagCategory {
    private final String name;

    private int priority = 0;
    private List<String> tags = new ArrayList<>();
    private boolean def = false;

    public void save() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void load() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void delete() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Tag> getAsTags() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

}