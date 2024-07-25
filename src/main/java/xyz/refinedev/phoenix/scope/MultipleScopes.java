package xyz.refinedev.phoenix.scope;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * @author Creaxx
 * @version Phoenix
 * @since 30/01/2024
 */

@Getter
@RequiredArgsConstructor
public class MultipleScopes {
    private final List<Scope> scopes;
}
