package xyz.refinedev.phoenix.antivpn.api;

import xyz.refinedev.phoenix.profile.antivpn.IAntiVPNData;

import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 25/10/2023
 */
public interface IAntiVPNProvider {

    IAntiVPNData check(UUID uuid, String ip);

}
