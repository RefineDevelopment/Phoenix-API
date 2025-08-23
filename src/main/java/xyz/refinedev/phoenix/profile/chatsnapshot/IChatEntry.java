package xyz.refinedev.phoenix.profile.chatsnapshot;

import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 3/26/2023
 */

public interface IChatEntry {
    /**
     * Get the formatted Time of the Entry
     *
     * @return {@link String}
     */
    String getNiceTime();

    @Override
    int hashCode();

    @Override
    boolean equals(Object o);

    UUID getUuid();

    long getTime();

    String getMessage();
}
