package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.notification.Notification;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * @author Creaxx
 * Created At: 2/5/2023
 */

@Getter
public class NotificationHandler {
    /**
     * Save a Notification
     *
     * @param notification {@link Notification} Notification
     */
    public void saveNotification(Notification notification) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Delete a Notification
     *
     * @param notification {@link Notification} Notification
     */
    public void deleteNotification(Notification notification) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get all unread Notifications for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return Notifications
     */
    public CompletableFuture<List<Notification>> getUnreadByPlayer(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get all read Notifications for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return Notifications
     */
    public CompletableFuture<List<Notification>> getReadByPlayer(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get all the UUIDs that have marked the
     * {@link Notification} as read
     *
     * @param notification {@link Notification}
     * @return {@link Set<String>} UUIDs
     */
    public Set<String> getReadsForNotification(Notification notification) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get all the UUIDs that have viewed
     * the {@link Notification}
     *
     * @param notification {@link Notification}
     * @return {@link Set<String>} UUIDs
     */
    public Set<String> getViewsForNotification(Notification notification) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Mark a Notification as Read for a Profile
     *
     * @param notification {@link Notification} Notification
     * @param uuid         {@link UUID} Profile UUID
     */
    public void markAsRead(Notification notification, UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Mark a Notification as Unread for a Profile
     *
     * @param notification {@link Notification} Notification
     * @param uuid         {@link UUID} Profile UUID
     */
    public void markAsUnread(Notification notification, UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Mark a Notification as Viewed for a Profile
     *
     * @param notification {@link Notification} Notification
     * @param uuid         {@link UUID} Profile UUID
     */
    public void markAsViewed(Notification notification, UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Notification} by its ID
     *
     * @param id {@link String} ID
     * @return {@link Notification} Notification
     */
    public @Nullable Notification getFromCache(String id) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

}
