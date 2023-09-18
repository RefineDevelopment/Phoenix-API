package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * @author Nopox
 * Created at 9/17/2023
 */
@Getter
public class FilterHandler {

    /**
     * @param message The message to check.
     * @return If the message should be filtered.
     */
    public boolean isFiltered(String message) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
