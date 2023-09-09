package xyz.refinedev.phoenix.utils.events;

import xyz.refinedev.phoenix.profile.punishment.Punishment;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@RequiredArgsConstructor
@Getter
public class PunishmentEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final Punishment punishment;

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
