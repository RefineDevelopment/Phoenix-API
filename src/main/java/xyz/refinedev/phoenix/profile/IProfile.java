package xyz.refinedev.phoenix.profile;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.profile.antivpn.IAntiVPNData;
import xyz.refinedev.phoenix.profile.cooldown.ICooldown;
import xyz.refinedev.phoenix.profile.disguise.IDisguiseData;
import xyz.refinedev.phoenix.profile.grant.IGrant;
import xyz.refinedev.phoenix.profile.login.ILogin;
import xyz.refinedev.phoenix.profile.notes.INote;
import xyz.refinedev.phoenix.profile.permission.IProfilePermission;
import xyz.refinedev.phoenix.profile.punishment.IPunishment;
import xyz.refinedev.phoenix.profile.punishment.PunishmentType;
import xyz.refinedev.phoenix.profile.tag.ICustomTag;
import xyz.refinedev.phoenix.profile.tag.ITag;
import xyz.refinedev.phoenix.rank.IRank;
import xyz.refinedev.phoenix.scope.IScope;
import xyz.refinedev.phoenix.utils.Tristate;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 06/12/2022
 * Project: Phoenix
 */

public interface IProfile {
    static UUID getConsoleUuid() {
        return UUID.fromString("00000000-0000-0000-0000-000000000000");
    }

    /**
     * Load a profile from the database
     */
    void loadProfile();

    /**
     * Load a profile from the database
     */
    void loadProfile(boolean save);

    /**
     * Load a profile without saving it in the database if it doesn't exist already and without checking redis
     */
    void loadProfileNoSaveNoRedis();

    /**
     * Load a profile from another profile
     */
    void loadProfile(IProfile profile);

    /**
     * Set a {@link IProfile}'s name
     *
     * @param name Name
     */
    void setName(String name);

    /**
     * Save the profile to the database
     */
    void saveProfile();

    /**
     * Save the profile to the database
     */
    void saveProfileSync();

    /**
     * Save the profile to the database
     * and update it on all servers
     *
     * @param permissions Should permissions be recalculated?
     */
    void saveAndUpdate(boolean permissions);

    /**
     * Save the profile to the database
     * and update it on all servers (Sync)
     *
     * @param permissions Should permissions be recalculated?
     */
    void saveAndUpdateSync(boolean permissions);

    /**
     * Save the profile to the database
     * and update it on all servers
     */
    void saveAndUpdate();

    /**
     * List of the {@link IProfile}'s punishments
     *
     * @return {@link List<IPunishment>} Punishments
     */
    List<IPunishment> getPunishments();

    /**
     * Get a {@link IProfile}'s {@link ITag}
     *
     * @return {@link ITag} Tag
     */
    @Nullable
    ITag getTag();

    /**
     * Set a {@link IProfile}'s {@link ITag}
     *
     * @param tag Tag
     */
    void setTag(ITag tag);

    /**
     * Is the {@link IProfile} currently banned?
     *
     * @return {@link Boolean} Banned
     */
    boolean isBanned();

    /**
     * Is the {@link IProfile} currently competitive banned?
     *
     * @return {@link Boolean} Competitive Banned
     */
    boolean isCompetitiveBanned();

    /**
     * Is the {@link IProfile} currently blacklisted?
     *
     * @return {@link Boolean} Blacklisted
     */
    boolean isBlacklisted();

    /**
     * Is the {@link IProfile} currently muted?
     *
     * @return {@link Boolean} Muted
     */
    boolean isMuted();

    /**
     * Is the {@link IProfile} currently ip-muted?
     *
     * @return {@link Boolean} IP-Muted
     */
    boolean isIPMuted();

    /**
     * Is the {@link IProfile} currently ip-banned?
     *
     * @return {@link Boolean} IP-Banned
     */
    boolean isIPBanned();

    /**
     * Should a punishment evade alert be sent?
     *
     * @return {@link Boolean} Evade Alert
     */
    boolean shouldSendEvadeAlert();

    /**
     * Is the {@link IProfile} currently normal or shadow muted?
     *
     * @return {@link Boolean} Shadow/Normal Mute
     */
    boolean isNormalOrShadowMuted();

    /**
     * Is the {@link IProfile} currently normal muted?
     *
     * @return {@link Boolean} Normal Mute
     */
    boolean isNormalMuted();

