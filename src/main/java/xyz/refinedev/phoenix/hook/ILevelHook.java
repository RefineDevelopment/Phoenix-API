package xyz.refinedev.phoenix.hook;

import xyz.refinedev.phoenix.profile.Profile;

import java.util.UUID;

/**
 * This Project is the property of Phoenix Development © 2022
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 8/30/2022
 * Project: pxCore
 */

public interface ILevelHook {

    void addExperience(Profile profile, int amount, String reason);

    void removeExperience(Profile profile, int amount);

    void setExperience(Profile profile, int amount);

    void openLevelMenu(UUID player, Profile profile);

    String getLevelNameWithColor(Profile profile);

    String getLevelNameWithColor(int exp);

    String getLevelDisplayName(Profile profile);

    String getLevelDisplayName(int exp);

    int getExperience(Profile profile);

}
