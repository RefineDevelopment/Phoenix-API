package xyz.refinedev.phoenix.hook;

import java.util.UUID;

public interface ICosmeticsHook {

    public int getCoins(UUID uuid);

    public String getColor(UUID uuid);
    public String getChatColor(UUID uuid);

}