    /**
     * Is the {@link IProfile} currently shadow muted?
     *
     * @return {@link Boolean} Shadow Mute
     */
    boolean isShadowMuted();

    /**
     * Get the Active Ban of an alt
     *
     * @return {@link IPunishment} Active Ban
     */
    @Nullable
    IPunishment getActiveIPBanWithoutSelf();

    /**
     * Get a {@link IProfile}'s Active Mute
     *
     * @return {@link IPunishment} Active Mute
     */
    @Nullable
    IPunishment getActiveIPMute();


    /**
     * Get a {@link IProfile}'s Active IP-Ban
     *
     * @return {@link IPunishment} Active IP-Ban
     */
    @Nullable
    IPunishment getActiveIPBan();

    /**
     * Get a {@link IProfile}'s Active Competitive Ban
     *
     * @return {@link IPunishment} Active Competitive Ban
     */
    @Nullable
    IPunishment getActiveCompetitiveBan();

    /**
     * Get a {@link IProfile}'s Active Ban
     *
     * @return {@link IPunishment} Active Ban
     */
    @Nullable
    IPunishment getActiveBan();

    /**
     * Get a {@link IProfile}'s Active Mute
     *
     * @return {@link IPunishment} Active Mute
     */
    @Nullable
    IPunishment getActiveMute();

    /**
     * Get a {@link IProfile}'s Active Blacklist
     *
     * @return {@link IPunishment} Active Blacklist
     */
    @Nullable
    IPunishment getActiveBlacklist();

    /**
     * Get a {@link IProfile}'s Active Punishment
     *
     * @param type {@link PunishmentType} Type
     * @return {@link IPunishment} Active Punishment
     */
    @Nullable
    IPunishment getActivePunishment(PunishmentType type);


    @NotNull
    List<IPunishment> getPunishments(PunishmentType type);

    /**
     * Does the {@link IProfile} has an active punish of this type.
     *
     * @param type {@link PunishmentType} Type
     * @return {@link Boolean} Punished
     */
    boolean hasActivePunishment(PunishmentType type);

    /**
     * Is the profile staff?
     *
     * @return {@link Boolean} Staff
     */
    boolean isStaff();

    /**
     * Is the profile media?
     *
     * @return {@link Boolean} Media
     */
    boolean isMedia();

    /**
     * Get a {@link IProfile}'s Grants
     *
     * @return {@link List<IGrant>} Grants
     */
    List<IGrant> getGrants();

    /**
     * Get a {@link IProfile}'s sorted Grants
     *
     * @return {@link List<IGrant>} Grants
     */
    @NotNull
    List<IGrant> getSortedGrants();

    /**
     * Get a {@link IProfile}'s sorted Grants (Reversed)
     *
     * @return {@link List<IGrant>} Grants
     */
    @NotNull
    List<IGrant> getSortedGrantsReversed();

    /**
     * Recalculate a {@link IProfile}'s Permissions
     */
    void updatePermissions();

    /**
     * Get a {@link IProfile}'s active Grants
     *
     * @return {@link List<IGrant>} Grants
     */
    @NotNull
    List<IGrant> getActiveGrants();

    /**
     * Get a {@link IProfile}'s highest rank color
     *
     * @return {@link String} Color
     */
    @NotNull
    String getNameColor();

    /**
     * Get a {@link IProfile}'s highest visible Grant
     *
     * @return {@link IGrant} Grant
     */
    @Nullable
    IGrant getBestGrant();

    /**
     * Get a {@link IProfile}'s highest Grant
     * including the invisible ones
     *
     * @return {@link IGrant} Grant
     */
    @Nullable
    IGrant getBestGeneralGrant();

    /**
     * Get a {@link IProfile}'s Highest visible Rank
     *
     * @return {@link IRank} Rank
     */
    @NotNull
    IRank getHighestRank();

    /**
     * Get a {@link IProfile}'s Highest Rank
     * including invisible ones
     *
     * @return {@link IRank} Rank
     */
    @NotNull
    IRank getGeneralRank();

    /**
     * Is the profile vanished?
     *
     * @return {@link Boolean} Vanished
     */
    boolean isVanished();

    /**
     * Get a {@link IProfile}'s Priority
     * Gets disguised priority if disguised
     *
     * @return {@link Integer} Priority
     */
    int getFakePriority();

