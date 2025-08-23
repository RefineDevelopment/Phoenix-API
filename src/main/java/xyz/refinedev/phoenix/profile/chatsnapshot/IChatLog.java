package xyz.refinedev.phoenix.profile.chatsnapshot;

import org.jetbrains.annotations.NotNull;
import xyz.refinedev.phoenix.profile.punishment.IPunishment;

import java.util.UUID;

/**
 * @author Creaxx
 * @version Phoenix
 * @since 27/07/2024
 */

public interface IChatLog {
    /**
     * Get the Colored Name of the Sender
     *
     * @return {@link String} Colored Name
     */
    @NotNull
    String getNiceSender();

    /**
     * Get the formatted Timestamp
     * If its under 12h we get the time ago and otherwise the date
     *
     * @return {@link String} Formatted Timestamp
     */
    String getNiceCreatedOn();

    /**
     * Get a random String
     *
     * @param size {@link Integer} String Length
     * @return {@link String}
     */
    static String getRandomSaltedString(int size) {
        return IPunishment.getRandomSaltedString(size);
    }

    @Override
    int hashCode();

    @Override
    boolean equals(Object o);

    String getId();

    long getTimestamp();

    UUID getSender();

    String getMessage();
}
