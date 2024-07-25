package xyz.refinedev.phoenix.profile.punishment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 1/14/2023
 */

@Getter
@AllArgsConstructor
public class Proof {

    private ProofType type;
    private String proof;
    private UUID addedBy;

    /**
     * Get the Colored Name of the Issuer
     *
     * @return {@link String} Colored Name
     */
    public @NotNull String getNiceAddedBy() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
