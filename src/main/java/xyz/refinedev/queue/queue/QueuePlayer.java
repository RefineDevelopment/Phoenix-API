package xyz.refinedev.queue.queue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

/**
 * This Project is the property of Phoenix Development © 2022
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * @since 8/24/2022
 * Project: pxQueue
 */
@Getter
public class QueuePlayer implements Comparable<QueuePlayer> {

    private UUID uuid;
    private int priority;
    private long inserted;

    @Override
    public int compareTo(QueuePlayer other) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }


}

