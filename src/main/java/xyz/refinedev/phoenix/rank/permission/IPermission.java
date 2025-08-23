package xyz.refinedev.phoenix.rank.permission;

import xyz.refinedev.phoenix.rank.scopeable.IScopeable;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 08/01/2023
 * Project: Phoenix
 */

public interface IPermission extends IScopeable {
    @Override
    int hashCode();

    @Override
    boolean equals(Object o);

    String getPermission();
}
