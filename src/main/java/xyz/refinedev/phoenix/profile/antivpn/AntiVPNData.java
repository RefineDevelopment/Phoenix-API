package xyz.refinedev.phoenix.profile.antivpn;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 07/10/2023
 */

@Getter
@Setter
@RequiredArgsConstructor
public class AntiVPNData {

    private final UUID uuid;
    private final String hashedIp;

    private String city;
    private String region;
    private String country;
    private String isp;
    private boolean vpn;

}
