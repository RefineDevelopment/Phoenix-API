package xyz.refinedev.phoenix.packet.impl.profile;

import lombok.AllArgsConstructor;
import xyz.refinedev.phoenix.utils.Packet;

@AllArgsConstructor
public class MessagePacket implements Packet {
    private String targetUUID1;
    private String senderUUID1;
    private String msg;
    private String server;

    @Override
    public void onReceive() {
    }
}
