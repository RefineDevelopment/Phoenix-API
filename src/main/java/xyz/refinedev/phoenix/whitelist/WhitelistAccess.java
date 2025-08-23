package xyz.refinedev.phoenix.whitelist;

import lombok.Getter;
import xyz.refinedev.phoenix.PlatformGetter;
import xyz.refinedev.phoenix.handler.IWhitelistHandler;
import xyz.refinedev.phoenix.profile.IProfile;
import xyz.refinedev.phoenix.rank.IRank;
import xyz.refinedev.phoenix.server.IServerData;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;

@Getter
public enum WhitelistAccess {

    UUID("UUID", (profile, server) -> {
        IWhitelistHandler whitelistHandler = PlatformGetter.getInstance().getWhitelistHandler();
        if (whitelistHandler.isNameBased()) {
            return whitelistHandler.getWhitelistedUsers().contains(profile.getName().toLowerCase());
        } else {
            return whitelistHandler.getWhitelistedUsers().contains(profile.getUniqueId().toString());
        }
    }),
    RANK("Rank", (profile, server) -> {
        IRank rank = PlatformGetter.getInstance().getWhitelistHandler().getWhitelistRank();
        if (rank == null) return true;

        return profile.getGeneralRank().getPriority() >= rank.getPriority();
    });
//    TOKEN("Token", (profile, server) -> {
//        WhitelistHandler whitelistHandler = ISharedAPI.getInstance().getWhitelistHandler();
//        if (GlobalConfig.WHITELIST.NAME_BASED) {
//            return whitelistHandler.getWhitelistedUsers().contains(profile.getName().toLowerCase());
//        } else {
//            return whitelistHandler.getWhitelistedUsers().contains(profile.getUniqueId().toString());
//        }
//    });

    private final String displayName;
    private final BiFunction<IProfile, IServerData, Boolean> function;

    WhitelistAccess(String displayName, BiFunction<IProfile, IServerData, Boolean> function) {
        this.displayName = displayName;
        this.function = function;
    }

    public static WhitelistAccess getWhitelistAccessByName(String access) {
        return Arrays.stream(values()).filter(w -> w.name().equalsIgnoreCase(access)).findFirst().orElse(null);
    }

    public static Set<WhitelistAccess> getTypesFromList(List<String> types) {
        Set<WhitelistAccess> accessTypes = new HashSet<>();

        for (String type : types) {
            accessTypes.add(WhitelistAccess.getWhitelistAccessByName(type));
        }

        return accessTypes;
    }
}
