package xyz.refinedev.phoenix.handler;

import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.other.CommandLog;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * @author Creaxx
 * Created At: 2/1/2023
 */

public class CommandLogHandler {
    /**
     * Save a {@link CommandLog}
     *
     * @param uuid {@link UUID} Issued By
     * @param server {@link String} Issued Server
     * @param command {@link String} Issued Command
     */
    public void saveCommandLog(UUID uuid, String server, String command) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Command Logs for a Profile in a specific time frame
     *
     * @param uuid {@link UUID} Issued By
     * @param time {@link Long} Commands Since (MS)
     * @param perm {@link Boolean} All Commands?
     * @return Command Logs
     */
    public CompletableFuture<List<CommandLog>> findByIssuedBy(UUID uuid, long time, boolean perm) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Command Logs for a Server in a specific time frame
     *
     * @param server {@link String} Issued Server
     * @param time {@link Long} Commands Since (MS)
     * @param perm {@link Boolean} All Commands?
     * @return Command Logs
     */
    public CompletableFuture<List<CommandLog>> findByServer(String server, long time, boolean perm) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
