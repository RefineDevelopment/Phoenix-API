package xyz.refinedev.phoenix.packet.impl.server;

import lombok.AllArgsConstructor;
import xyz.refinedev.phoenix.utils.Packet;

@AllArgsConstructor
public class SendToStaffClickablePacket implements Packet {
    private String message;
    private String hover;
    private String cmd;
    private boolean admin;
    private boolean staff;

    @Override
    public void onReceive() {
    }
}
