package xyz.refinedev.phoenix.handler;

import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.profile.filter.Filter;

public class FilterHandler {
    /**
     * Get a {@link Filter} from a Message
     *
     * @param message {@link String} Message
     * @return {@link Filter} Filter
     */
    public @Nullable Filter getFilterFromMessage(String message) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Update a {@link Filter}
     *
     * @param filter {@link Filter} Filter
     */
    public void updateFilter(Filter filter) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Remove a {@link Filter}
     *
     * @param filter {@link Filter} Filter
     */
    public void removeFilter(Filter filter) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Filter} from a Word
     *
     * @param word {@link String} Word
     * @return {@link Filter} Filter
     */
    public @Nullable Filter getFilterByName(String word) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is a message filtered?
     *
     * @param message {@link String} Message
     * @return {@link Boolean} Filtered
     */
    public boolean isFiltered(String message) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Sanitize a Message for filtering
     *
     * @param message {@link String} Message
     * @return {@link String} Sanitized
     */
    public @NotNull String sanitize(String message) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
