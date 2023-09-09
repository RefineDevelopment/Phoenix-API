package xyz.refinedev.phoenix.chat.api;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.entity.Player;

import java.util.function.BiFunction;

/**
 * @author Creaxx
 * Created At: 5/20/2023
 */

@Getter
@RequiredArgsConstructor
public class ChatLimitation {
    private final String name;
    private final int priority;
    private final BiFunction<Player, String, Boolean> function;
}
