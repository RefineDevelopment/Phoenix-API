package xyz.refinedev.phoenix;

import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.chat.api.ChatChannelType;
import xyz.refinedev.phoenix.profile.Profile;

/**
 * <p>
 * This Project is property of Refine Development.<br>
 * Copyright © 2023, All Rights Reserved.<br>
 * Redistribution of this Project is not allowed.<br>
 * </p>
 *
 * @author Creaxx
 * @since 2/5/2023
 */
public class BukkitAPI {

    public static void sendSomeStaffMessage(Profile profile, ChatChannelType channelType, String message) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static void sendSomeStaffMessageConsole(ChatChannelType channelType, String message) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
