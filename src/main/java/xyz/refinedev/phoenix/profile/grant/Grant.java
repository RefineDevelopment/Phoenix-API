package xyz.refinedev.phoenix.profile.grant;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.log.Logable;
import xyz.refinedev.phoenix.rank.Rank;
import xyz.refinedev.phoenix.scope.Scope;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 06/12/2022
 * Project: Phoenix
 */

@Getter
@Setter
public class Grant extends Logable {

    private UUID rankId;
    private List<Scope> scopes = new ArrayList<>();

    @Override
    public boolean isActive() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isActiveOnOneScope() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }


    public boolean isScope(String server, String group) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isScope() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isGlobal() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasGroup(String group) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasServer(String server) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<String> getNiceActiveScopes() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Scope> getActiveScopes() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasScope(Scope toCheck) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<String> getNiceScopes() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public long getRemainingDuration() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Rank getRank() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
