package xyz.refinedev.phoenix.utils.events.player;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
@RequiredArgsConstructor
public class PlayerModModeUpdateEvent extends Event {
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
