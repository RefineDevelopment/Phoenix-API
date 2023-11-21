package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.other.CommandLog;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * <p>
 * This Project is property of Refine Development.<br>
 * Copyright © 2023, All Rights Reserved.<br>
 * Redistribution of this Project is not allowed.<br>
 * </p>
 *
 * @author Creaxx
 * @since 2/1/2023
 */

@Getter
public class CommandLogHandler {

    public void saveCommandLog(UUID uuid, String server, String command) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public CompletableFuture<List<CommandLog>> findByIssuedBy(UUID uuid, long time, boolean perm) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public CompletableFuture<List<CommandLog>> findByServer(String server, long time, boolean perm) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
