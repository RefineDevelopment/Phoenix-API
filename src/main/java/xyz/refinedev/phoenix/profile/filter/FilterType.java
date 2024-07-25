package xyz.refinedev.phoenix.profile.filter;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum FilterType {
    WORD("Word"),
    REGEX("Regex"),
    CONTAINS("Contains");

    private final String displayName;
}
