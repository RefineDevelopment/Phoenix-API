package xyz.refinedev.phoenix.profile.permission;

import xyz.refinedev.phoenix.rank.scopeable.IScopeable;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 08/01/2023
 * Project: Phoenix
 */

public interface IProfilePermission extends IScopeable {
    /**
     * Is the {@link IProfilePermission} permanent?
     *
     * @return {@link Boolean} Permanent
     */
    boolean isPermanent();

    /**
     * Has the {@link IProfilePermission} expired?
     *
     * @return {@link Boolean} Expired
     */
    boolean hasExpired();

    @Override
    int hashCode();

    @Override
    boolean equals(Object o);

    String getPermission();

    long getExpiration();
}
