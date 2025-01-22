package xyz.refinedev.phoenix.chat.api;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.entity.Player;

import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * @since 8/26/2022
 * Project: Phoenix
 */

@Getter
@RequiredArgsConstructor
public abstract class ChatChannelType {
    public abstract String getName();

    public abstract boolean canSendMessage(Player player);

    public abstract int getPriority();

    public abstract String getFormat();

    public abstract boolean canReceiveMessage(UUID sender, Player receiver);

    public boolean isGlobal() {
        return false;
    }

    public String getPermission() { return null; }

    public String getQuickAccessPrefix() {
        return null;
    }
}
