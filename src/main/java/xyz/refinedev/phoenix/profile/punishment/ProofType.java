package xyz.refinedev.phoenix.profile.punishment;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * @author Creaxx
 * Created At: 4/11/2023
 */

@Getter
@RequiredArgsConstructor
public enum ProofType {

    LINK("Link"),
    CHAT_SNAPSHOT("Chat Snapshot");

    private final String niceName;

    public static ProofType getByName(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

}
