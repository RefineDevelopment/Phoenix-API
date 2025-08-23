package xyz.refinedev.phoenix.profile.chatsnapshot;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 3/26/2023
 */

public interface IChatSnapshot {
    /**
     * Get the Colored Name of the Requester
     *
     * @return {@link String} Colored Name
     */
    @NotNull
    String getNiceRequestedBy();


    /**
     * Get the formatted Created Date
     *
     * @return {@link String} Formatted Date
     */
    String getNiceCreatedOn();

    @Override
    int hashCode();

    @Override
    boolean equals(Object o);

    UUID getUuid();

    UUID getRequestedBy();

    List<IChatEntry> getChat();

    boolean isWholeChat();

    String getNiceId();

    long getCreatedOn();
}
