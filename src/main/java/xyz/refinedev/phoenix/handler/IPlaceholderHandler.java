package xyz.refinedev.phoenix.handler;

import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.placeholder.PlaceholderAdapter;

import java.util.Map;
import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 5/20/2023
 */

public interface IPlaceholderHandler {
    /**
     * Add a {@link PlaceholderAdapter}
     *
     * @param adapter {@link PlaceholderAdapter} Adapter
     */
    void addAdapter(PlaceholderAdapter adapter);

    /**
     * Get a {@link PlaceholderAdapter} by its ID
     *
     * @param identifier {@link String} ID
     * @return {@link PlaceholderAdapter} Adapter
     */
    @Nullable
    PlaceholderAdapter getAdapter(String identifier);

    /**
     * Replace Text for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @param text {@link String} Text to Replace
     * @return {@link String} Replaced Text
     */
    String replace(UUID uuid, String text);

    Map<String, PlaceholderAdapter> getAdapters();
}
