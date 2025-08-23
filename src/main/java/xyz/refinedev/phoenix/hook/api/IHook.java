package xyz.refinedev.phoenix.hook.api;

import org.bukkit.entity.Player;
import xyz.refinedev.phoenix.Phoenix;

public abstract class IHook {
    boolean isRegistered = false;
    boolean hasTried = false;

    public void setTried() {
        hasTried = true;
    }

    public boolean hasTriedToRegister() {
        return isRegistered;
    }

    public void setRegistered() {
        isRegistered = true;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public abstract String getRequiredPlugin();

    public abstract void register(Phoenix plugin);

    public void refreshPlayer(Player player) {}
}
