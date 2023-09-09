package xyz.refinedev.phoenix;

import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.chat.api.ChatChannelType;
import xyz.refinedev.phoenix.profile.Profile;

/**
 * @author Creaxx
 * Created At: 2/5/2023
 */
public class BukkitAPI {

    public static void sendSomeStaffMessage(Profile profile, ChatChannelType channelType, String message) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static void sendSomeStaffMessageConsole(ChatChannelType channelType, String message) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
