package xyz.refinedev.phoenix.handler;

import org.jetbrains.annotations.NotNull;
import xyz.refinedev.phoenix.profile.cooldown.ILocalCooldown;

import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 1/26/2023
 */

public interface ICooldownHandler {
    /**
     * Place a Profile on {@link ILocalCooldown}
     *
     * @param name     {@link String} Cooldown Name
     * @param uuid     {@link UUID} Profile UUID
     * @param duration {@link Long} Cooldown Duration
     */
    void placeOnCooldown(String name, UUID uuid, long duration);

    /**
     * Is a Profile on a {@link ILocalCooldown}?
     *
     * @param name {@link String} Cooldown Name
     * @param uuid {@link UUID} Profile UUID
     * @return {@link Boolean} Is On Cooldown
     */
    boolean isOnCooldown(String name, UUID uuid);

    /**
     * Get the Remaining Time for a {@link ILocalCooldown}
     *
     * @param name {@link String} Cooldown Name
     * @param uuid {@link UUID} Profile UUID
     * @return {@link Long} Remaining (MS)
     */
    long getRemaining(String name, UUID uuid);

    /**
     * Get or Create a {@link ILocalCooldown} for
     * a Profile
     *
     * @param name {@link String} Cooldown Name
     * @return {@link ILocalCooldown} Cooldown
     */
    @NotNull
    ILocalCooldown getOrCreate(String name);

    /**
     * Get the number of cooldowns for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link Integer} Count
     */
    int getCooldownCount(UUID uuid);

    /**
     * Clear a Profile's Cooldowns
     *
     * @param uuid {@link UUID} Profile UUID
     */
    void clearCooldowns(UUID uuid);
}
