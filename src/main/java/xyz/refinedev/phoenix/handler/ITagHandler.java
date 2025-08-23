package xyz.refinedev.phoenix.handler;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.profile.tag.ITag;
import xyz.refinedev.phoenix.profile.tag.ITagCategory;
import xyz.refinedev.phoenix.repository.ITagCategoryRepository;
import xyz.refinedev.phoenix.repository.ITagRepository;

import java.util.List;

public interface ITagHandler {
    /**
     * Get all Sorted Tag Categories
     *
     * @return {@link List<ITagCategory>}
     */
    @NotNull List<ITagCategory> getSortedCategories();

    /**
     * Get all Sorted Tag Categories in reverse order
     *
     * @return {@link List<ITagCategory>}
     */
    @NotNull List<ITagCategory> getSortedCategoriesReversed();

    /**
     * Get all Sorted Tags
     *
     * @return {@link List<ITag>}
     */
    @NotNull List<ITag> getSortedTags();

    /**
     * Get all Sorted Tags in reverse order
     *
     * @return {@link List<ITag>}
     */
    @NotNull List<ITag> getSortedTagsReversed();

    /**
     * Get a {@link ITag} by its Name
     *
     * @param name {@link String} Name
     * @return {@link ITag}
     */
    @Nullable ITag getTag(String name);

    /**
     * Get a {@link ITagCategory} by its Name
     *
     * @param name {@link String} Name
     * @return {@link ITagCategory}
     */
    @Nullable ITagCategory getTagCategory(String name);

    /**
     * Update a {@link ITag}
     *
     * @param tag {@link ITag}
     */
    void updateTag(ITag tag);

    /**
     * Update a {@link ITagCategory}
     *
     * @param category {@link ITagCategory}
     */
    void updateCategory(ITagCategory category);

    /**
     * Delete a {@link ITag}
     *
     * @param tag {@link ITag}
     */
    void deleteTag(ITag tag);

    /**
     * Delete a {@link ITagCategory}
     *
     * @param category {@link ITagCategory}
     */
    void deleteCategory(ITagCategory category);

    /**
     * Get the Default {@link ITagCategory}
     *
     * @return {@link ITagCategory}
     */
    @Nullable ITagCategory getDefaultCategory();

    /**
     * Does a default {@link ITagCategory} exist?
     *
     * @return {@link Boolean}
     */
    boolean isDefaultCategory();

    ITagCategoryRepository getCategoryRepository();

    ITagRepository getTagRepository();
}
