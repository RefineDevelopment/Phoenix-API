package xyz.refinedev.phoenix.cache.api;

import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

public interface IUUIDCache {
    Map<String, UUID> nameToUuid = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    Map<UUID, String> uuidToName = new HashMap<>();

    void loadFromCache();

    /**
     * Get the UUID of a Player from the Cache Only
     *
     * @param name {@link String} Name
     * @return {@link UUID} UUID
     */
    default @Nullable UUID getUuidNoMojang(String name) {
        return nameToUuid.get(name);
    }

    /**
     * Get the Name of a Player from their UUID
     *
     * @param uuid {@link UUID} UUID
     * @return {@link String} String
     */
    default @Nullable String getName(UUID uuid) {
        if (uuidToName.containsKey(uuid)) return uuidToName.get(uuid);

        return "N/A";
    }

    /**
     * Get the Name of a Player from their UUID as a String
     *
     * @param uuid {@link String} UUID
     * @return {@link String} String
     */
    default @Nullable String getNameFromString(String uuid) {
        try {
            return getName(UUID.fromString(uuid));
        } catch (Exception ignored) {
            return uuid;
        }
    }

    /**
     * Get the UUID of a Player
     *
     * @param name {@link String} Name
     * @return {@link UUID} UUID
     */
    default @Nullable UUID getUuid(String name) {
        if (name.toLowerCase().contains("uuid")) return null;
        if (nameToUuid.containsKey(name)) return nameToUuid.get(name);

        return null;
    }

    /**
     * Update the UUID Cache with Data
     *
     * @param uuid           {@link UUID} UUID
     * @param name           {@link String} Name
     * @param persistToRedis {@link Boolean} Save in Redis?
     */
    void addToCache(UUID uuid, String name, boolean persistToRedis);
}
