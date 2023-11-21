package xyz.refinedev.phoenix.profile.chatsnapshot;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;
import java.util.UUID;

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
public class ChatSnapshot {

    @SerializedName("_id")
    private final UUID uuid = UUID.randomUUID();

    private final UUID requestedBy;
    private final List<ChatEntry> chat;
    private final boolean wholeChat;
    private final String niceId = getRandomSaltedString(8);

    private final long createdOn = System.currentTimeMillis();

    public static String getRandomSaltedString(int size) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getNiceCreatedOn() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

}
