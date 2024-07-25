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

    private PunishmentType type;
    private long duration;
    private boolean ip;
    private boolean shadow;

}
