package xyz.refinedev.phoenix.profile;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.refinedev.phoenix.SharedAPI;
import xyz.refinedev.phoenix.profile.cooldown.Cooldown;
import xyz.refinedev.phoenix.profile.disguise.DisguiseData;
import xyz.refinedev.phoenix.profile.grant.Grant;
import xyz.refinedev.phoenix.profile.login.Login;
import xyz.refinedev.phoenix.profile.notes.Note;
import xyz.refinedev.phoenix.profile.punishment.Punishment;
import xyz.refinedev.phoenix.profile.punishment.PunishmentType;
import xyz.refinedev.phoenix.profile.tag.Tag;
import xyz.refinedev.phoenix.rank.Rank;
import xyz.refinedev.phoenix.rank.permission.ProfilePermission;
import xyz.refinedev.phoenix.scope.Scope;

import java.util.*;
import java.util.concurrent.CompletableFuture;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 06/12/2022
 * Project: Phoenix
 */

@Getter
@Setter
@RequiredArgsConstructor
public class Profile {
    private static final SharedAPI api = SharedAPI.getInstance();

    @SerializedName("_id")
    private final UUID uuid;

    private String name;
    private String nameToLowercase;

    private Set<ProfilePermission> permissions = new HashSet<>();

    private Set<String> attachmentPermissions = new HashSet<>();
    private Set<UUID> ignoring = new HashSet<>();
    private List<Cooldown> globalCooldowns = new ArrayList<>();
    private Set<UUID> alts = new HashSet<>();
    private List<Note> notes = new ArrayList<>();

    private String currentAddress = "";
    private Set<String> knownAddresses = new HashSet<>();

    private DisguiseData disguiseData = new DisguiseData();

    private String authType = null;
    private boolean twoFactor = false;
    private String secretKey = "";

    private Map<String, String> metadata = new HashMap<>();

