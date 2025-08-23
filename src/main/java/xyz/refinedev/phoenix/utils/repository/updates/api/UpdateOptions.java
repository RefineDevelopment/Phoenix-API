package xyz.refinedev.phoenix.utils.repository.updates.api;

import org.bson.conversions.Bson;

public interface UpdateOptions {
    Bson toBson();

    String toSQL();
}
