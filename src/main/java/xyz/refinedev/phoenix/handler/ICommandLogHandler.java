package xyz.refinedev.phoenix.handler;

import xyz.refinedev.phoenix.profile.commandlog.ICommandLog;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * @author Creaxx
 * Created At: 2/1/2023
 */

public interface ICommandLogHandler {
    /**
     * Save a {@link ICommandLog}
     *
     * @param uuid {@link UUID} Issued By
     * @param server {@link String} Issued Server
     * @param command {@link String} Issued Command
     */
    void saveCommandLog(UUID uuid, String server, String command);

    /**
     * Get the Command Logs for a Profile in a specific time frame
     *
     * @param uuid {@link UUID} Issued By
     * @param time {@link Long} Commands Since (MS)
     * @param perm {@link Boolean} All Commands?
     * @return Command Logs
     */
    CompletableFuture<List<ICommandLog>> findByIssuedBy(UUID uuid, long time, boolean perm);

    /**
     * Get the Command Logs for a Server in a specific time frame
     *
     * @param server {@link String} Issued Server
     * @param time {@link Long} Commands Since (MS)
     * @param perm {@link Boolean} All Commands?
     * @return Command Logs
     */
    CompletableFuture<List<ICommandLog>> findByServer(String server, long time, boolean perm);
}
