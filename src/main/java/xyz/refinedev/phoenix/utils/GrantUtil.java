package xyz.refinedev.phoenix.utils;

import lombok.experimental.UtilityClass;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.Profile;
import xyz.refinedev.phoenix.profile.grant.Grant;
import xyz.refinedev.phoenix.rank.Rank;
import xyz.refinedev.phoenix.scope.Scope;

import java.util.List;

/**
 * @author Creaxx
 * Created At: 09/11/2023
 */

@UtilityClass
public class GrantUtil {
    public boolean canEdit(CommandSender sender, Profile target) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void giveRank(CommandSender sender, Profile target, long duration, boolean permanent, String reason, Rank rank, List<Scope> scopes) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void takeRank(CommandSender sender, Profile target, Grant grant, String reason) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
