package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.chat.api.ChatChannelType;
import xyz.refinedev.phoenix.chat.api.ChatLimitation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Creaxx
 * Created At: 5/20/2023
 */

@Getter
public class ChatHandler {
    private final List<ChatChannelType> chatChannels = new ArrayList<>();
    private final List<ChatLimitation> chatLimitations = new ArrayList<>();
    private List<ChatLimitation> sortedChatLimitations = new ArrayList<>();

    /**
     * Get a {@link ChatChannelType} by its Quick Access
     *
     * @param message {@link String} Message
     * @return {@link ChatChannelType}
     */
    public @Nullable ChatChannelType getChannelByQuickAccess(String message) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the replaced chat format for a Profile
     *
     * @param player  {@link Player} Player
     * @param message {@link String} Message
     * @return {@link String} Replaced Message
     */
    public @NotNull String getReplacedChatFormat(Player player, String message) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the replaced message for a Player
     *
     * @param player  {@link Player} Player
     * @param message {@link String} Message
     * @return {@link String} Replaced Message
     */
    public @NotNull String getReplaced(Player player, String message) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the sorted chat channels a Player
     * has access to
     *
     * @param player {@link Player} Player
     * @return {@link List<String>} Chat Channels
     */
    public @NotNull List<String> getAccessChannelsSorted(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get Sorted Chat Channels
     *
     * @return {@link List<ChatChannelType>}
     */
    public @NotNull List<ChatChannelType> getSortedChatChannels() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Add a {@link ChatChannelType}
     *
     * @param chatChannelType {@link ChatChannelType} Chat Channel
     */
    public void addChannel(ChatChannelType chatChannelType) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link ChatChannelType} by Name
     *
     * @param name {@link String} Name
     * @return {@link ChatChannelType}
     */
    public @NotNull ChatChannelType getChannelByName(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Add a {@link ChatLimitation}
     *
     * @param chatLimitation {@link ChatLimitation} Chat Limitation
     */
    public void addLimitation(ChatLimitation chatLimitation) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link ChatLimitation} by Name
     *
     * @param name {@link String} Name
     * @return {@link ChatLimitation}
     */
    public @Nullable ChatLimitation getLimitationByName(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Sort Chat Limitations
     */
    public void sortChatLimitations() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
