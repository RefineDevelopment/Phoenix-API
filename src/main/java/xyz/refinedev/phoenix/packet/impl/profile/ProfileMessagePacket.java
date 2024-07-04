package xyz.refinedev.phoenix.packet.impl.profile;

import lombok.AllArgsConstructor;
import xyz.refinedev.phoenix.utils.Packet;

@AllArgsConstructor
public class ProfileMessagePacket implements Packet {
    private String uniqueId;
    private String message;

    @Override
    public void onReceive() {
    }
}
