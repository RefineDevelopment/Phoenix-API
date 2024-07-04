package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.tag.Tag;
import xyz.refinedev.phoenix.profile.tag.TagCategory;

import java.util.List;

@Getter
@Setter
public class TagHandler {

    public List<TagCategory> getSortedCategories() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Tag getTag(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public TagCategory getTagCategory(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void deleteTag(Tag tag) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void saveTags() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void saveCategories() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void loadCategories() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void loadTags() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void deleteTags() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public TagCategory getDefaultCategory() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isDefaultCategory() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
