package xyz.refinedev.phoenix.utils.events;

import xyz.refinedev.phoenix.profile.Profile;
import xyz.refinedev.phoenix.profile.grant.Grant;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Event called whenever player or console tries to grant rank to a player
 */
@RequiredArgsConstructor
@Getter
public class PlayerDeGrantEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    private final Grant grant;
    private final Profile profile;
    private final CommandSender executor;

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
