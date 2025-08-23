package xyz.refinedev.phoenix;

import lombok.experimental.UtilityClass;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.chat.api.ChatChannelType;
import xyz.refinedev.phoenix.profile.IProfile;
import xyz.refinedev.phoenix.profile.tag.ITag;

import java.util.List;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 07/12/2022
 * Project: Phoenix
 */

@UtilityClass
public class BukkitAPI {
    /**
     * Is the provided string a uuid?
     *
     * @param string {@link String} UUID
     * @return {@link Boolean} Is UUID
     */
    public boolean isUuid(String string) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Send an admin alert message
     *
     * @param sender {@link Player} Sender
     * @param alert  {@link String} Alert Message
     */
    public void sendAdminAlert(Player sender, String alert) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Broadcast a message to all Players with 'core.admin'
     *
     * @param message {@link String} Message
     */
    public void broadcastToStaff(String message) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Player} in ModMode
     *
     * @param player {@link Player} Player
     * @return {@link Boolean} ModMode
     */
    public boolean isInModMode(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Parse a string as a Duration
     *
     * @param duration {@link String} Duration String
     * @return {@link Long} Duration
     */
    public long parseDuration(String duration) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Call an Event on the correct Thread from any Thread
     *
     * @param event {@link Event} Event
     */
    public void callEvent(Event event) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Convert a list of string into a kick message
     *
     * @param source {@link List<String>} Messages
     * @return {@link String} Kick message
     */
    public String getKickMessage(List<String> source) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Tag Prefix for a Player
     *
     * @param player {@link Player} Player
     * @return {@link String} Tag Prefix
     */
    public @NotNull String getTagPrefix(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Does the {@link Player} have access to the {@link ITag}
     *
     * @param player {@link Player} Player
     * @param tag    {@link ITag} Tag
     * @return {@link Boolean} Has Tag
     */
    public boolean hasTag(Player player, ITag tag) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Send a Message on a Staff Channel
     *
     * @param profile     {@link IProfile} Profile
     * @param channelType {@link ChatChannelType} Channel
     * @param message     {@link String} Message
     */
    public void sendSomeStaffMessage(IProfile profile, ChatChannelType channelType, String message) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Send a Message on a Staff Channel as Console
     *
     * @param channelType {@link ChatChannelType} Channel
     * @param message     {@link String} Message
     */
    public void sendSomeStaffMessageConsole(ChatChannelType channelType, String message) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a Profile by Name
     *
     * @param name {@link String} Name
     * @return {@link IProfile} Profile
     */
    public @Nullable IProfile getProfileByName(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
