package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.chatsnapshot.ChatSnapshot;

import java.util.List;
import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 3/26/2023
 */

@Getter
public class ChatSnapshotHandler {

    public ChatSnapshot createSnapshot(UUID createdBy) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public ChatSnapshot createSnapshot(UUID createdBy, UUID player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void deleteSnapshot(ChatSnapshot snapshot) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<ChatSnapshot> getByPlayer(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public ChatSnapshot getByNiceId(String id) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
