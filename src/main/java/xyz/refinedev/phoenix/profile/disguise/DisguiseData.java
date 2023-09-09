package xyz.refinedev.phoenix.profile.disguise;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

/**
 * This Project is the property of Phoenix Development © 2022
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 07/12/2022
 * Project: pxCore
 */

@Getter
@Setter
public class DisguiseData {
    private String realName;
    private String disguiseName;

    private UUID rankId;

    private Skin realSkin;
    private Skin disguiseSkin;

    public boolean isRankDisguised() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isDisguised() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
