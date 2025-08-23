
package xyz.refinedev.phoenix.utils.repository;

import xyz.refinedev.phoenix.utils.repository.filters.api.FilterOptions;
import xyz.refinedev.phoenix.utils.repository.sorting.api.SortingOptions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public interface IMapRepository<K, V> {
    String toJson(V value);

    Map<K, V> getMap();

    V getFromCache(K key);

    void addToCache(K key, V value);

    void removeFromCache(K key);

    void saveToDatabase(K key, V value);

    void saveToDatabaseSync(K key, V value);

    void saveGsonToDatabase(K key, String value);

    void saveGsonToDatabaseSync(K key, String value);

    CompletableFuture<Void> saveGsonToDatabaseFuture(K key, String value);

    CompletableFuture<Void> saveToDatabaseFuture(K key, V value);

    void saveToDatabaseSync(List<V> values);

    List<V> getAllEntriesFromDatabaseSync();

    List<V> getAllEntriesFromDatabaseSync(FilterOptions bson);

    CompletableFuture<List<V>> getAllEntriesFromDatabase();

    CompletableFuture<List<V>> getAllEntriesFromDatabase(FilterOptions bson);

    void removeFromDatabase(K key);

    void removeFromDatabaseSync(K key);

    long removeFromDatabaseSync(FilterOptions options);

    CompletableFuture<V> getFromDatabase(K key);

    V getFromDatabaseSync(K key);

    V getFromDatabaseSync(FilterOptions bson);

    V getFromDatabaseSync(FilterOptions bson, SortingOptions sorts);

    CompletableFuture<Boolean> isInDatabase(K key);

    boolean isInDatabaseSync(K key);

    long countDocuments(FilterOptions options);

    void deleteAll();

    long countDocuments();
}