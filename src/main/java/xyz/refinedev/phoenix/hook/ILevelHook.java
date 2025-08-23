package xyz.refinedev.phoenix.hook;

import xyz.refinedev.phoenix.profile.IProfile;

import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 8/30/2022
 * Project: Phoenix
 */

public interface ILevelHook {

    void addExperience(IProfile profile, int amount, String reason);

    void removeExperience(IProfile profile, int amount);

    void setExperience(IProfile profile, int amount);

    void openLevelMenu(UUID player, IProfile profile);

    String getLevelNameWithColor(IProfile profile);

    String getLevelNameWithColor(int exp);

    String getLevelDisplayName(IProfile profile);

    String getLevelDisplayName(int exp);

    int getExperience(IProfile profile);

}
