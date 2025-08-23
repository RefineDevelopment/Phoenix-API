package xyz.refinedev.phoenix.profile.disguise;

import xyz.refinedev.phoenix.profile.IProfile;

import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 07/12/2022
 * Project: Phoenix
 */

public interface IDisguiseData {
    /**
     * Is the {@link IProfile} Rank Disguised
     *
     * @return {@link Boolean}
     */
    boolean isRankDisguised();

    /**
     * Is the {@link IProfile} Disguised
     *
     * @return {@link Boolean}
     */
    boolean isDisguised();

    String getRealName();

    String getDisguiseName();

    UUID getRankId();

    ISkin getRealSkin();

    ISkin getDisguiseSkin();

    void setRealName(String realName);

    void setDisguiseName(String disguiseName);

    void setRankId(UUID rankId);

    void setRealSkin(ISkin realSkin);

    void setDisguiseSkin(ISkin disguiseSkin);
}