    /**
     * Get a {@link IProfile}'s Priority
     *
     * @return {@link Integer} Priority
     */
    int getPriority();

    /**
     * Get the date of the first {@link ILogin}
     * from a list of Logins
     *
     * @param logins {@link List<ILogin>} Logins
     * @return {@link String} Login Date
     */
    @NotNull
    String getFirstLogin(List<ILogin> logins);

    /**
     * Get the date of the last {@link ILogin}
     * from a list of Logins
     *
     * @param logins {@link List<ILogin>} Logins
     * @return {@link String} Login Date
     */
    @NotNull
    String getLastLogin(List<ILogin> logins);

    /**
     * Get the most recent {@link ILogin} from
     * a list of Logins
     *
     * @param logins {@link List<ILogin>} Logins
     * @return {@link ILogin} Login
     */
    @Nullable
    ILogin getMostRecentLogin(List<ILogin> logins);

    /**
     * Get the last seen of {@link IProfile}
     *
     * @param logins {@link List<ILogin>} Logins
     * @return {@link String} Formatted Time
     */
    @NotNull
    String getLastSeenAgo(List<ILogin> logins);

    /**
     * Get the playtime of {@link IProfile}
     *
     * @param logins {@link List<ILogin>} Logins
     * @return {@link ILogin} Time in MS
     */
    long getPlayTime(List<ILogin> logins);

    /**
     * Does the {@link IProfile} have a subscription {@link IRank}?
     *
     * @return {@link Boolean} Subscription
     */
    boolean hasSubscription();

    /**
     * Get the prefix for subscription {@link IRank}
     *
     * @return {@link String} Subscription Rank Text
     */
    @Nullable
    String getSubRanks();

    /**
     * Get a {@link IGrant} for a {@link IRank}
     * that is currently active on the current {@link IScope}
     *
     * @param rank {@link IRank} Rank
     * @return {@link IGrant} Grant
     */
    @Nullable
    IGrant getGrantAllScopes(IRank rank);

    /**
     * Does the {@link IProfile} have a {@link IGrant}
     * for the {@link IRank}?
     *
     * @param uuid {@link UUID} Rank ID
     * @return {@link Boolean} Has Rank
     */
    boolean hasRank(UUID uuid);

    /**
     * Does the {@link IProfile} have a {@link IGrant}
     * for the {@link IRank}?
     *
     * @param rank {@link IRank} Rank
     * @return {@link Boolean} Has Rank
     */
    boolean hasRank(IRank rank);

    /**
     * Does the {@link IProfile} have a {@link IGrant}
     * for the {@link IRank} and is it Permanent?
     *
     * @param rank {@link IRank} Rank
     * @return {@link Boolean} Has Rank
     */
    boolean hasRankAndCantUpgrade(IRank rank);

    /**
     * If a {@link IProfile}'s real name is provided
     * get the real name otherwise get the disguised name
     *
     * @param providedName {@link String} Name to Use
     * @return {@link String} Name
     */
    @NotNull
    String getNameWithColorCoverDisguise(String providedName);

    /**
     * Get the colored name of a {@link IProfile}
     * (If disguised the disguised name is applied)
     *
     * @return {@link String} Colored Name
     */
    @NotNull
    String getNameWithColor();

    /**
     * Get the real colored name of a {@link IProfile}
     *
     * @return {@link String} Colored Name
     */
    @NotNull
    String getNameWithColorNoDisguise();

    /**
     * Get the name of a {@link IProfile}
     * (If disguised the disguised name is applied)
     *
     * @return {@link String} Name
     */
    @NotNull
    String getPlayerName();

    /**
     * Load a {@link IProfile}'s alts and save the output
     */
    void loadAlts();

    /**
     * Load a {@link IProfile}'s alts
     *
     * @param save {@link Boolean} Should the output be saved?
     */
    void loadAlts(boolean save);

    IAntiVPNData fetchLatestAntiVPNData();

    /**
     * Load a {@link IProfile}'s alts
     *
     * @param save    {@link Boolean} Should the output be saved?
     * @param address {@link String} Address to check alts for
     */
    void loadAlts(boolean save, String address, String subnet);

    /**
     * Get Punishments removed by the {@link IProfile}
     *
     * @return List of Punishments
     */
    @NotNull
    CompletableFuture<List<IPunishment>> getPunishmentsRemoved();

