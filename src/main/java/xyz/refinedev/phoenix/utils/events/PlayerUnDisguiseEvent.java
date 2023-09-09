package xyz.refinedev.phoenix.utils.events;

import xyz.refinedev.phoenix.profile.Profile;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.beans.ConstructorProperties;

public class PlayerUnDisguiseEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final Profile targetData;
    private boolean cancelled;


    @ConstructorProperties({"targetData"})
    public PlayerUnDisguiseEvent(Profile targetData) {
        this.targetData = targetData;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Profile getProfile() {
        return this.targetData;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public void setCancelled(boolean b) {
        this.cancelled = b;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
}
