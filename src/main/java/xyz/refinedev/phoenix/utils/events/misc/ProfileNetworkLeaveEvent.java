package xyz.refinedev.phoenix.utils.events.misc;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

@Getter
@Setter
public class ProfileNetworkLeaveEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final UUID uuid;

    public ProfileNetworkLeaveEvent(UUID uuid) {
        super(true);
        this.uuid = uuid;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