    /**
     * Get Punishments issued by the {@link IProfile}
     *
     * @return List of Punishments
     */
    @NotNull
    CompletableFuture<List<IPunishment>> getPunishmentsIssued();

    /**
     * Get Grants issued by the {@link IProfile}
     *
     * @return List of Grants
     */
    @NotNull
    CompletableFuture<List<IGrant>> getGrantsIssued();

    /**
     * Is the {@link IProfile} ignoring the UUID?
     *
     * @param uuid {@link UUID} UUID
     * @return {@link Boolean} Ignored
     */
    boolean isIgnoring(UUID uuid);

    /**
     * Get a list of ignored player names
     *
     * @return {@link List<String>} Ignore Names
     */
    @NotNull
    List<String> getNiceIgnoreNames();

    /**
     * Get the {@link IProfile}'s current Chat Channel
     *
     * @return {@link String} Chat Channel
     */
    @NotNull
    String getChatChannelName();

    /**
     * Get a Setting with the specified name
     *
     * @param name {@link String} Setting Name
     * @return {@link String} Setting
     */
    @Nullable
    String getSetting(String name);

    /**
     * Does the {@link IProfile} have the setting
     * with the specified name?
     *
     * @param name {@link String} Setting Name
     * @return {@link Boolean} Has Setting
     */
    boolean hasMetadata(String name);

    /**
     * Get a Setting with the specified name
     * with a Default Value if none is present
     *
     * @param name         {@link String} Setting Name
     * @param defaultValue {@link String} Default Value
     * @return {@link String} Setting
     */
    @NotNull
    @Deprecated
    String getMetadata(String name, String defaultValue);

    /**
     * Get a Setting with the specified name
     * with a Default Value if none is present
     *
     * @param name         {@link String} Setting Name
     * @param defaultValue {@link String} Default Value
     * @return {@link String} Setting
     */
    String getSetting(String name, String defaultValue);

    /**
     * Get an Integer Setting with the specified name
     *
     * @param name {@link String} Setting Name
     * @return {@link Integer} Setting
     */
    int getIntSetting(String name);

    /**
     * Get an Integer Setting with the specified name
     * with a Default Value if none is present
     *
     * @param name         {@link String} Setting Name
     * @param defaultValue {@link Integer} Default Value
     * @return {@link Integer} Setting
     */
    int getIntSetting(String name, int defaultValue);

    /**
     * Get a Double Setting with the specified name
     *
     * @param name {@link String} Setting Name
     * @return {@link Double} Setting
     */
    double getDoubleSetting(String name);

    /**
     * Get a Double Setting with the specified name
     * with a Default Value if none is present
     *
     * @param name         {@link String} Setting Name
     * @param defaultValue {@link Double} Default Value
     * @return {@link Double} Setting
     */
    double getDoubleSetting(String name, double defaultValue);

    /**
     * Does the {@link IProfile} have the setting
     * with the specified name enabled (Default True)?
     *
     * @param name {@link String} Setting Name
     * @return {@link Boolean} Setting Enabled
     */
    boolean isSetting(String name);

    /**
     * Does the {@link IProfile} have the setting
     * with the specified name enabled (Default True)?
     *
     * @param name {@link String} Setting Name
     * @return {@link Boolean} Setting Enabled
     */
    boolean isMetadata(String name);

    /**
     * Does the {@link IProfile} have the setting
     * with the specified name enabled?
     * With a Default Value if none is present
     *
     * @param name         {@link String} Setting Name
     * @param defaultValue {@link Boolean} Default Value
     * @return {@link Boolean} Setting Enabled
     */
    boolean isMetadata(String name, boolean defaultValue);

    /**
     * Update the setting for a specific key
     *
     * @param name  {@link String} Setting Name
     * @param value {@link Object} Object
     * @param save  {@link Boolean} Should this be saved immediately
     */
    void updateMetadata(String name, Object value, boolean save);

    /**
     * Get the {@link IProfile}'s UUID
     *
     * @return {@link UUID} UUID
     */
    UUID getUniqueId();

    /**
     * Does the {@link IProfile} have the permission?
     *
     * @param permission {@link String} Permission
     * @return {@link Boolean} Has Permission
     */
    boolean checkPermission(String permission, boolean op);

    /**
     * Does the {@link IProfile} have the permission?
     *
     * @param permission {@link String} Permission
     * @return {@link Tristate} Has Permission
     */
    Tristate checkPermissionTristate(String permission, boolean op);

