package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.profile.punishment.ladder.PunishmentLadder;

/**
 * @author Creaxx
 * Created At: 4/1/2023
 */

@Getter
public class PunishmentLadderHandler {
    /**
     * Create a {@link PunishmentHandler}
     *
     * @param name    {@link String} Name
     * @param reason  {@link String} Reason
     * @param require {@link Boolean} Require a Chat Snapshot?
     */
    public void createLadder(String name, String reason, boolean require) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link PunishmentLadder} by its Name
     *
     * @param name {@link String} Name
     * @return {@link PunishmentLadder}
     */
    public @Nullable PunishmentLadder getByName(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
