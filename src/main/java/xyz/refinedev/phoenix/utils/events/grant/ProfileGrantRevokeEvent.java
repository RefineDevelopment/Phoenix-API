package xyz.refinedev.phoenix.utils.events.grant;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import xyz.refinedev.phoenix.profile.IProfile;
import xyz.refinedev.phoenix.profile.grant.IGrant;

@Getter
@Setter
public class ProfileGrantRevokeEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    private final IGrant grant;
    private final IProfile profile;
    private final CommandSender executor;
    private boolean cancelled;

    public ProfileGrantRevokeEvent(IGrant grant, IProfile profile, CommandSender executor) {
        super(true);
        this.grant = grant;
        this.profile = profile;
        this.executor = executor;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
