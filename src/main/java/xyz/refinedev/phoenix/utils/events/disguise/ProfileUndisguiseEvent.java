package xyz.refinedev.phoenix.utils.events.disguise;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import xyz.refinedev.phoenix.profile.IProfile;

@Getter
@Setter
@RequiredArgsConstructor
public class ProfileUndisguiseEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    private final IProfile profile;
    private boolean cancelled;

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
}
