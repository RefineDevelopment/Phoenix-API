package xyz.refinedev.queue.queue.impl;

import xyz.refinedev.queue.queue.QueuePlayer;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.PriorityQueue;
import java.util.UUID;

/**
 * This Project is the property of Phoenix Development © 2022
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 8/24/2022
 * Project: pxQueue
 */

@Getter
public class Queue {

    private final String name;
    private final String displayName;
    @Getter
    @Setter
    private boolean enabled = true;
    @Setter
    private long lastUpdate;
    private final PriorityQueue<QueuePlayer> players = new PriorityQueue<>(QueuePlayer::compareTo);

    public Queue(String name, String displayName) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public int getAllQueued() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isQueued(UUID queuePlayer) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public int getPosition(UUID queuePlayer) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
