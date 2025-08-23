package xyz.refinedev.phoenix.profile.punishment;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 1/14/2023
 */

public interface IProof {
    /**
     * Get the Colored Name of the Issuer
     *
     * @return {@link String} Colored Name
     */
    @NotNull
    String getNiceAddedBy();

    ProofType getType();

    String getProof();

    UUID getAddedBy();
}
