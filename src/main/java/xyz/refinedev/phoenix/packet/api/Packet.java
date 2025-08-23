package xyz.refinedev.phoenix.packet.api;

public interface Packet {
    default boolean async() {
        return true;
    }

    void onReceive();
}
