package xyz.refinedev.phoenix.profile.metadata;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

/**
 * <p>
 * This Project is property of Refine Development.<br>
 * Copyright © 2023, All Rights Reserved.<br>
 * Redistribution of this Project is not allowed.<br>
 * </p>
 *
 * @author Creaxx
 * @since 27/12/2022
 * Project: pxCore
 */

@Getter
@Setter
@AllArgsConstructor
public class Metadata {
    private final UUID target;
    private final String name;
    private Object value;

    public String asString() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public int asInt() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public double asDouble() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean asBoolean() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
