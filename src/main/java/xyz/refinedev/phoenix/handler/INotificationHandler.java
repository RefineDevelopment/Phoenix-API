package xyz.refinedev.phoenix.handler;

import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.notification.INotification;
import xyz.refinedev.phoenix.repository.INotificationRepository;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * @author Creaxx
 * Created At: 2/5/2023
 */

public interface INotificationHandler {
    /**
     * Save a Notification
     *
     * @param notification {@link INotification} Notification
     */
    void saveNotification(INotification notification);

    /**
     * Delete a Notification
     *
     * @param notification {@link INotification} Notification
     */
    void deleteNotification(INotification notification);

    /**
     * Get all unread Notifications for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return Notifications
     */
    CompletableFuture<List<INotification>> getUnreadByPlayer(UUID uuid);

    /**
     * Get all read Notifications for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return Notifications
     */
    CompletableFuture<List<INotification>> getReadByPlayer(UUID uuid);

    /**
     * Get all the UUIDs that have marked the
     * {@link INotification} as read
     *
     * @param notification {@link INotification}
     * @return {@link Set<String>} UUIDs
     */
    Set<String> getReadsForNotification(INotification notification);

    /**
     * Get all the UUIDs that have viewed
     * the {@link INotification}
     *
     * @param notification {@link INotification}
     * @return {@link Set<String>} UUIDs
     */
    Set<String> getViewsForNotification(INotification notification);

    /**
     * Mark a Notification as Read for a Profile
     *
     * @param notification {@link INotification} Notification
     * @param uuid         {@link UUID} Profile UUID
     */
    void markAsRead(INotification notification, UUID uuid);

    /**
     * Mark a Notification as Unread for a Profile
     *
     * @param notification {@link INotification} Notification
     * @param uuid         {@link UUID} Profile UUID
     */
    void markAsUnread(INotification notification, UUID uuid);

    /**
     * Mark a Notification as Viewed for a Profile
     *
     * @param notification {@link INotification} Notification
     * @param uuid         {@link UUID} Profile UUID
     */
    void markAsViewed(INotification notification, UUID uuid);

    /**
     * Get a {@link INotification} by its ID
     *
     * @param id {@link String} ID
     * @return {@link INotification} Notification
     */
    @Nullable INotification getFromCache(String id);

    INotificationRepository getRepository();
}
