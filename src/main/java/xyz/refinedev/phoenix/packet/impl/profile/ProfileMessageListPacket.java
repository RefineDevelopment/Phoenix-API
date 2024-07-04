package xyz.refinedev.phoenix.packet.impl.profile;

import lombok.AllArgsConstructor;
import xyz.refinedev.phoenix.utils.Packet;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
public class ProfileMessageListPacket implements Packet {
    private UUID uniqueId;
    private List<String> messages;

    @Override
    public void onReceive() {
    }
}
