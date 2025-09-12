package xyz.refinedev.phoenix.utils.events.disguise;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import xyz.refinedev.phoenix.profile.IProfile;

@Setter
@Getter
@RequiredArgsConstructor
public class ProfileDisguiseEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final IProfile profile;
    private boolean cancelled;

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
