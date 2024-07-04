package xyz.refinedev.phoenix.packet.impl.server;

import lombok.AllArgsConstructor;
import xyz.refinedev.phoenix.utils.Packet;

@AllArgsConstructor
public class ServerStatusPacket implements Packet {
    private String server;
    private String region;
    private String time;
    private boolean online;

    @Override
    public void onReceive() {
    }
}
