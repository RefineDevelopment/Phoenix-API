package xyz.refinedev.phoenix.profile.security;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 4/17/2023
 */

@Getter
@Setter
@RequiredArgsConstructor
public class SecurityUser {
    @SerializedName("_id")
    private final UUID uuid;
    private final UUID issuedBy;
    private final boolean admin;

    /**
     * Get the Colored Name of the Issuer
     *
     * @return {@link String} Colored Name
     */
    public @NotNull String getNiceIssuedBy() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
