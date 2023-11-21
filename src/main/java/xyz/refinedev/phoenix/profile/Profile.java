package xyz.refinedev.phoenix.profile;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.profile.cooldown.Cooldown;
import xyz.refinedev.phoenix.profile.disguise.DisguiseData;
import xyz.refinedev.phoenix.profile.grant.Grant;
import xyz.refinedev.phoenix.profile.login.Login;
import xyz.refinedev.phoenix.profile.notes.Note;
import xyz.refinedev.phoenix.profile.punishment.Punishment;
import xyz.refinedev.phoenix.profile.punishment.PunishmentType;
import xyz.refinedev.phoenix.profile.tag.Tag;
import xyz.refinedev.phoenix.rank.Rank;
import xyz.refinedev.phoenix.rank.permission.Permission;

import java.util.*;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * @since 06/12/2022
 * Project: Phoenix
 */

@Getter
@Setter
@RequiredArgsConstructor
public class Profile {

    @SerializedName("_id")
    private final UUID uuid;

    private String name;
    private String nameToLowercase;

    private Set<Permission> permissions = new HashSet<>();
    private Set<String> attachmentPermissions = new HashSet<>();
    private List<UUID> ignoring = new ArrayList<>();
    private List<Cooldown> globalCooldowns = new ArrayList<>();
    private Set<UUID> alts = new HashSet<>();
    private List<Note> notes = new ArrayList<>();

    private String currentAddress = "";
    private List<String> knownAddresses = new ArrayList<>();

    private DisguiseData disguiseData = new DisguiseData();

    private String tagName = "";

    private String authType = null;
    private boolean twoFactor = false;
    private String secretKey = "";

    private List<Login> logins = new ArrayList<>();

    private Map<String, String> metadata = new HashMap<>();

    public static UUID getConsoleUuid() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void loadProfile() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void setName(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void saveProfile() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void saveAndUpdate() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Punishment> getPunishments() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Tag getTag() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void setTag(Tag tag) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isBanned() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isCompetitiveBanned() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isBlacklisted() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isMuted() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isIPMuted() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isIPBanned() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean shouldSendEvadeAlert() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Punishment getActiveIPBan() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Punishment getActiveIPBanWithoutSelf() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Punishment getActiveIPMute() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isNormalMuted() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isShadowMuted() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Punishment getActiveCompetitiveBan() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Punishment getActiveBan() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Punishment getActiveMute() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Punishment getActiveBlacklist() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Punishment> getPunishments(PunishmentType type) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasActivePunishment(PunishmentType type) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isStaff() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Grant> getGrants() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void updatePermissions() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void addPermsFromInheritance(List<UUID> inheritance) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Grant> getActiveGrants() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Rank getBestRank() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getNameColor() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Grant getBestGrant() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Grant getBestGeneralGrant() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Rank getHighestRank() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Rank getGeneralRank() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isVanished() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public int getFakePriority() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public int getPriority() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getFirstLogin() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getLastLogin() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Login getMostRecentLogin() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getLastSeenAgo() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasSubscription() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getSubRanks() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasRank(Rank rank) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasRankAndCantUpgrade(Rank rank) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasTag(Tag tag) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasTagAndCantUpgrade(Tag tag) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getNameWithColorCoverDisguise(String providedName) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getNameWithColor() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getNameWithColorNoDisguise() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getPlayerName() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void loadAlts() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Punishment> getPunishmentsRemoved() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Punishment> getPunishmentsIssued() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<Grant> getGrantsIssued() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isIgnoring(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getSetting(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasMetadata(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    @Deprecated
    public String getMetadata(String name, String defaultValue) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public String getSetting(String name, String defaultValue) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public int getIntSetting(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public int getIntSetting(String name, int defaultValue) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public double getDoubleSetting(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public double getDoubleSetting(String name, double defaultValue) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isSetting(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isMetadata(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean isMetadata(String name, boolean defaultValue) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void updateMetadata(String name, Object value, boolean save) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public UUID getUniqueId() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasAccessToPermission(String permission) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasPrivatePermission(String value) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void removePermission(String perm) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Permission getPermission(String perm) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<UUID> getPunishedAlts() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public long getGlobalRemaining(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Cooldown getGlobalCooldown(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasGlobalCooldown(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public long getLocalRemaining(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public boolean hasLocalCooldown(String name) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public Note getNote(UUID uuid) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
