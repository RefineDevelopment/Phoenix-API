package xyz.refinedev.phoenix.profile.disguise;

public interface ISkin {
    @Override
    int hashCode();

    @Override
    boolean equals(Object o);

    String getName();

    String getValue();

    String getSignature();

    void setName(String name);

    void setValue(String value);

    void setSignature(String signature);
}
