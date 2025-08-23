package xyz.refinedev.phoenix.handler;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.profile.chatsnapshot.IChatEntry;
import xyz.refinedev.phoenix.profile.chatsnapshot.IChatSnapshot;
import xyz.refinedev.phoenix.repository.IChatSnapshotRepository;
import xyz.refinedev.phoenix.utils.LimitedSizeList;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * @author Creaxx
 * Created At: 3/26/2023
 */

public interface IChatSnapshotHandler {
    /**
     * Load the Chat Snapshots for a {@link UUID}
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link List<IChatSnapshot>} Chat Snapshots
     */
    @NotNull List<IChatSnapshot> loadSnapshots(UUID uuid);

    /**
     * Create a {@link IChatSnapshot} for a {@link UUID}
     *
     * @param createdBy {@link UUID} Creator
     * @return {@link IChatSnapshot} Snapshot
     */
    @Nullable IChatSnapshot createSnapshot(UUID createdBy);

    /**
     * Create a {@link IChatSnapshot} for a {@link UUID}
     * including messages only from a {@link UUID}
     *
     * @param createdBy {@link UUID} Creator
     * @param player    {@link UUID} Player
     * @return {@link IChatSnapshot} Snapshot
     */
    @Nullable IChatSnapshot createSnapshot(UUID createdBy, UUID player);

    /**
     * Delete a {@link IChatSnapshot}
     *
     * @param snapshot {@link IChatSnapshot} Snapshot
     */
    void deleteSnapshot(IChatSnapshot snapshot);

    /**
     * Get the Chat Snapshots for a {@link UUID}
     *
     * @param uuid {@link UUID} Profile UUID
     * @return Chat Snapshots
     */
    @NotNull CompletableFuture<List<IChatSnapshot>> getByPlayer(UUID uuid);

    /**
     * Get a {@link IChatSnapshot} by its Nice ID
     *
     * @param id {@link String} Nice ID
     * @return {@link IChatSnapshot} Snapshot
     */
    @Nullable IChatSnapshot getByNiceId(String id);

    IChatSnapshotRepository getRepository();

    LimitedSizeList<IChatEntry> getChatEntries();
}
