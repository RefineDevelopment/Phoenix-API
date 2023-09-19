package xyz.refinedev.phoenix.handler;

import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.filter.Filter;

public class FilterHandler {
    public Filter getFilterFromMessage(String message) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void updateFilter(Filter filter) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void removeFilter(Filter filter) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Filter getFilterByName(String word) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isFiltered(String message) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
