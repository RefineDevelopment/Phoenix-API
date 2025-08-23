package xyz.refinedev.phoenix.profile.punishment.ladder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.profile.punishment.IPunishment;

import java.util.List;

/**
 * @author Creaxx
 * Created At: 4/1/2023
 */

public interface IPunishmentLadder {
    /**
     * Get all sorted PunishmentLadderTypes
     *
     * @return {@link List< IPunishmentLadderType >}
     */
    public @NotNull List<IPunishmentLadderType> getSortedLadders();

    /**
     * Get the {@link IPunishmentLadderType} in that Position
     *
     * @param order {@link Integer} Order
     * @return {@link IPunishmentLadderType} Type
     */
    public @Nullable IPunishmentLadderType getByOrder(int order);

    /**
     * Get the amount of times a Profile has been punished
     * by this ladder
     *
     * @param punishments {@link List<IPunishment>} Punishments
     * @return {@link Integer} Punished Times
     */
    public int getPunishedTimes(List<IPunishment> punishments);

    public long getLastPunishDate(List<IPunishment> punishments);

    /**
     * Get the next {@link IPunishmentLadderType} in the
     * {@link IPunishmentLadder} for a list of Punishments
     *
     * @param punishments {@link List<IPunishment>} Punishments
     * @return {@link IPunishmentLadderType} Type
     */
    public IPunishmentLadderType getNextLadder(List<IPunishment> punishments);

    @Override
    public int hashCode();

    @Override
    public boolean equals(Object o);

    public String getId();

    public String getReason();

    public boolean isRequireChatSnapshot();

    public int getPriority();

    public boolean isHidden();

    public List<IPunishmentLadderType> getLadder();

    public void setPriority(int priority);

    public void setHidden(boolean hidden);

    public void setLadder(List<IPunishmentLadderType> ladder);
}
