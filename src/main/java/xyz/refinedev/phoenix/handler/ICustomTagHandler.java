
package xyz.refinedev.phoenix.handler;

import org.jetbrains.annotations.NotNull;
import xyz.refinedev.phoenix.profile.tag.ICustomTag;
import xyz.refinedev.phoenix.utils.repository.IListRepository;

import java.util.List;
import java.util.UUID;

public interface ICustomTagHandler {
    /**
     * Get all unconfirmed Custom Tags
     *
     * @return {@link List<ICustomTag>} Tags
     */
    List<ICustomTag> getUnconfirmedTags();

    /**
     * Get all the Custom Tags a Player has created
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link List<ICustomTag>} Tags
     */
    List<ICustomTag> getTags(UUID uuid);

    /**
     * Get Sorted Tags for a Player
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link List<ICustomTag>}
     */
    @NotNull List<ICustomTag> getSortedTags(UUID uuid);

    /**
     * Get Sorted Tags for a Player
     * in reverse order
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link List<ICustomTag>}
     */
    @NotNull List<ICustomTag> getSortedTagsReversed(UUID uuid);

    /**
     * Update a {@link ICustomTag}
     *
     * @param tag {@link ICustomTag}
     */
    void updateTag(ICustomTag tag);

    /**
     * Delete a {@link ICustomTag}
     *
     * @param tag {@link ICustomTag}
     */
    void deleteTag(ICustomTag tag);

    IListRepository<String, ICustomTag> getRepository();
}
