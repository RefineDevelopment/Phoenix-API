package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.placeholder.PlaceholderAdapter;

import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 5/20/2023
 */

@Getter
public class PlaceholderHandler {
    /**
     * Add a {@link PlaceholderAdapter}
     *
     * @param adapter {@link PlaceholderAdapter} Adapter
     */
    public void addAdapter(PlaceholderAdapter adapter) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link PlaceholderAdapter} by its ID
     *
     * @param identifier {@link String} ID
     * @return {@link PlaceholderAdapter} Adapter
     */
    public @Nullable PlaceholderAdapter getAdapter(String identifier) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Replace Text for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @param text {@link String} Text to Replace
     * @return {@link String} Replaced Text
     */
    public String replace(UUID uuid, String text) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

}
