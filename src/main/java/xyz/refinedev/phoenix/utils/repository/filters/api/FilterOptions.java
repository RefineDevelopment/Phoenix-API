package xyz.refinedev.phoenix.utils.repository.filters.api;

import org.bson.conversions.Bson;

public interface FilterOptions {
    Bson toBson();

    String toSQL();
}
