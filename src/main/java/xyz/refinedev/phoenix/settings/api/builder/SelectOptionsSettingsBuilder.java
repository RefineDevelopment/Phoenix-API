package xyz.refinedev.phoenix.settings.api.builder;

import org.bukkit.Material;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.menu.api.Button;
import xyz.refinedev.phoenix.utils.XMaterial;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 8/26/2022
 * Project: Phoenix
 */
public class SelectOptionsSettingsBuilder {

    private String title = "N/A";
    private Material material = Material.AIR;
    private List<String> description = Collections.emptyList();
    private List<String> values = Collections.emptyList();
    private String defaultValue = "";
    private String metaData = "";
    private int currentIndex = 0;
    private String permission = "";
    private List<String> overrideValue;
    private Runnable afterAction = null;

    public SelectOptionsSettingsBuilder titleOf(String title) {
        this.title = title;
        return this;
    }

    public SelectOptionsSettingsBuilder materialOf(Material material) {
        this.material = material;
        return this;
    }

    public SelectOptionsSettingsBuilder materialOf(XMaterial material) {
        this.material = material.parseMaterial();
        return this;
    }

    public SelectOptionsSettingsBuilder descriptionOf(String... description) {
        this.description = Arrays.asList(description);
        return this;
    }

    public SelectOptionsSettingsBuilder descriptionOf(List<String> description) {
        this.description = description;
        return this;
    }

    public SelectOptionsSettingsBuilder defaultOf(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    public SelectOptionsSettingsBuilder valuesOf(List<String> values) {
        this.values = values;
        return this;
    }

    public SelectOptionsSettingsBuilder metaDataOf(String metaData) {
        this.metaData = metaData;
        return this;
    }

    public SelectOptionsSettingsBuilder permissionOf(String permission) {
        this.permission = permission;
        return this;
    }

    public SelectOptionsSettingsBuilder afterActionOf(Runnable afterAction) {
        this.afterAction = afterAction;
        return this;
    }

    public SelectOptionsSettingsBuilder overrideValueOf(List<String> overrideValue) {
        this.overrideValue = overrideValue;
        return this;
    }

    public Button asButton() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
