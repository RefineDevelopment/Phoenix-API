package xyz.refinedev.phoenix.packet.api;

import lombok.experimental.UtilityClass;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.utils.Packet;

@UtilityClass
public final class PacketHandler {
    public void send(Packet packet) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void sendSync(Packet packet) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}

