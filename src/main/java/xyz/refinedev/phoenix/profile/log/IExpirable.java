package xyz.refinedev.phoenix.profile.log;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 06/12/2022
 * Project: Phoenix
 */

public interface IExpirable {
    /**
     * Is the {@link IExpirable} Active?
     *
     * @return {@link Boolean} Active
     */
    boolean isActive();

    /**
     * Get the formatted Duration of the {@link IExpirable}
     *
     * @return {@link String} Formatted Duration
     */
    String getNiceDuration();

    /**
     * Get the formatted Expire of the {@link IExpirable}
     *
     * @return {@link String} Formatted Expire
     */
    String getNiceExpire();

    long getIssuedAt();

    long getRemovedAt();

    long getDuration();

    boolean isPermanent();

    void setActive(boolean active);

    void setIssuedAt(long issuedAt);

    void setRemovedAt(long removedAt);

    void setDuration(long duration);

    void setPermanent(boolean permanent);
}