    /**
     * Does the {@link IProfile} have the permission?
     *
     * @param permission {@link String} Permission
     * @return {@link Boolean} Has Permission
     */
    boolean hasAccessToPermission(String permission);

    /**
     * Does the {@link IProfile} have the permission
     * in their user permissions?
     *
     * @param value {@link String} Permission
     * @return {@link Boolean} Has Permission
     */
    boolean hasPrivatePermission(String value);

    /**
     * Does the {@link IProfile} have the permission
     * in their user permissions?
     *
     * @param value {@link String} Permission
     * @return {@link Boolean} Has Permission
     */
    boolean hasActivePrivatePermission(String value);

    /**
     * Remove a {@link IProfilePermission} from
     * the {@link IProfile}
     *
     * @param perm {@link String} Permission
     */
    void removePermission(String perm);

    /**
     * Add a {@link IProfilePermission} to
     * the {@link IProfile}
     *
     * @param perm {@link String} Permission
     */
    void addPermission(String perm, long duration, List<IScope> scopes);

    /**
     * Get a {@link IProfilePermission} from a {@link String}
     *
     * @param perm {@link String} Permission
     * @return {@link IProfilePermission} Profile Permission
     */
    @Nullable
    IProfilePermission getPermission(String perm);

    /**
     * Gets an active Punishment for the {@link IProfile}'s alts
     *
     * @return {@link IPunishment} Punishment
     */
    @Nullable
    IPunishment getAltPunishmentToKick();

    /**
     * Get the Punishments for the {@link IProfile}'s alts
     *
     * @return {@link List<IPunishment>} Punishments
     */
    @NotNull
    List<IPunishment> getAltPunishments();

    List<INote> getSortedNotes();

    /**
     * Get the remainder of a Global Cooldown
     *
     * @param name {@link String} Cooldown Name
     * @return {@link Long} Remainder in MS
     */
    long getGlobalRemaining(String name);

    /**
     * Get a Global Cooldown
     *
     * @param name {@link String} Cooldown Name
     * @return {@link ICooldown} Cooldown
     */
    @Nullable
    ICooldown getGlobalCooldown(String name);

    /**
     * Is the {@link IProfile} on global cooldown?
     *
     * @param name {@link String} Cooldown Name
     * @return {@link Boolean} Has Cooldown
     */
    boolean hasGlobalCooldown(String name);

    /**
     * Get the remainder of a Local Cooldown
     *
     * @param name {@link String} Cooldown Name
     * @return {@link Long} Remainder in MS
     */
    long getLocalRemaining(String name);

    /**
     * Is the {@link IProfile} on local cooldown?
     *
     * @param name {@link String} Cooldown Name
     * @return {@link Boolean} Has Cooldown
     */
    boolean hasLocalCooldown(String name);

    /**
     * Get a {@link INote} with the Note ID
     *
     * @param uuid {@link UUID} Note ID
     * @return {@link INote} Note
     */
    INote getNote(UUID uuid);

    @Override
    int hashCode();

    @Override
    boolean equals(Object o);

    UUID getUuid();

    String getName();

    Set<IProfilePermission> getPermissions();

    Map<String, Boolean> getAttachmentPermissions();

    Set<UUID> getIgnoring();

    List<ICooldown> getGlobalCooldowns();

    Set<UUID> getAlts();

    Set<UUID> getSiblings();

    List<INote> getNotes();

    String getCurrentAddress();

    String getCurrentSubnet();

    Set<String> getKnownAddresses();

    IDisguiseData getDisguiseData();

    ICustomTag getCustomTag();

    String getAuthType();

    String getTagName();

    String getNameToLowercase();

    boolean isTwoFactor();

    String getSecretKey();

    Map<String, String> getMetadata();

    void setPermissions(Set<IProfilePermission> permissions);

    void setAlts(Set<UUID> alts);

    void setCurrentAddress(String currentAddress);

    void setCurrentSubnet(String currentSubnet);

    void setDisguiseData(IDisguiseData disguiseData);

    void setTagName(String tagName);

    void setCustomTag(ICustomTag customTag);

    void setAuthType(String authType);

    void setTwoFactor(boolean twoFactor);

    void setSecretKey(String secretKey);

    void setMetadata(Map<String, String> metadata);
}
