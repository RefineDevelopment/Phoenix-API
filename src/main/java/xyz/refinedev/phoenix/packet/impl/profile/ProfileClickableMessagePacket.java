package xyz.refinedev.phoenix.packet.impl.profile;

import lombok.AllArgsConstructor;
import xyz.refinedev.phoenix.utils.Packet;

@AllArgsConstructor
public class ProfileClickableMessagePacket implements Packet {
    private String uniqueId;
    private String message;
    private String hover;
    private String command;

    @Override
    public void onReceive() {
    }
}
