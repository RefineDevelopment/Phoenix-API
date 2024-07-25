package xyz.refinedev.phoenix.profile.punishment.ladder;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.profile.punishment.Punishment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Creaxx
 * Created At: 4/1/2023
 */

@Getter
@Setter
@RequiredArgsConstructor
public class PunishmentLadder {

    @SerializedName("_id")
    private final String id;
    private final String reason;
    private final boolean requireChatSnapshot;

    private List<PunishmentLadderType> ladder = new ArrayList<>();

    /**
     * Get all sorted PunishmentLadderTypes
     *
     * @return {@link List<PunishmentLadderType>}
     */
    public @NotNull List<PunishmentLadderType> getSortedLadders() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the {@link PunishmentLadderType} in that Position
     *
     * @param order {@link Integer} Order
     * @return {@link PunishmentLadderType} Type
     */
    public @Nullable PunishmentLadderType getByOrder(int order) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the amount of times a Profile has been punished
     * by this ladder
     *
     * @param punishments {@link List<Punishment>} Punishments
     * @return {@link Integer} Punished Times
     */
    public int getPunishedTimes(List<Punishment> punishments) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the next {@link PunishmentLadderType} in the
     * {@link PunishmentLadder} for a list of Punishments
     *
     * @param punishments {@link List<Punishment>} Punishments
     * @return {@link PunishmentLadderType} Type
     */
    public PunishmentLadderType getNextLadder(List<Punishment> punishments) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
