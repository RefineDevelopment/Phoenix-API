package xyz.refinedev.phoenix.profile.security;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 4/17/2023
 */

public interface ISecurityUser {
    /**
     * Get the Colored Name of the Issuer
     *
     * @return {@link String} Colored Name
     */
    @NotNull
    String getNiceIssuedBy();

    @Override
    int hashCode();

    @Override
    boolean equals(Object o);

    UUID getUuid();

    UUID getIssuedBy();

    boolean isAdmin();
}
