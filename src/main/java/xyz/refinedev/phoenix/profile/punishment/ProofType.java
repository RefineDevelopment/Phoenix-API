package xyz.refinedev.phoenix.profile.punishment;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Creaxx
 * Created At: 4/11/2023
 */

@Getter
@RequiredArgsConstructor
public enum ProofType {

    LINK("Link"),
    CHAT_SNAPSHOT("Chat Snapshot");

    private final String niceName;

    public static ProofType getByName(String name) {
        if (name.equalsIgnoreCase("snapshot") || name.equalsIgnoreCase("chatsnapshot") || name.equalsIgnoreCase("chat"))
            return CHAT_SNAPSHOT;
        return LINK;
    }

}
