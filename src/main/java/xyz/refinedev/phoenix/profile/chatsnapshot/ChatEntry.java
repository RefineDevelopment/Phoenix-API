package xyz.refinedev.phoenix.profile.chatsnapshot;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 3/26/2023
 */

@Getter
@RequiredArgsConstructor
public class ChatEntry {

    private final UUID uuid;
    private final long time = System.currentTimeMillis();
    private final String message;

    /**
     * Get the formatted Time of the Entry
     *
     * @return {@link String}
     */
    public String getNiceTime() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
