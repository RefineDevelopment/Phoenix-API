package xyz.refinedev.phoenix.handler;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.profile.chatsnapshot.IChatLog;
import xyz.refinedev.phoenix.repository.IChatLogRepository;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * @author Creaxx
 * Created At: 3/26/2023
 */

public interface IChatLogHandler {
    /**
     * Delete Chat Logs older than
     * the specified amount
     *
     * @return Deleted Count
     */
    CompletableFuture<Long> deleteOldLogs();

    /**
     * Delete all chat logs for a UUID
     *
     * @param uuid {@link UUID} Profile UUID
     */
    void clearLogs(UUID uuid);

    /**
     * Save temporary chat logs to database
     */
    void saveLogsToDatabase();

    /**
     * Add {@link IChatLog} to the temporary storage
     *
     * @param chatLog {@link IChatLog} Log
     */
    void addChatLog(IChatLog chatLog);

    /**
     * Get the Chat Logs for a {@link UUID}
     *
     * @param uuid {@link UUID} Profile UUID
     * @return Chat Logs
     */
    @NotNull
    CompletableFuture<List<IChatLog>> getByPlayer(UUID uuid);

    /**
     * Get the Chat Logs for a {@link UUID}
     *
     * @param uuid    {@link UUID} Profile UUID
     * @param message {@link String} Message
     * @return Chat Logs
     */
    @NotNull
    CompletableFuture<List<IChatLog>> getByPlayer(UUID uuid, String message);

    /**
     * Get the Chat Logs for a {@link UUID}
     * in a specified time frame
     *
     * @param uuid {@link UUID} Profile UUID
     * @param time {@link Long} Time
     * @return Chat Logs
     */
    @NotNull
    CompletableFuture<List<IChatLog>> getByPlayer(UUID uuid, long time);

    /**
     * Get a {@link IChatLog} by its ID
     *
     * @param id {@link String} ID
     * @return {@link IChatLog} Log
     */
    @Nullable
    IChatLog getById(String id);

    IChatLogRepository getRepository();

    List<IChatLog> getChatEntriesToSave();
}
