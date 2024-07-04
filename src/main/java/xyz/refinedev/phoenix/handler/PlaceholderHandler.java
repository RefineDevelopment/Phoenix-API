package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.placeholder.PlaceholderAdapter;

import java.util.UUID;

/**
 * <p>
 * This Project is property of Refine Development.<br>
 * Copyright © 2023, All Rights Reserved.<br>
 * Redistribution of this Project is not allowed.<br>
 * </p>
 *
 * @author Creaxx
 * @since 5/20/2023
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
