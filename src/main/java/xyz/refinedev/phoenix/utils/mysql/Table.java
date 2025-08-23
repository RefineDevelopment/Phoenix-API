package xyz.refinedev.phoenix.utils.mysql;

import java.util.StringJoiner;

public interface Table {
    String getName();

    default String getTableAttributes() {
        StringJoiner joiner = new StringJoiner(",");
        for (Attribute attribute : getAttributes())
            joiner.add(attribute.toDefinition());
        return joiner.toString();
    }

    Attribute[] getAttributes();
}
