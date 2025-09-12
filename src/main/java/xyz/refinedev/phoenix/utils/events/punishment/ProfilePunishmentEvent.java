package xyz.refinedev.phoenix.utils.events.punishment;

import lombok.Getter;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import xyz.refinedev.phoenix.profile.punishment.IPunishment;

@Getter
public class ProfilePunishmentEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final IPunishment punishment;

    public ProfilePunishmentEvent(IPunishment punishment) {
        super(true);
        this.punishment = punishment;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
