package xyz.refinedev.phoenix.handler;

import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.profile.IProfile;
import xyz.refinedev.phoenix.profile.punishment.IPunishment;
import xyz.refinedev.phoenix.profile.punishment.ladder.IPunishmentLadder;
import xyz.refinedev.phoenix.repository.IPunishmentLadderRepository;

import java.util.List;
import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 4/1/2023
 */

public interface IPunishmentLadderHandler {
    /**
     * Create a {@link IPunishment} for a
     * {@link IProfile}'s {@link IPunishmentLadder}
     *
     * @param sender {@link UUID} Sender UUID
     * @param target {@link IProfile} Target
     * @param ladder {@link IPunishmentLadder} Ladder
     * @param silent {@link Boolean} Silent Punishment
     * @return {@link IPunishment} Punishment
     */
    IPunishment createPunishment(UUID sender, IProfile target, IPunishmentLadder ladder, boolean silent);

    /**
     * Create a {@link IPunishmentHandler}
     *
     * @param name    {@link String} Name
     * @param reason  {@link String} Reason
     * @param require {@link Boolean} Require a Chat Snapshot?
     */
    void createLadder(String name, String reason, boolean require);

    /**
     * Get a {@link IPunishmentLadder} by its Name
     *
     * @param name {@link String} Name
     * @return {@link IPunishmentLadder}
     */
    @Nullable
    IPunishmentLadder getByName(String name);

    /**
     * Get the sorted Punishment Ladders
     *
     * @return {@link List<IPunishmentLadder>} Sorted Ladders
     */
    List<IPunishmentLadder> getSortedLadders();

    IPunishmentLadderRepository getRepository();
}
