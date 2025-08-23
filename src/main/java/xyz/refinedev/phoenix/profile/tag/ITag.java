package xyz.refinedev.phoenix.profile.tag;

public interface ITag {
    /**
     * Get the Displayname of the {@link ITag}
     *
     * @return {@link String} Display Name
     */
    String getDisplayName();

    @Override
    int hashCode();

    @Override
    boolean equals(Object o);

    String getName();

    String getPrefix();

    String getColor();

    int getPriority();

    int getPrice();

    boolean isPurchasable();

    void setPrefix(String prefix);

    void setColor(String color);

    void setPriority(int priority);

    void setPrice(int price);

    void setPurchasable(boolean purchasable);
}
