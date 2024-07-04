package xyz.refinedev.phoenix.scope;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;

@Getter
public class Scope {
    public static final String SCOPE_REGEX = "g:[A-Za-z]+|s:[A-Za-z]+|global";
    public static final Scope GLOBAL = new Scope("global");

    private final String scope;

    public Scope(String scope) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static Scope server(String server) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static Scope group(String group) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static List<String> toNiceScopes(List<Scope> scopes) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public static List<Scope> of(String s) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getDisplayName() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isGlobal() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isServer() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isGroup() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getServerName() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getGroupName() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
