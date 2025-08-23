package xyz.refinedev.phoenix.utils.repository;

public interface IOnlineCacheRepository<K, V> extends ICacheRepository<K, V> {
    void addToOnlineCache(K key, V v);

    boolean isInOnlineCache(K key);

    void removeFromOnlineCache(K key);
}