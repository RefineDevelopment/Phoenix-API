package xyz.refinedev.phoenix.profile.filter;

import xyz.refinedev.phoenix.profile.punishment.ladder.IPunishmentLadder;

public interface IFilter {
    /**
     * Checks if a {@link IPunishmentLadder} is
     * assigned to this {@link IFilter}
     *
     * @return {@link Boolean} Has PunishmentLadder
     */
    boolean hasPunishmentLadder();

    /**
     * Get the {@link IPunishmentLadder} for this {@link IFilter}
     *
     * @return {@link IPunishmentLadder} Ladder
     */
    IPunishmentLadder getPunishmentLadder();

    @Override
    int hashCode();

    @Override
    boolean equals(Object o);

    String getName();

    String getFilter();

    FilterType getFilterType();

    boolean isHard();

    String getPunishmentLadderId();

    boolean isAutoPunish();

    void setFilterType(FilterType filterType);

    void setHard(boolean hard);

    void setPunishmentLadderId(String punishmentLadderId);

    void setAutoPunish(boolean autoPunish);
}
