package xyz.refinedev.phoenix.profile.cooldown;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 07/12/2022
 * Project: Phoenix
 */

public interface ICooldown {
    /**
     * Get the MS passed since the creation of the {@link ICooldown}
     *
     * @return {@link Long}
     */
    long getPassed();

    /**
     * Get the MS remaining of the {@link ICooldown}
     *
     * @return {@link Long}
     */
    long getRemaining();

    /**
     * Has the {@link ICooldown} expired?
     *
     * @return {@link Boolean} Expired
     */
    boolean hasExpired();

    /**
     * Get the seconds remaining of the {@link ICooldown}
     *
     * @return {@link Long}
     */
    int getSecondsLeft();

    /**
     * Cancel the {@link ICooldown}
     */
    void cancel();

    long getStart();

    long getExpire();

    String getName();

    void setStart(long start);

    void setExpire(long expire);

    void setName(String name);
}
