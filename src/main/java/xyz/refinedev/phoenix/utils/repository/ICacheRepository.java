
package xyz.refinedev.phoenix.utils.repository;

import com.github.benmanes.caffeine.cache.Cache;

public interface ICacheRepository<K, V> extends IMapRepository<K, V> {
    Cache<K, V> getCache();
}