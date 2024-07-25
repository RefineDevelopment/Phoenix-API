package xyz.refinedev.phoenix.profile.log;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;
import xyz.refinedev.phoenix.utils.Expirable;

import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 06/12/2022
 * Project: Phoenix
 */

@Getter
@Setter
public class Logable extends Expirable {

    @SerializedName("_id")
    private UUID uuid = UUID.randomUUID();
    private UUID target, issuedBy, removedBy;
    private String issuedOn, removedOn;
    private String reason, removedReason;

    /**
     * Get the Colored Name of the Issuer
     *
     * @return {@link String} Colored Name
     */
    public @NotNull String getNiceIssuedBy() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Colored Name of the Remover
     *
     * @return {@link String} Colored Name
     */
    public @NotNull String getNiceRemovedBy() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Colored Name of the Target
     *
     * @return {@link String} Colored Name
     */
    public @NotNull String getNiceTarget() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
