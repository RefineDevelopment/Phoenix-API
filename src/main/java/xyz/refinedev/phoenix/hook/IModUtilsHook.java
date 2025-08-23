package xyz.refinedev.phoenix.hook;

import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 07/12/2022
 * Project: Phoenix
 */

public interface IModUtilsHook {
    public boolean isVanished(UUID uuid);

    public void setFrozen(UUID uuid, boolean bol);

    public boolean isFrozen(UUID uuid);

}