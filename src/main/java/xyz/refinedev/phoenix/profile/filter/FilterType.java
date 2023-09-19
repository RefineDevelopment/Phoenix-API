package xyz.refinedev.phoenix.profile.filter;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum FilterType {
    WORD("Word"),
    REGEX("Regex");

    private final String displayName;
}
