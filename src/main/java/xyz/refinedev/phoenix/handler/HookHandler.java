package xyz.refinedev.phoenix.handler;

import lombok.RequiredArgsConstructor;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.Phoenix;
import xyz.refinedev.phoenix.hook.api.IHook;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class HookHandler {
    private final Phoenix plugin;
    private final List<IHook> hooks = new ArrayList<>();

    public boolean canRegister(String required) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void addAndRegister(IHook hook) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void registerAllHooks() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public IHook getHook(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isHookEnabled(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void addHook(IHook hook) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
