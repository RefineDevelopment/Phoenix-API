package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.profile.tag.Tag;
import xyz.refinedev.phoenix.profile.tag.TagCategory;

import java.util.List;

@Getter
@Setter
public class TagHandler {
    /**
     * Get all Sorted Tag Categories
     *
     * @return {@link List<TagCategory>}
     */
    public @NotNull List<TagCategory> getSortedCategories() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get all Sorted Tag Categories in reverse order
     *
     * @return {@link List<TagCategory>}
     */
    public @NotNull List<TagCategory> getSortedCategoriesReversed() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get all Sorted Tags
     *
     * @return {@link List<Tag>}
     */
    public @NotNull List<Tag> getSortedTags() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get all Sorted Tags in reverse order
     *
     * @return {@link List<Tag>}
     */
    public @NotNull List<Tag> getSortedTagsReversed() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Tag} by its Name
     *
     * @param name {@link String} Name
     * @return {@link Tag}
     */
    public @Nullable Tag getTag(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link TagCategory} by its Name
     *
     * @param name {@link String} Name
     * @return {@link TagCategory}
     */
    public @Nullable TagCategory getTagCategory(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Update a {@link Tag}
     *
     * @param tag {@link Tag}
     */
    public void updateTag(Tag tag) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Update a {@link TagCategory}
     *
     * @param category {@link TagCategory}
     */
    public void updateCategory(TagCategory category) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Delete a {@link Tag}
     *
     * @param tag {@link Tag}
     */
    public void deleteTag(Tag tag) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Delete a {@link TagCategory}
     *
     * @param category {@link TagCategory}
     */
    public void deleteCategory(TagCategory category) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Default {@link TagCategory}
     *
     * @return {@link TagCategory}
     */
    public @Nullable TagCategory getDefaultCategory() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Does a default {@link TagCategory} exist?
     *
     * @return {@link Boolean}
     */
    public boolean isDefaultCategory() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
