package xyz.refinedev.phoenix.profile.antivpn;

import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 07/10/2023
 */

public interface IAntiVPNData {
    UUID getUuid();

    String getHashedIp();

    long getTime();

    String getCity();

    String getRegion();

    String getCountry();

    String getIsp();

    boolean isVpn();

    void setCity(String city);

    void setRegion(String region);

    void setCountry(String country);

    void setIsp(String isp);

    void setVpn(boolean vpn);
}
