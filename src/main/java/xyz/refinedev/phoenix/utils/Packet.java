package xyz.refinedev.phoenix.utils;

public interface Packet {
    default boolean async() {
        return true;
    }

    void onReceive();
}
