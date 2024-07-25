package xyz.refinedev.phoenix.scope;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;

@Getter
public class Scope {
    public static final Scope GLOBAL = new Scope("global");
    private final String scope;

    public Scope(String scope) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the scope valid?
     *
     * @param scope {@link String} Scope
     * @return {@link Boolean} Valid
     */
    public static boolean isValid(String scope) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the multiple scope string valid?
     *
     * @param scopes {@link String} Scopes
     * @return {@link Boolean} Valid
     */
    public static boolean isValidMultiple(String scopes) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Create a {@link Scope} for a server
     *
     * @param server {@link String} Server
     * @return {@link Scope}
     */
    public static Scope server(String server) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Create a {@link Scope} for a group
     *
     * @param group {@link String} Group
     * @return {@link Scope}
     */
    public static Scope group(String group) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a list of formatted Scopes
     *
     * @param scopes {@link List<Scope>} Scopes
     * @return {@link List<String>} Formatted Scopes
     */
    public static List<String> toNiceScopes(List<Scope> scopes) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a List of Scopes from a Scope String
     *
     * @param s {@link String} Scope String
     * @return {@link List<Scope>}
     */
    public static List<Scope> of(String s) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a List of Scopes from a List of Scope Strings
     *
     * @param s {@link List<String>} Scope Strings
     * @return {@link List<Scope>}
     */
    public static List<Scope> of(List<String> s) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the {@link Scope} Display Name
     *
     * @return {@link String} Display Name
     */
    public String getDisplayName() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Scope} a Global Scope?
     *
     * @return {@link Boolean} Global
     */
    public boolean isGlobal() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Scope} a Server Scope?
     *
     * @return {@link Boolean} Server
     */
    public boolean isServer() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Scope} a Group Scope?
     *
     * @return {@link Boolean} Group
     */
    public boolean isGroup() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the {@link Scope} Server Name
     *
     * @return {@link String} Server Name
     */
    public String getServerName() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the {@link Scope} Group Name
     *
     * @return {@link String} Group Name
     */
    public String getGroupName() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
