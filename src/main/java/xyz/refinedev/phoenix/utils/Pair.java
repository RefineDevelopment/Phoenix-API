package xyz.refinedev.phoenix.utils;

import lombok.Getter;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 08/12/2022
 * Project: Phoenix
 */

@Getter
public class Pair<K, V> {
    public final K first;
    public final V second;

    private Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <K, V> Pair<K, V> of(K a, V b) {
        return new Pair<>(a, b);
    }
}