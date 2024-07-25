package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.profile.punishment.Punishment;
import xyz.refinedev.phoenix.profile.punishment.PunishmentType;

import java.util.List;
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

@Getter
public class PunishmentHandler {
    /*
     * Execute a Punishment
     *
     * @param punishment {@link Punishment} Punishment
     */
    public void executePunishment(Punishment punishment) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Execute a Punishment Revoke
     *
     * @param punishment {@link Punishment} Punishment
     */
    public void executeRevokePunishment(Punishment punishment) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get all Punishments from the Database Async
     *
     * @return Punishments
     */
    public @NotNull CompletableFuture<List<Punishment>> getAllPunishments() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Punishments for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link List<Punishment>}
     */
    public @NotNull List<Punishment> getPunishments(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Punishments for a Profile from the Database
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link List<Punishment>}
     */
    public @NotNull List<Punishment> getDatabasePunishmentsSync(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Punishments for a Profile from the Database Async
     *
     * @param uuid {@link UUID} Profile UUID
     * @return Punishments
     */
    public @NotNull CompletableFuture<List<Punishment>> getDatabasePunishments(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Update the Punishments for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     */
    public void updatePunishments(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Update the Punishments for a Profile Async
     *
     * @param uuid {@link UUID} Profile UUID
     */
    public @NotNull CompletableFuture<List<Punishment>> updatePunishmentsAsync(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Punishments for a Profile
     * with a specific type
     *
     * @param uuid {@link UUID} Profile UUID
     * @param type {@link PunishmentType} Punishment Type
     * @return {@link List<Punishment>}
     */
    public @NotNull List<Punishment> getPunishments(UUID uuid, PunishmentType type) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the sorted Punishments for a Profile
     * with a specific type
     *
     * @param uuid {@link UUID} Profile UUID
     * @param type {@link PunishmentType} Punishment Type
     * @return {@link List<Punishment>}
     */
    public @NotNull List<Punishment> getSortedPunishments(UUID uuid, PunishmentType type) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the active Punishments for a Profile
     *
     * @param uuid {@link UUID} Profile UUID
     * @return {@link List<Punishment>}
     */
    public @NotNull List<Punishment> getActivePunishments(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Does the Profile have an active {@link Punishment}
     * with that specific type?
     *
     * @param uuid {@link UUID} Profile UUID
     * @param type {@link PunishmentType} Punishment Type
     * @return {@link Boolean} has Active Punishment
     */
    public boolean hasActivePunishment(UUID uuid, PunishmentType type) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get an active {@link Punishment} for a
     * Profile with a specific type
     *
     * @param uuid {@link UUID} Profile UUID
     * @param type {@link PunishmentType} Punishment Type
     * @return {@link Punishment}
     */
    public @Nullable Punishment getActivePunishment(UUID uuid, PunishmentType type) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get an active IP {@link Punishment} for a
     * Profile with a specific type
     *
     * @param uuid {@link UUID} Profile UUID
     * @param type {@link PunishmentType} Punishment Type
     * @return {@link Punishment}
     */
    public @Nullable Punishment getActiveIPPunishment(UUID uuid, PunishmentType type) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Issued Punishments for a Profile Async
     *
     * @param uuid {@link UUID} Profile UUID
     * @return Punishments
     */
    public @NotNull CompletableFuture<List<Punishment>> findByIssuedBy(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Removed Punishments for a Profile Async
     *
     * @param uuid {@link UUID} Profile UUID
     * @return Punishments
     */
    public @NotNull CompletableFuture<List<Punishment>> findByRemovedBy(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Punishment} by its punishmentID
     *
     * @param id {@link String} Punishment ID
     * @return Punishments
     */
    public @Nullable Punishment findByPunishmentID(String id) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

}
