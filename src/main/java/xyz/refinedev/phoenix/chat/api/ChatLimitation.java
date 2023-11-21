package xyz.refinedev.phoenix.chat.api;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.entity.Player;

import java.util.function.BiFunction;

/**
 * <p>
 * This Project is property of Refine Development.<br>
 * Copyright © 2023, All Rights Reserved.<br>
 * Redistribution of this Project is not allowed.<br>
 * </p>
 *
 * @author Creaxx
 * @since 5/20/2023
 */

@Getter
@RequiredArgsConstructor
public class ChatLimitation {
    private final String name;
    private final int priority;
    private final BiFunction<Player, String, Boolean> function;
}
