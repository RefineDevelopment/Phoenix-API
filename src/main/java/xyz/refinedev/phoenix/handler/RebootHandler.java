package xyz.refinedev.phoenix.handler;

import lombok.RequiredArgsConstructor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.Phoenix;

/**
 * @author Creaxx
 * Created At: 5/2/2023
 */

@RequiredArgsConstructor
public class RebootHandler {
    private final Phoenix plugin;

    /**
     * Reboot the server
     *
     * @param sender {@link CommandSender} Sender
     * @param millis {@link Long} Milliseconds
     */
    public void reboot(CommandSender sender, long millis) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Cancel a reboot
     *
     * @param sender {@link CommandSender} Sender
     */
    public void cancel(CommandSender sender) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Remaining time for a Reboot
     *
     * @return {@link Long} Remaining
     */
    public long getTimeRemaining() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is a Reboot scheduled?
     *
     * @return {@link Boolean} Scheduled
     */
    public boolean isRebootScheduled() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

}
