package xyz.refinedev.phoenix.profile.disguise;

import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 07/12/2022
 * Project: Phoenix
 */

public interface IDisguiseHistory {
    @Override
    int hashCode();

    @Override
    boolean equals(Object o);

    UUID getId();

    long getDate();

    UUID getPlayer();

    UUID getRankId();

    String getName();

    ISkin getSkin();
}
