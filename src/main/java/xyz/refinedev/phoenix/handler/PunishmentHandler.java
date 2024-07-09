package xyz.refinedev.phoenix.handler;

import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.packet.api.PacketHandler;
import xyz.refinedev.phoenix.profile.punishment.Punishment;
import xyz.refinedev.phoenix.profile.punishment.PunishmentType;

import java.util.List;
import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 27/12/2022
 * Project: Phoenix
 */

public class PunishmentHandler {

    public List<Punishment> getPunishments(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Punishment> getPunishments(UUID uuid, PunishmentType type) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void executePunishment(Punishment punishment) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void executeRevokePunishment(Punishment punishment) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Punishment> getSortedPunishments(UUID uuid, PunishmentType type) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Punishment> getActivePunishments(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasActivePunishment(UUID uuid, PunishmentType type) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Punishment getActivePunishment(UUID uuid, PunishmentType type) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Punishment getActiveIPPunishment(UUID uuid, PunishmentType type) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Punishment> findByIssuedBy(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Punishment> findByRemovedBy(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Punishment findByPunishmentID(String id) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
