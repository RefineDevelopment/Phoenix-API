package xyz.refinedev.phoenix.handler;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.profile.IProfile;
import xyz.refinedev.phoenix.repository.IProfileRepository;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 06/12/2022
 * Project: Phoenix
 */

public interface IProfileHandler {
    /**
     * @param uuid {@link UUID} UUID
     * @param name {@link String} Name
     * @return {@link IProfile} Profile
     */
    @NotNull IProfile createProfile(UUID uuid, String name);

    /**
     * Get a {@link IProfile} ONLY from the Cache by its UUID
     *
     * @param uuid {@link UUID} UUID
     * @return {@link IProfile} Profile
     */
    @Nullable IProfile getCachedProfile(UUID uuid);

    /**
     * Get a {@link IProfile} by its UUID
     *
     * @param uuid {@link UUID} UUID
     * @return {@link IProfile} Profile
     */
    @Nullable IProfile getProfile(UUID uuid);

    Set<IProfile> getProfiles(Collection<UUID> uuids);

    boolean isInOnlineCache(String name);

    /**
     * Get a {@link IProfile} ONLY from the Cache by its Name
     *
     * @param playerName {@link String} Name
     * @return {@link IProfile} Profile
     */
    @Nullable IProfile getLocalProfileByName(String playerName);

    /**
     * Does a {@link IProfile} with that name exist?
     *
     * @param name {@link String} Name
     * @return {@link Boolean} Exists
     */
    boolean hasProfile(String name);

    boolean isInOnlineCache(UUID uuid);

    /**
     * Get the first {@link IProfile} in the
     * Database with that Name (Ignore-Case)
     *
     * @param name {@link String} Name
     * @return {@link IProfile} Profile
     */
    @Nullable IProfile getProfileFromName(String name);

    /**
     * Get the first {@link IProfile} in the
     * Database with that Name (Match-Case)
     *
     * @param name {@link String} Name
     * @return {@link IProfile} Profile
     */
    @Nullable IProfile getProfileFromCapitalizedName(String name);

    /**
     * Get the {@link UUID} of the first {@link IProfile}
     * in the Database with that Name (Ignore-Case)
     *
     * @param name {@link String} Name
     * @return {@link UUID} UUID
     */
    @Nullable UUID getUuidFromName(String name);

    /**
     * Get a list of the Profiles in the
     * Database with that Name (Ignore-Case)
     *
     * @param name {@link String} Name
     * @return {@link List<IProfile>} Profiles
     */
    List<IProfile> getProfilesFromName(String name);

    /**
     * Has that name been marked as
     * having multiple profiles?
     *
     * @param name {@link String} Name
     * @return {@link Boolean} Has Multiple Profiles
     */
    boolean hasMultipleProfiles(String name);

    IProfileRepository getRepository();

    IProfileCacheRepository getCacheRepository();

    Set<String> getMultipleProfiles();
}
