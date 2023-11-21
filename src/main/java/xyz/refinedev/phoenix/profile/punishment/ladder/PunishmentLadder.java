package xyz.refinedev.phoenix.profile.punishment.ladder;

import com.google.gson.annotations.SerializedName;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.punishment.Punishment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Creaxx
 * Created At: 4/1/2023
 */

public class PunishmentLadder {

    public PunishmentLadder(String id, String reason, boolean requireChatSnapshot) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<PunishmentLadderType> getSortedLadders() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public PunishmentLadderType getByOrder(int order) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public int getPunishedTimes(List<Punishment> punishments) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public PunishmentLadderType getNextLadder(List<Punishment> punishments) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getId() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getReason() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isRequireChatSnapshot() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<PunishmentLadderType> getLadder() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void setLadder(List<PunishmentLadderType> ladder) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
