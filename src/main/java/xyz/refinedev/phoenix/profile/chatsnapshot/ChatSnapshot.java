package xyz.refinedev.phoenix.profile.chatsnapshot;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;
import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 3/26/2023
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

    /**
     * Get the formatted Created Date
     *
     * @return {@link String} Formatted Date
     */
    public String getNiceCreatedOn() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a random String
     *
     * @param size {@link Integer} String Length
     * @return {@link String}
     */
    public static String getRandomSaltedString(int size) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
