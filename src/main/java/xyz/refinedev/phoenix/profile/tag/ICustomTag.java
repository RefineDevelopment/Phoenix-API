package xyz.refinedev.phoenix.profile.tag;

import java.util.UUID;

/**
 * @author Creaxx
 * @version Phoenix
 * @since 23/08/2024
 */

public interface ICustomTag extends ITag {
    /**
     * Returns if the {@link ICustomTag}
     * is accepted
     *
     * @return {@link Boolean} Denied
     */
    boolean isAccepted();

    /**
     * Returns if the {@link ICustomTag}
     * is denied
     *
     * @return {@link Boolean} Denied
     */
    boolean isDenied();

    UUID getCreator();

    long getCreatedOn();

    CustomTagStatus getStatus();

    void setStatus(CustomTagStatus status);
}
