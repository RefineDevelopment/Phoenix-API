package xyz.refinedev.phoenix.packet.impl.server;

import lombok.AllArgsConstructor;
import xyz.refinedev.phoenix.utils.Packet;

@AllArgsConstructor
public class SendToStaffPacket implements Packet {
    private String message;
    private boolean admin;
    private boolean staff;

    @Override
    public void onReceive() {
    }
}
