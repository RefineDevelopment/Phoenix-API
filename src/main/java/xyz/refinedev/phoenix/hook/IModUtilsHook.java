package xyz.refinedev.phoenix.hook;

import xyz.refinedev.phoenix.profile.Profile;

import java.util.UUID;

/**
 * This Project is the property of Phoenix Development © 2022
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 07/12/2022
 * Project: pxCore
 */

public interface IModUtilsHook {

    public boolean canChat(UUID player);

    public String getMessage(UUID player);

    public String getFormat(UUID player, String message);

    public boolean isVanished(UUID uuid);

    public boolean canSee(Profile profile, Profile other);

    public void setFrozen(UUID uuid, boolean bol);

    public boolean isFrozen(UUID uuid);

}