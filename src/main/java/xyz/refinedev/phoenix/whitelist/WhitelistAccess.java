package xyz.refinedev.phoenix.whitelist;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;

public enum WhitelistAccess {

    RANK("Rank"),
    UUID("UUID");

    @Getter
    private final String displayName;

    WhitelistAccess(String displayName) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static WhitelistAccess getWhitelistAccessByName(String accesss) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

}
