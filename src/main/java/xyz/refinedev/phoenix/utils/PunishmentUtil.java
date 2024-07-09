package xyz.refinedev.phoenix.utils;

import lombok.experimental.UtilityClass;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.Profile;
import xyz.refinedev.phoenix.profile.punishment.Punishment;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author Creaxx
 * Created At: 09/11/2023
 */

@UtilityClass
public class PunishmentUtil {
    public boolean containsSilent(String reason) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String sanitizeReason(String reason, String defaultReason) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void executePunishment(CommandSender sender, Punishment punishment) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void executeRevokePunishment(CommandSender sender, Punishment punishment) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean canPunish(CommandSender sender, Profile target, AtomicBoolean vsilent) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String replaceKickUnpunishMessage(String s, Punishment punishment) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getAltColor(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getAltColor(Profile profile) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getAltStatus(Profile profile) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

}
