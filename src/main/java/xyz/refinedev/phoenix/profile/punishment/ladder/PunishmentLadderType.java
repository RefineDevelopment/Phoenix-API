package xyz.refinedev.phoenix.profile.punishment.ladder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import xyz.refinedev.phoenix.profile.punishment.PunishmentType;

/**
 * @author Creaxx
 * Created At: 4/1/2023
 */

@Getter
@Setter
@AllArgsConstructor
public class PunishmentLadderType {
    private final int order;

    private final PunishmentType type;
    private final long duration;
    private final boolean ip;
    private final boolean shadow;

}
