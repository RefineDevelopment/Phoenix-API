package xyz.refinedev.phoenix.rank;

import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.rank.permission.IPermission;
import xyz.refinedev.phoenix.rank.scopeable.IScopeable;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 06/12/2022
 * Project: Phoenix
 */

public interface IRank extends IScopeable {
    String getColor();

    String getPrefix();

    String getSuffix();

    String getDisplayName();

    String getPlayerListPrefix();

    String getColorLegacy();

    String getPrefixLegacy();

    String getSuffixLegacy();

    String getDisplayNameLegacy();

    String getPlayerListPrefixLegacy();

    /**
     * Get the list of available Permissions on the current scope
     *
     * @return {@link List<String>} Permissions
     */
    List<String> getAvailablePermissions();

    /**
     * Does the {@link IRank} have the permission?
     *
     * @param value {@link String} Permission
     * @return {@link Boolean} Has Permission
     */
    boolean hasPermission(String value);

    /**
     * Remove a Permission from the {@link IRank}
     *
     * @param perm {@link String} Permission
     */
    void removePermission(String perm);

    /**
     * Get the {@link IPermission} Object from
     * a String Permission
     *
     * @param perm {@link String} Permission
     * @return {@link IPermission}
     */
    IPermission getPermission(String perm);

    /**
     * Does the {@link IRank} inherit from
     * another {@link IRank}
     *
     * @param rank {@link IRank} Rank
     * @return {@link Boolean} Inherit
     */
    boolean hasInheritance(IRank rank);

    /**
     * Does the {@link IRank} inherit from
     * another {@link IRank}
     *
     * @param rankId {@link UUID} Rank UUID
     * @return {@link Boolean} Inherit
     */
    boolean hasInheritance(UUID rankId);

    /**
     * Add an inheritance to the {@link IRank}
     *
     * @param rank {@link IRank} Rank
     */
    void addInheritance(IRank rank);

    /**
     * Remove an inheritance from the {@link IRank}
     *
     * @param rank {@link IRank} Rank
     */
    void removeInheritance(IRank rank);


    /**
     * Find a circular inheritance lock for the {@link IRank}
     *
     * @param rank {@link IRank}
     * @return {@link IRank} Inheritance Lock
     */
    @Nullable
    IRank findDependencyLock(IRank rank);

    void setMetadata(String key, String value);

    void removeMetadata(String key);

    boolean hasMetadata(String key);

    String getMetadata(String key);

    boolean getMetadataAsBoolean(String key);

    int getMetadataAsInt(String key);

    <T> T getMetadataAsObject(String key, Function<String, T> supplier);

    @Override
    int hashCode();

    @Override
    boolean equals(Object o);

    UUID getUuid();

    String getName();

    boolean isDefaultRank();

    int getPriority();

    int getPrice();

    List<IPermission> getPermissions();

    List<UUID> getInheritance();

    String getPrefixModern();

    String getDisplayNameModern();

    String getSuffixModern();

    String getColorModern();

    String getPlayerListPrefixModern();

    boolean isVisible();

    boolean isStaff();

    boolean isSubscription();

    boolean isGrantable();

    boolean isPurchasable();

    Map<String, String> getMetadata();

    void setName(String name);

    void setDefaultRank(boolean defaultRank);

    void setPriority(int priority);

    void setPrice(int price);

    void setPermissions(List<IPermission> permissions);

    void setInheritance(List<UUID> inheritance);

    void setPrefix(String prefix);

    void setPrefixModern(String prefixModern);

    void setDisplayName(String displayName);

    void setDisplayNameModern(String displayNameModern);

    void setSuffix(String suffix);

    void setSuffixModern(String suffixModern);

    void setColor(String color);

    void setColorModern(String colorModern);

    void setPlayerListPrefix(String playerListPrefix);

    void setPlayerListPrefixModern(String playerListPrefixModern);

    void setVisible(boolean visible);

    void setStaff(boolean staff);

    void setSubscription(boolean subscription);

    void setGrantable(boolean grantable);

    void setPurchasable(boolean purchasable);

    void setMetadata(Map<String, String> metadata);
}
