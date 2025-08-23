package xyz.refinedev.phoenix.utils.repository.sorting.api;

import org.bson.conversions.Bson;

public interface SortingOptions {
    Bson toBson();

    String toSQL();
}
