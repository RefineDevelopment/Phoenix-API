package xyz.refinedev.phoenix.profile.filter;

import org.bukkit.plugin.IllegalPluginAccessException;

public class Filter {
    public String getName() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getFilter() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public FilterType getFilterType() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isHard() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void setHard(boolean hard) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
