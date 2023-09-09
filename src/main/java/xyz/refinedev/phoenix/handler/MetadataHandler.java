package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.metadata.Metadata;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 27/12/2022
 * Project: Phoenix
 */
@Getter
public class MetadataHandler {
    public List<Metadata> getMetadata(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public CompletableFuture<Metadata> findByMetadata(String name, Object value) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
