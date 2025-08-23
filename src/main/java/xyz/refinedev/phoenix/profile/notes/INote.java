package xyz.refinedev.phoenix.profile.notes;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 1/14/2023
 */

public interface INote {
    /**
     * Get the Colored Name of the Issuer
     *
     * @return {@link String} Colored Name
     */
    @NotNull String getNiceIssuedBy();

    @Override
    int hashCode();

    @Override
    boolean equals(Object o);

    UUID getUuid();

    UUID getIssuedBy();

    long getIssuedAt();

    String getNote();

    void setUuid(UUID uuid);

    void setIssuedBy(UUID issuedBy);

    void setIssuedAt(long issuedAt);

    void setNote(String note);
}
