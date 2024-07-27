package xyz.refinedev.phoenix.profile.chatsnapshot;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;
import xyz.refinedev.phoenix.SharedAPI;
import xyz.refinedev.phoenix.profile.Profile;
import xyz.refinedev.phoenix.profile.punishment.Punishment;
import xyz.refinedev.phoenix.utils.DateUtils;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author Creaxx
 * @version Phoenix
 * @since 27/07/2024
 */

@Getter
@RequiredArgsConstructor
public class ChatLog {
    @SerializedName("_id")
    private final String id = getRandomSaltedString(8);
    private final long timestamp = System.currentTimeMillis();

    private final UUID sender;
    private final String message;

    /**
     * Get the Colored Name of the Sender
     *
     * @return {@link String} Colored Name
     */
    public @NotNull String getNiceSender() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the formatted Timestamp
     * If its under 12h we get the time ago and otherwise the date
     *
     * @return {@link String} Formatted Timestamp
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
