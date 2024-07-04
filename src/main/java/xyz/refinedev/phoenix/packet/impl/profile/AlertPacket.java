package xyz.refinedev.phoenix.packet.impl.profile;

import lombok.AllArgsConstructor;
import xyz.refinedev.phoenix.utils.Packet;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 27/12/2022
 * Project: Phoenix
 */

@AllArgsConstructor
public class AlertPacket implements Packet {
    private String message;

    @Override
    public void onReceive() {
    }
}
