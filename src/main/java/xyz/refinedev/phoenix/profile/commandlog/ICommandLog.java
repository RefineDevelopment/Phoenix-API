package xyz.refinedev.phoenix.profile.commandlog;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 2/1/2023
 */

public interface ICommandLog {
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

    UUID getId();

    UUID getIssuedBy();

    String getCommand();

    String getServer();

    long getIssuedOn();
}
