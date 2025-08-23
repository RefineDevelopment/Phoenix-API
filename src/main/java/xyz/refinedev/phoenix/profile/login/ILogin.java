package xyz.refinedev.phoenix.profile.login;

import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 5/16/2023
 */

public interface ILogin {
    /**
     * Get the Duration of the {@link ILogin}
     *
     * @return {@link Long} Duration
     */
    long getDuration();

    /**
     * Has the {@link ILogin} been marked as logged out?
     *
     * @return {@link Boolean} Logged Out
     */
    boolean hasLoggedOut();

    UUID getId();

    UUID getTarget();

    long getLogin();

    String getIp();

    long getLogout();

    void setLogout(long logout);
}
