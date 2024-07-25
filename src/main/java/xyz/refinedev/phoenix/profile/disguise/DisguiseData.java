package xyz.refinedev.phoenix.profile.disguise;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.Profile;

import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 07/12/2022
 * Project: Phoenix
 */

@Getter
@Setter
public class DisguiseData {
    private String realName;
    private String disguiseName;

    private UUID rankId;

    private Skin realSkin;
    private Skin disguiseSkin;

    /**
     * Is the {@link Profile} Rank Disguised
     *
     * @return {@link Boolean}
     */
    public boolean isRankDisguised() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Profile} Disguised
     *
     * @return {@link Boolean}
     */
    public boolean isDisguised() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
