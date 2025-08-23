package xyz.refinedev.phoenix.profile.cooldown;

import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 1/26/2023
 */

public interface ILocalCooldown {
    /**
     * Does the Profile have an active cooldown
     *
     * @param uniqueId {@link UUID} UUID
     * @return {@link Boolean} Active
     */
    public boolean isActive(UUID uniqueId);

    /**
     * Put a Profile on Cooldown
     *
     * @param uniqueId {@link UUID} UUID
     * @param duration {@link Long} Duration
     */
    public void placeOnCooldown(UUID uniqueId, long duration);

    /**
     * Get the Remaining MS for the {@link ILocalCooldown}
     *
     * @param uniqueId {@link UUID} UUID
     * @return {@link Long} Remaining (MS)
     */
    public long getRemaining(UUID uniqueId);

    /**
     * Remove a Profile from the {@link ILocalCooldown}
     *
     * @param uuid {@link UUID} UUID
     */
    public void removeUuid(UUID uuid);
}