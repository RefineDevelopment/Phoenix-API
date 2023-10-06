package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.placeholder.PlaceholderAdapter;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Creaxx
 * Created At: 5/20/2023
 */

@Getter
public class PlaceholderHandler {
    public void addAdapter(PlaceholderAdapter adapter) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public PlaceholderAdapter getAdapter(String identifier) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String replace(UUID uuid, String text) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

}
