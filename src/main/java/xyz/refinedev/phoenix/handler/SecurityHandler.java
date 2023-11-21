package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.grant.Grant;

import java.util.List;
import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 4/17/2023
 */

@Getter
public class SecurityHandler {

    public boolean hasSecurity(UUID uuid, boolean admin) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasSecurity(UUID uuid) {
        return hasSecurity(uuid, false);
    }

    public void addSecurity(UUID uuid, UUID issuedBy, boolean admin) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void removeSecurity(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<UUID> getRankIdsToTrigger() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Grant getGrantInTrigger(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

}
