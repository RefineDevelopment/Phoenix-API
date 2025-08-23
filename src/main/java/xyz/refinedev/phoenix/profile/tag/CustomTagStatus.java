package xyz.refinedev.phoenix.profile.tag;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Creaxx
 * @version Phoenix
 * @since 23/08/2024
 */

@Getter
@RequiredArgsConstructor
public enum CustomTagStatus {
    ACCEPTED("Accepted"),
    DENIED("Denied"),
    UNDECIDED("Undecided");

    private final String displayName;
}
