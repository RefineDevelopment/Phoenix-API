package xyz.refinedev.phoenix.handler;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.profile.filter.IFilter;
import xyz.refinedev.phoenix.repository.IFilterRepository;

public interface IFilterHandler {
    /**
     * Get a {@link IFilter} from a Message
     *
     * @param message {@link String} Message
     * @return {@link IFilter} Filter
     */
    @Nullable
    IFilter getFilterFromMessage(String message);

    /**
     * Update a {@link IFilter}
     *
     * @param filter {@link IFilter} Filter
     */
    void updateFilter(IFilter filter);

    /**
     * Remove a {@link IFilter}
     *
     * @param filter {@link IFilter} Filter
     */
    void removeFilter(IFilter filter);

    /**
     * Get a {@link IFilter} from a Word
     *
     * @param word {@link String} Word
     * @return {@link IFilter} Filter
     */
    @Nullable
    IFilter getFilterByName(String word);

    /**
     * Is a message filtered?
     *
     * @param message {@link String} Message
     * @return {@link Boolean} Filtered
     */
    boolean isFiltered(String message);


    /**
     * Sanitize a Message for filtering
     *
     * @param message {@link String} Message
     * @return {@link String} Sanitized
     */
    @NotNull
    String sanitize(String message);

    IFilterRepository getRepository();
}
