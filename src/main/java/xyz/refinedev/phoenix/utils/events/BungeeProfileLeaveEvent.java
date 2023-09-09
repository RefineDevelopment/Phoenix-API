package xyz.refinedev.phoenix.utils.events;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

/**
 * Event called whenever player or console tries to grant rank to a player
 */
@RequiredArgsConstructor
@Getter
public class BungeeProfileLeaveEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    private final UUID uuid;
    private boolean cancelled;

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
