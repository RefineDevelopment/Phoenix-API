package xyz.refinedev.phoenix.utils.events.misc;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

@RequiredArgsConstructor
@Getter
public class ProfileSettingUpdateEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final UUID uuid;
    private final String setting;

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
