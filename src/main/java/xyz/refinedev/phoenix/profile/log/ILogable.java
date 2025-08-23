package xyz.refinedev.phoenix.profile.log;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 06/12/2022
 * Project: Phoenix
 */

public interface ILogable extends IExpirable {
    /**
     * Get the Colored Name of the Issuer
     *
     * @return {@link String} Colored Name
     */
    @NotNull
    String getNiceIssuedBy();

    /**
     * Get the Colored Name of the Remover
     *
     * @return {@link String} Colored Name
     */
    @NotNull
    String getNiceRemovedBy();

    /**
     * Get the Colored Name of the Target
     *
     * @return {@link String} Colored Name
     */
    @NotNull
    String getNiceTarget();

    @Override
    int hashCode();

    @Override
    boolean equals(Object o);

    UUID getUuid();

    UUID getTarget();

    UUID getIssuedBy();

    UUID getRemovedBy();

    String getIssuedOn();

    String getRemovedOn();

    String getReason();

    String getRemovedReason();

    void setUuid(UUID uuid);

    void setTarget(UUID target);

    void setIssuedBy(UUID issuedBy);

    void setRemovedBy(UUID removedBy);

    void setIssuedOn(String issuedOn);

    void setRemovedOn(String removedOn);

    void setReason(String reason);

    void setRemovedReason(String removedReason);
}
