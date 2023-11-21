package xyz.refinedev.phoenix.profile.chatsnapshot;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * This Project is property of Refine Development.<br>
 * Copyright © 2023, All Rights Reserved.<br>
 * Redistribution of this Project is not allowed.<br>
 * </p>
 *
 * @author Creaxx
 * @since 3/26/2023
 */

@Getter
@RequiredArgsConstructor
public class ChatEntry {

    private final UUID uuid;
    private final long time = System.currentTimeMillis();
    private final String message;

    public String getNiceTime() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
