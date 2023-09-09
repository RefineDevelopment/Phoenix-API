package xyz.refinedev.phoenix.server;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.rank.Rank;
import xyz.refinedev.phoenix.whitelist.WhitelistAccess;

import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx (@Creaxx#0001)
 * 26-Jul-21 / 18:08
 * Phoenix / xyz.refinedev.core.bukkit.utils
 */

@Getter
@RequiredArgsConstructor
public class WhitelistInfo {

    private final boolean whitelisted;
    private final Set<WhitelistAccess> accessTypes;
    private final UUID rankId;
    private final List<String> uuids;

    public Rank getRank() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

}