package xyz.refinedev.phoenix.utils;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;

/**
 * @author Creaxx
 * Created At: 3/26/2023
 */

@RequiredArgsConstructor
public class LimitedSizeList<E> extends ArrayList<E> {

    private final int max;

    @Override
    public boolean add(E e) {

        if (size() >= max) {
            remove(0);
        }

        return super.add(e);
    }
}
