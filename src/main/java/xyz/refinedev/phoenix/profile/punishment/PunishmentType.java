package xyz.refinedev.phoenix.profile.punishment;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PunishmentType {

    BAN("Bans", "Ban", "banned", "unbanned"),
    BLACKLIST("Blacklists", "Blacklist","blacklisted", "unblacklisted"),
    MUTE("Mutes", "Mute","muted", "unmuted"),
    KICK("Kicks", "Kick", "kicked", ""),
    COMPETITIVE("Competitive Bans", "Competitive Ban", "competitive banned", "competitive unbanned"),
    WARN("Warns", "Warn", "warned", "unwarned");

    private final String name;
    private final String niceName;
    private final String punished;
    private final String removed;
}
