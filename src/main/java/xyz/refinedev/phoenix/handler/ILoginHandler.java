package xyz.refinedev.phoenix.handler;

import xyz.refinedev.phoenix.profile.login.ILogin;
import xyz.refinedev.phoenix.repository.ILoginRepository;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 27/12/2022
 * Project: Phoenix
 */

public interface ILoginHandler {
    /**
     * Update Logins for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     */
    void updateLogins(UUID uuid);

    /**
     * Update Logins for a Profile Async
     *
     * @param uuid {@link UUID} Profile UUID
     */
    CompletableFuture<List<ILogin>> updateLoginsAsync(UUID uuid);

    /**
     * Get the Logins for a Profile from the Database Async
     *
     * @param uuid {@link UUID} Profile UUID
     * @return Logins
     */
    CompletableFuture<List<ILogin>> getDatabaseLogins(UUID uuid);

    /**
     * Get the Logins for a Profile from the Database
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link List<ILogin>}
     */
    List<ILogin> getDatabaseLoginsSync(UUID uuid);

    /**
     * Get the Logins for these UUIDs
     *
     * @param uuids {@link Set<UUID>}
     * @return Login Map By UUID
     */
    Map<UUID, List<ILogin>> getLoginsSync(Set<UUID> uuids);

    /**
     * Get the Logins for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link List<ILogin>}
     */
    List<ILogin> getCachedLogins(UUID uuid);

    /**
     * Get the Logins for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link List<ILogin>}
     */
    List<ILogin> getLogins(UUID uuid);

    /**
     * Mark a Profile's previous Login as Logged Out
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link CompletableFuture}
     */
    CompletableFuture<Void> markPreviousAsLoggedOut(UUID uuid);

    /**
     * Logout a list of Profiles
     *
     * @param uuids {@link List<UUID>} Profile UUIDs
     */
    void logoutPlayers(List<UUID> uuids);

    /**
     * Logout a Profile Async
     *
     * @param uuid {@link UUID} Profile UUID
     */
    void logoutPlayer(UUID uuid);

    /**
     * Logout a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     */
    void logoutPlayerSync(UUID uuid);

    ILoginRepository getRepository();
}
