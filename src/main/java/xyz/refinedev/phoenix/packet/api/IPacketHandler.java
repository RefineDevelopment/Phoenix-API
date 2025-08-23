package xyz.refinedev.phoenix.packet.api;

import java.util.concurrent.CompletableFuture;

public interface IPacketHandler {
    void enable();

    void disable();

    void startProcessingPackets();

    void stopProcessingPackets();

    /**
     * Send a Packet Async
     *
     * @param packet {@link Packet} Packet
     */
    void send(Packet packet);

    /**
     * Send a Packet Async
     *
     * @param packet {@link Packet} Packet
     */
    CompletableFuture<Void> sendAsFuture(Packet packet);

    /**
     * Send a Packet Sync
     *
     * @param packet {@link Packet} Packet
     */
    void sendSync(Packet packet);

    void formatThrowable(Thread thread, Throwable throwable);

    boolean isProcessPackets();
}

