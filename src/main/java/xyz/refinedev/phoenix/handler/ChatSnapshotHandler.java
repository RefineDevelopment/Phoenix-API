package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.profile.chatsnapshot.ChatSnapshot;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * @author Creaxx
 * Created At: 3/26/2023
 */

@Getter
public class ChatSnapshotHandler {
    /**
     * Load the Chat Snapshots for a {@link UUID}
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link List<ChatSnapshot>} Chat Snapshots
     */
    public @NotNull List<ChatSnapshot> loadSnapshots(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Create a {@link ChatSnapshot} for a {@link UUID}
     *
     * @param createdBy {@link UUID} Creator
     * @return {@link ChatSnapshot} Snapshot
     */
    public @Nullable ChatSnapshot createSnapshot(UUID createdBy) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Create a {@link ChatSnapshot} for a {@link UUID}
     * including messages only from a {@link UUID}
     *
     * @param createdBy {@link UUID} Creator
     * @param player    {@link UUID} Player
     * @return {@link ChatSnapshot} Snapshot
     */
    public @NotNull ChatSnapshot createSnapshot(UUID createdBy, UUID player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Delete a {@link ChatSnapshot}
     *
     * @param snapshot {@link ChatSnapshot} Snapshot
     */
    public void deleteSnapshot(ChatSnapshot snapshot) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Chat Snapshots for a {@link UUID}
     *
     * @param uuid {@link UUID} Profile UUID
     * @return Chat Snapshots
     */
    public @NotNull CompletableFuture<List<ChatSnapshot>> getByPlayer(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link ChatSnapshot} by its Nice ID
     *
     * @param id {@link String} Nice ID
     * @return {@link ChatSnapshot} Snapshot
     */
    public @Nullable ChatSnapshot getByNiceId(String id) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
