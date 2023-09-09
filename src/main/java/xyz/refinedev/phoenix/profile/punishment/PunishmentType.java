package xyz.refinedev.phoenix.profile.punishment;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PunishmentType {

    BAN("Bans", "banned", "unbanned"), BLACKLIST("Blacklists", "blacklisted", "unblacklisted"),
    MUTE("Mutes", "muted", "unmuted"),
    KICK("Kicks", "kicked", ""),
    COMPETITIVE("Competitive Bans", "competitive banned", "competitive unbanned"),
    WARN("Warns", "warned", "unwarned");

    private final String name;
    private final String punished;
    private final String removed;
}
