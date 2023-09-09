package xyz.refinedev.phoenix.utils.events;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
@RequiredArgsConstructor
public class PlayerModModeDisableEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final Player player;
    private final boolean modMode;

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
