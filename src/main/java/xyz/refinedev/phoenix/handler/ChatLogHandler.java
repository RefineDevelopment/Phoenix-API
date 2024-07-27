package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.profile.chatsnapshot.ChatLog;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * @author Creaxx
 * Created At: 3/26/2023
 */

@Getter
public class ChatLogHandler {
    /**
     * Delete Chat Logs older than
     * the specified amount
     *
     * @return Deleted Count
     */
    public CompletableFuture<Long> deleteOldLogs() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Delete all chat logs for a UUID
     *
     * @param uuid {@link UUID} Profile UUID
     */
    public void clearLogs(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Add {@link ChatLog} to the temporary storage
     *
     * @param chatLog {@link ChatLog} Log
     */
    public void addChatLog(ChatLog chatLog) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Chat Logs for a {@link UUID}
     *
     * @param uuid {@link UUID} Profile UUID
     * @return Chat Logs
     */
    public @NotNull CompletableFuture<List<ChatLog>> getByPlayer(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Chat Logs for a {@link UUID}
     *
     * @param uuid {@link UUID} Profile UUID
     * @return Chat Logs
     */
    public @NotNull CompletableFuture<List<ChatLog>> getByPlayer(UUID uuid, String message) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }


    /**
     * Get a {@link ChatLog} by its ID
     *
     * @param id {@link String} ID
     * @return {@link ChatLog} Log
     */
    public @Nullable ChatLog getById(String id) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
