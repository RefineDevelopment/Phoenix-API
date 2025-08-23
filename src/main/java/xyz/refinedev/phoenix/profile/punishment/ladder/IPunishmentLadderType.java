package xyz.refinedev.phoenix.profile.punishment.ladder;

import xyz.refinedev.phoenix.profile.punishment.PunishmentType;

/**
 * @author Creaxx
 * Created At: 4/1/2023
 */

public interface IPunishmentLadderType {
    int getOrder();

    PunishmentType getType();

    long getDuration();

    boolean isIp();

    boolean isShadow();

    long getDecay();

    void setOrder(int order);

    void setType(PunishmentType type);

    void setDuration(long duration);

    void setIp(boolean ip);

    void setShadow(boolean shadow);

    void setDecay(long decay);
}
