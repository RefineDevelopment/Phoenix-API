package xyz.refinedev.phoenix.profile.disguise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@Getter
@Setter
@AllArgsConstructor
public class Skin {
    public static final String ID_API = "https://api.mojang.com/users/profiles/minecraft/";
    public static final String WEB_API = "https://sessionserver.mojang.com/session/minecraft/profile/";
    public static final Map<String, Skin> SKINS = new HashMap<>();

    public static Skin DEFAULT_SKIN = new Skin("", "", "");

    private String name;
    private String value;
    private String signature;

    public static CompletableFuture<Skin> getSkinByName(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
