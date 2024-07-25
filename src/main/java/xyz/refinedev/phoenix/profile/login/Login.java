package xyz.refinedev.phoenix.profile.login;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 5/16/2023
 */

@Getter
@Setter
@RequiredArgsConstructor
public class Login {

    @SerializedName("_id")
    private final UUID id = UUID.randomUUID();

    private final UUID target;

    private final long login = System.currentTimeMillis();
    private final String ip;

    private long logout = 0L;

    /**
     * Get the Duration of the {@link Login}
     *
     * @return {@link Long} Duration
     */
    public long getDuration() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Has the {@link Login} been marked as logged out?
     *
     * @return {@link Boolean} Logged Out
     */
    public boolean hasLoggedOut() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
