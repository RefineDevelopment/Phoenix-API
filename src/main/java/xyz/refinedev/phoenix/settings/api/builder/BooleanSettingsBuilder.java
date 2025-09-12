package xyz.refinedev.phoenix.settings.api.builder;

import lombok.Getter;
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
 * Created At: 8/25/2022
 * Project: Phoenix
 */

@Getter
public final class BooleanSettingsBuilder {

    private String title = "N/A";
    private Material material = Material.AIR;
    private List<String> description = Collections.emptyList();
    private String metaData = "";
    private String permission = "";
    private boolean defaultValue = true;
    private String overrideValue;
    private Runnable afterAction = null;
    private boolean useOverrideLore = false;
    private List<String> overrideEnabledLore = new ArrayList<>();
    private List<String> overrideDisabledLore = new ArrayList<>();
    private List<String> overrideNoPermissionLore = new ArrayList<>();

    public BooleanSettingsBuilder titleOf(String title) {
        this.title = title;
        return this;
    }

    public BooleanSettingsBuilder materialOf(Material material) {
        this.material = material;
        return this;
    }

    public BooleanSettingsBuilder materialOf(XMaterial material) {
        this.material = material.parseMaterial();
        return this;
    }

    public BooleanSettingsBuilder descriptionOf(String... description) {
        this.description = Arrays.asList(description);
        return this;
    }

    public BooleanSettingsBuilder descriptionOf(List<String> description) {
        this.description = description;
        return this;
    }

    public BooleanSettingsBuilder metaDataOf(String metaData) {
        this.metaData = metaData;
        return this;
    }

    public BooleanSettingsBuilder permissionOf(String permission) {
        this.permission = permission;
        return this;
    }

    public BooleanSettingsBuilder defaultOf(boolean defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    public BooleanSettingsBuilder afterActionOf(Runnable afterAction) {
        this.afterAction = afterAction;
        return this;
    }

    public BooleanSettingsBuilder overrideValueOf(String overrideValue) {
        this.overrideValue = overrideValue;
        return this;
    }

    public BooleanSettingsBuilder overrideEnabledLoreOf(List<String> overrideEnabledLore) {
        this.overrideEnabledLore = overrideEnabledLore;
        return this;
    }

    public BooleanSettingsBuilder overrideDisabledLoreOf(List<String> overrideDisabledLore) {
        this.overrideDisabledLore = overrideDisabledLore;
        return this;
    }

    public BooleanSettingsBuilder overrideNoPermissionLoreOf(List<String> overrideNoPermissionLore) {
        this.overrideNoPermissionLore = overrideNoPermissionLore;
        return this;
    }

    public BooleanSettingsBuilder useOverrideLoreOf(boolean useOverrideLore) {
        this.useOverrideLore = useOverrideLore;
        return this;
    }

    public Button asButton() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
