package xyz.refinedev.phoenix.utils.repository;

import xyz.refinedev.phoenix.utils.repository.filters.api.FilterOptions;
import xyz.refinedev.phoenix.utils.repository.sorting.api.SortingOptions;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface IListRepository<K, V> {
    List<V> getCache();

    V getFromCache(K key);

    CompletableFuture<V> getFromDatabase(K key);

    V getFromDatabaseSync(K key);

    CompletableFuture<List<V>> getAllEntriesFromDatabase();

    CompletableFuture<List<V>> getAllEntriesFromDatabase(FilterOptions bson);

    List<V> getAllEntriesSyncFromDatabase();

    List<V> getAllEntriesSyncFromDatabase(FilterOptions bson);

    void addToCache(V value);

    void removeFromCache(V value);

    void saveToDatabase(V value);

    void saveToDatabaseSync(V values);

    void saveToDatabaseSync(List<V> values);

    void removeFromDatabase(V value);

    void removeFromDatabaseSync(V value);

    long removeFromDatabaseSync(FilterOptions options);

    CompletableFuture<V> getFromDatabase(FilterOptions bson, SortingOptions sort);

    V getFromDatabaseSync(FilterOptions bson, SortingOptions sort);

    V getFromDatabaseSync(FilterOptions bson);

    void deleteAll();

    long countDocuments();

}