package xyz.refinedev.phoenix.utils.events.player;

import lombok.Getter;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import xyz.refinedev.phoenix.chat.api.ChatChannelType;
import xyz.refinedev.phoenix.profile.IProfile;

@Getter
public class PlayerChatInChannelEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    private final ChatChannelType channelType;
    private final IProfile profile;
    private final String message;
    private boolean cancelled;

    public PlayerChatInChannelEvent(ChatChannelType channelType, IProfile profile, String message) {
        super(true);
        this.channelType = channelType;
        this.profile = profile;
        this.message = message;
    }

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