    public static UUID getConsoleUuid() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Load a profile from the database
     */
    public void loadProfile() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Load a profile without saving it in the database if it doesn't exist already
     */
    public void loadProfileNoSave() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Set a {@link Profile}'s name
     *
     * @param name Name
     */
    public void setName(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Save the profile to the database
     */
    public void saveProfile() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Save the profile to the database
     * and update it on all servers
     *
     * @param permissions Should permissions be recalculated?
     */
    public void saveAndUpdate(boolean permissions) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Save the profile to the database
     * and update it on all servers
     */
    public void saveAndUpdate() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * List of the {@link Profile}'s punishments
     *
     * @return {@link List<Punishment>} Punishments
     */
    public List<Punishment> getPunishments() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Profile}'s {@link Tag}
     *
     * @return {@link Tag} Tag
     */
    public @Nullable Tag getTag() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Set a {@link Profile}'s {@link Tag}
     *
     * @param tag Tag
     */
    public void setTag(Tag tag) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Profile} currently banned?
     *
     * @return {@link Boolean} Banned
     */
    public boolean isBanned() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Profile} currently competitive banned?
     *
     * @return {@link Boolean} Competitive Banned
     */
    public boolean isCompetitiveBanned() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Profile} currently blacklisted?
     *
     * @return {@link Boolean} Blacklisted
     */
    public boolean isBlacklisted() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Profile} currently muted?
     *
     * @return {@link Boolean} Muted
     */
    public boolean isMuted() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Profile} currently ip-muted?
     *
     * @return {@link Boolean} IP-Muted
     */
    public boolean isIPMuted() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Profile} currently ip-banned?
     *
     * @return {@link Boolean} IP-Banned
     */
    public boolean isIPBanned() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Profile} currently normal or shadow muted?
     *
     * @return {@link Boolean} Shadow/Normal Mute
     */
    public boolean isNormalOrShadowMuted() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Profile} currently normal muted?
     *
     * @return {@link Boolean} Normal Mute
     */
    public boolean isNormalMuted() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Profile} currently shadow muted?
     *
     * @return {@link Boolean} Shadow Mute
     */
    public boolean isShadowMuted() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Active Ban of an alt
     *
     * @return {@link Punishment} Active Ban
     */
    public @Nullable Punishment getActiveIPBanWithoutSelf() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Profile}'s Active Mute
     *
     * @return {@link Punishment} Active Mute
     */
    public @Nullable Punishment getActiveIPMute() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Profile}'s Active IP-Ban
     *
     * @return {@link Punishment} Active IP-Ban
     */
    public @Nullable Punishment getActiveIPBan() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Profile}'s Active Competitive Ban
     *
     * @return {@link Punishment} Active Competitive Ban
     */
    public @Nullable Punishment getActiveCompetitiveBan() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Profile}'s Active Ban
     *
     * @return {@link Punishment} Active Ban
     */
    public @Nullable Punishment getActiveBan() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Profile}'s Active Mute
     *
     * @return {@link Punishment} Active Mute
     */
    public @Nullable Punishment getActiveMute() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Profile}'s Active Blacklist
     *
     * @return {@link Punishment} Active Blacklist
     */
    public @Nullable Punishment getActiveBlacklist() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public @NotNull List<Punishment> getPunishments(PunishmentType type) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Does the {@link Profile} has an active punish of this type.
     *
     * @param type {@link PunishmentType} Type
     * @return {@link Boolean} Punished
     */
    public boolean hasActivePunishment(PunishmentType type) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the profile staff?
     *
     * @return {@link Boolean} Staff
     */
    public boolean isStaff() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the profile media?
     *
     * @return {@link Boolean} Media
     */
    public boolean isMedia() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Profile}'s Grants
     *
     * @return {@link List<Grant>} Grants
     */
    public List<Grant> getGrants() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Profile}'s sorted Grants
     *
     * @return {@link List<Grant>} Grants
     */
    public @NotNull List<Grant> getSortedGrants() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Profile}'s sorted Grants (Reversed)
     *
     * @return {@link List<Grant>} Grants
     */
    public @NotNull List<Grant> getSortedGrantsReversed() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Recalculate a {@link Profile}'s Permissions
     */
    public void updatePermissions() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Profile}'s active Grants
     *
     * @return {@link List<Grant>} Grants
     */
    public @NotNull List<Grant> getActiveGrants() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Profile}'s highest rank color
     *
     * @return {@link String} Color
     */
    public @NotNull String getNameColor() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Profile}'s highest visible Grant
     *
     * @return {@link Grant} Grant
     */
    public @Nullable Grant getBestGrant() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Profile}'s highest Grant
     * including the invisible ones
     *
     * @return {@link Grant} Grant
     */
    public @Nullable Grant getBestGeneralGrant() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Profile}'s Highest visible Rank
     *
     * @return {@link Rank} Rank
     */
    public @NotNull Rank getHighestRank() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Profile}'s Highest Rank
     * including invisible ones
     *
     * @return {@link Rank} Rank
     */
    public @NotNull Rank getGeneralRank() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the profile vanished?
     *
     * @return {@link Boolean} Vanished
     */
    public boolean isVanished() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Profile}'s Priority
     * Gets disguised priority if disguised
     *
     * @return {@link Integer} Priority
     */
    public int getFakePriority() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Profile}'s Priority
     *
     * @return {@link Integer} Priority
     */
    public int getPriority() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the date of the first {@link Login}
     * from a list of Logins
     *
     * @param logins {@link List<Login>} Logins
     * @return {@link String} Login Date
     */
    public @NotNull String getFirstLogin(List<Login> logins) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the date of the last {@link Login}
     * from a list of Logins
     *
     * @param logins {@link List<Login>} Logins
     * @return {@link String} Login Date
     */
    public @NotNull String getLastLogin(List<Login> logins) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the most recent {@link Login} from
     * a list of Logins
     *
     * @param logins {@link List<Login>} Logins
     * @return {@link Login} Login
     */
    public @Nullable Login getMostRecentLogin(List<Login> logins) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the last seen of {@link Profile}
     *
     * @param logins {@link List<Login>} Logins
     * @return {@link String} Formatted Time
     */
    public @NotNull String getLastSeenAgo(List<Login> logins) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the playtime of {@link Profile}
     *
     * @param logins {@link List<Login>} Logins
     * @return {@link Login} Time in MS
     */
    public long getPlayTime(List<Login> logins) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Does the {@link Profile} have a subscription {@link Rank}?
     *
     * @return {@link Boolean} Subscription
     */
    public boolean hasSubscription() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the prefix for subscription {@link Rank}
     *
     * @return {@link String} Subscription Rank Text
     */
    public @Nullable String getSubRanks() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Grant} for a {@link Rank}
     * that is currently active on the current {@link Scope}
     *
     * @param rank {@link Rank} Rank
     * @return {@link Grant} Grant
     */
    public @Nullable Grant getGrantAllScopes(Rank rank) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Does the {@link Profile} have a {@link Grant}
     * for the {@link Rank}?
     *
     * @param rank {@link Rank} Rank
     * @return {@link Boolean} Has Rank
     */
    public boolean hasRank(Rank rank) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Does the {@link Profile} have a {@link Grant}
     * for the {@link Rank} and is it Permanent?
     *
     * @param rank {@link Rank} Rank
     * @return {@link Boolean} Has Rank
     */
    public boolean hasRankAndCantUpgrade(Rank rank) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * If a {@link Profile}'s real name is provided
     * get the real name otherwise get the disguised name
     *
     * @param providedName {@link String} Name to Use
     * @return {@link String} Name
     */
    public @NotNull String getNameWithColorCoverDisguise(String providedName) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the colored name of a {@link Profile}
     * (If disguised the disguised name is applied)
     *
     * @return {@link String} Colored Name
     */
    public @NotNull String getNameWithColor() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the real colored name of a {@link Profile}
     *
     * @return {@link String} Colored Name
     */
    public @NotNull String getNameWithColorNoDisguise() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the name of a {@link Profile}
     * (If disguised the disguised name is applied)
     *
     * @return {@link String} Name
     */
    public @NotNull String getPlayerName() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Load a {@link Profile}'s alts and save the output
     */
    public void loadAlts() {
        loadAlts(true);
    }

    /**
     * Load a {@link Profile}'s alts
     *
     * @param save {@link Boolean} Should the output be saved?
     */
    public void loadAlts(boolean save) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get Punishments removed by the {@link Profile}
     *
     * @return List of Punishments
     */
    public @NotNull CompletableFuture<List<Punishment>> getPunishmentsRemoved() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get Punishments issued by the {@link Profile}
     *
     * @return List of Punishments
     */
    public @NotNull CompletableFuture<List<Punishment>> getPunishmentsIssued() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get Grants issued by the {@link Profile}
     *
     * @return List of Grants
     */
    public @NotNull CompletableFuture<List<Grant>> getGrantsIssued() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Profile} ignoring the UUID?
     *
     * @param uuid {@link UUID} UUID
     * @return {@link Boolean} Ignored
     */
    public boolean isIgnoring(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a list of ignored player names
     *
     * @return {@link List<String>} Ignore Names
     */
    public @NotNull List<String> getNiceIgnoreNames() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the {@link Profile}'s current Chat Channel
     *
     * @return {@link String} Chat Channel
     */
    public @NotNull String getChatChannelName() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a Setting with the specified name
     *
     * @param name {@link String} Setting Name
     * @return {@link String} Setting
     */
    public @Nullable String getSetting(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Does the {@link Profile} have the setting
     * with the specified name?
     *
     * @param name {@link String} Setting Name
     * @return {@link Boolean} Has Setting
     */
    public boolean hasMetadata(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a Setting with the specified name
     * with a Default Value if none is present
     *
     * @param name {@link String} Setting Name
     * @param defaultValue {@link String} Default Value
     * @return {@link String} Setting
     */
    public @NotNull @Deprecated String getMetadata(String name, String defaultValue) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a Setting with the specified name
     * with a Default Value if none is present
     *
     * @param name {@link String} Setting Name
     * @param defaultValue {@link String} Default Value
     * @return {@link String} Setting
     */
    public String getSetting(String name, String defaultValue) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get an Integer Setting with the specified name
     *
     * @param name {@link String} Setting Name
     * @return {@link Integer} Setting
     */
    public int getIntSetting(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get an Integer Setting with the specified name
     * with a Default Value if none is present
     *
     * @param name {@link String} Setting Name
     * @param defaultValue {@link Integer} Default Value
     * @return {@link Integer} Setting
     */
    public int getIntSetting(String name, int defaultValue) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a Double Setting with the specified name
     *
     * @param name {@link String} Setting Name
     * @return {@link Double} Setting
     */
    public double getDoubleSetting(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a Double Setting with the specified name
     * with a Default Value if none is present
     *
     * @param name {@link String} Setting Name
     * @param defaultValue {@link Double} Default Value
     * @return {@link Double} Setting
     */
    public double getDoubleSetting(String name, double defaultValue) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Does the {@link Profile} have the setting
     * with the specified name enabled (Default True)?
     *
     * @param name {@link String} Setting Name
     * @return {@link Boolean} Setting Enabled
     */
    public boolean isSetting(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Does the {@link Profile} have the setting
     * with the specified name enabled (Default True)?
     *
     * @param name {@link String} Setting Name
     * @return {@link Boolean} Setting Enabled
     */
    public boolean isMetadata(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Does the {@link Profile} have the setting
     * with the specified name enabled?
     * With a Default Value if none is present
     *
     * @param name {@link String} Setting Name
     * @param defaultValue {@link Boolean} Default Value
     * @return {@link Boolean} Setting Enabled
     */
    public boolean isMetadata(String name, boolean defaultValue) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Update the setting for a specific key
     *
     * @param name {@link String} Setting Name
     * @param value {@link Object} Object
     * @param save {@link Boolean} Should this be saved immediately
     */
    public void updateMetadata(String name, Object value, boolean save) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the {@link Profile}'s UUID
     *
     * @return {@link UUID} UUID
     */
    public UUID getUniqueId() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Does the {@link Profile} have the permission?
     *
     * @param permission {@link String} Permission
     * @return {@link Boolean} Has Permission
     */
    public boolean hasAccessToPermission(String permission) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Does the {@link Profile} have the permission
     * in their user permissions?
     *
     * @param value {@link String} Permission
     * @return {@link Boolean} Has Permission
     */
    public boolean hasPrivatePermission(String value) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Remove a {@link ProfilePermission} from
     * the {@link Profile}
     *
     * @param perm {@link String} Permission
     */
    public void removePermission(String perm) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link ProfilePermission} from a {@link String}
     *
     * @param perm {@link String} Permission
     * @return {@link ProfilePermission} Profile Permission
     */
    public @Nullable ProfilePermission getPermission(String perm) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the Punishments for the {@link Profile}'s alts
     *
     * @return {@link List<Punishment>} Punishments
     */
    public @NotNull List<Punishment> getAltPunishments() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the remainder of a Global Cooldown
     *
     * @param name {@link String} Cooldown Name
     * @return {@link Long} Remainder in MS
     */
    public long getGlobalRemaining(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a Global Cooldown
     *
     * @param name {@link String} Cooldown Name
     * @return {@link Cooldown} Cooldown
     */
    public @Nullable Cooldown getGlobalCooldown(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Profile} on global cooldown?
     *
     * @param name {@link String} Cooldown Name
     * @return {@link Boolean} Has Cooldown
     */
    public boolean hasGlobalCooldown(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get the remainder of a Local Cooldown
     *
     * @param name {@link String} Cooldown Name
     * @return {@link Long} Remainder in MS
     */
    public long getLocalRemaining(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Is the {@link Profile} on local cooldown?
     *
     * @param name {@link String} Cooldown Name
     * @return {@link Boolean} Has Cooldown
     */
    public boolean hasLocalCooldown(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    /**
     * Get a {@link Note} with the Note ID
     *
     * @param uuid {@link UUID} Note ID
     * @return {@link Note} Note
     */
    public Note getNote(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
