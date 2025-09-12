package xyz.refinedev.phoenix.utils.events.player;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import xyz.refinedev.phoenix.profile.IProfile;

/**
 * Event called whenever a profile tries to report someone
 */
@Getter
@RequiredArgsConstructor
public class PlayerReportEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    private final Player player;
    private final IProfile hacker;
    private final String reason;

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
