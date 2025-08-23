package xyz.refinedev.phoenix.utils.repository;

import java.util.List;

public interface IOnlineCacheListRepository<K, V> extends ICacheListRepository<K, V> {
    void addToOnlineCache(K key, List<V> v);

    boolean isInOnlineCache(K key);

    void removeFromOnlineCache(K key);
}