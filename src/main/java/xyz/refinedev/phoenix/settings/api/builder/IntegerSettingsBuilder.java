package xyz.refinedev.phoenix.settings.api.builder;

import xyz.refinedev.phoenix.menu.api.Button;
import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * This Project is the property of Phoenix Development © 2022
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * @since 8/25/2022
 * Project: pxCore
 */

@Getter
public final class IntegerSettingsBuilder {

    private String title = "N/A";
    private Material material = Material.AIR;
    private List<String> description = Collections.emptyList();
    private String metaData = "";
    private String permission = "";
    private int limit = 50;
    private int defaultValue = 0;
    private String overrideValue;
    private Runnable afterAction = null;

    public IntegerSettingsBuilder titleOf(String title) {
        this.title = title;
        return this;
    }

    public IntegerSettingsBuilder materialOf(Material material) {
        this.material = material;
        return this;
    }

    public IntegerSettingsBuilder descriptionOf(String... description) {
        this.description = Arrays.asList(description);
        return this;
    }

    public IntegerSettingsBuilder descriptionOf(List<String> description) {
        this.description = description;
        return this;
    }

    public IntegerSettingsBuilder metaDataOf(String metaData) {
        this.metaData = metaData;
        return this;
    }

    public IntegerSettingsBuilder permissionOf(String permission) {
        this.permission = permission;
        return this;
    }

    public IntegerSettingsBuilder defaultOf(int defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    public IntegerSettingsBuilder limitOf(int limit) {
        this.limit = limit;
        return this;
    }

    public IntegerSettingsBuilder afterActionOf(Runnable afterAction) {
        this.afterAction = afterAction;
        return this;
    }

    public IntegerSettingsBuilder overrideValueOf(String overrideValue) {
        this.overrideValue = overrideValue;
        return this;
    }

    public Button asButton() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
