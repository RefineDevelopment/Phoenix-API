package xyz.refinedev.phoenix.settings.api.builder;

import org.bukkit.Material;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.menu.api.Button;
import xyz.refinedev.phoenix.utils.XMaterial;

import java.util.ArrayList;
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
public class MultiOptionsSettingsBuilder {

    private String title = "N/A";
    private Material material = Material.AIR;
    private List<String> description = Collections.emptyList();
    private List<String> values = Collections.emptyList();
    private String metaData = "";
    private String defaultValue = "";
    private String permission = "";
    private String overrideValue;
    private Runnable afterAction = null;
    private boolean useOverrideLore = false;
    private List<String> overrideLore = new ArrayList<>();
    private List<String> overrideNoPermissionLore = new ArrayList<>();

    public MultiOptionsSettingsBuilder titleOf(String title) {
        this.title = title;
        return this;
    }

    public MultiOptionsSettingsBuilder materialOf(Material material) {
        this.material = material;
        return this;
    }

    public MultiOptionsSettingsBuilder materialOf(XMaterial material) {
        this.material = material.parseMaterial();
        return this;
    }

    public MultiOptionsSettingsBuilder descriptionOf(String... description) {
        this.description = Arrays.asList(description);
        return this;
    }

    public MultiOptionsSettingsBuilder descriptionOf(List<String> description) {
        this.description = description;
        return this;
    }

    public MultiOptionsSettingsBuilder valuesOf(List<String> values) {
        this.values = values;
        return this;
    }

    public MultiOptionsSettingsBuilder metaDataOf(String metaData) {
        this.metaData = metaData;
        return this;
    }

    public MultiOptionsSettingsBuilder defaultOf(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    public MultiOptionsSettingsBuilder permissionOf(String permission) {
        this.permission = permission;
        return this;
    }

    public MultiOptionsSettingsBuilder afterActionOf(Runnable afterAction) {
        this.afterAction = afterAction;
        return this;
    }

    public MultiOptionsSettingsBuilder overrideValueOf(String overrideValue) {
        this.overrideValue = overrideValue;
        return this;
    }

    public MultiOptionsSettingsBuilder overrideLoreOf(List<String> overrideLore) {
        this.overrideLore = overrideLore;
        return this;
    }

    public MultiOptionsSettingsBuilder overrideNoPermissionLoreOf(List<String> overrideNoPermissionLore) {
        this.overrideNoPermissionLore = overrideNoPermissionLore;
        return this;
    }

    public MultiOptionsSettingsBuilder useOverrideLoreOf(boolean useOverrideLore) {
        this.useOverrideLore = useOverrideLore;
        return this;
    }


    public Button asButton() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
