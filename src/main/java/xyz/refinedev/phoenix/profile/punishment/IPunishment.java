package xyz.refinedev.phoenix.profile.punishment;

import xyz.refinedev.phoenix.profile.log.ILogable;

import java.util.List;
import java.util.Random;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 06/12/2022
 * Project: Phoenix
 */

public interface IPunishment extends ILogable {
    PunishmentComparator COMPARATOR = new PunishmentComparator();

    /**
     * Get a random String
     *
     * @param size {@link Integer} String Length
     * @return {@link String}
     */
    static String getRandomSaltedString(int size) {
        StringBuilder saltedString = new StringBuilder();

        while (saltedString.length() < size) {
            int index = (int) (new Random().nextFloat() * "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890".length());
            saltedString.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890".charAt(index));
        }

        return saltedString.toString();
    }

    /**
     * Is a {@link IPunishment} Active?
     *
     * @return {@link Boolean} Active
     */
    boolean isActive();

    /**
     * Is a {@link IPunishment} not Active?
     *
     * @return {@link Boolean} Active
     */
    boolean isntActive();

    /**
     * Is the {@link IPunishment} a Ban?
     *
     * @return {@link Boolean} Ban
     */
    boolean isBan();

    /**
     * Is the {@link IPunishment} a IP-Ban?
     *
     * @return {@link Boolean} IP-Ban
     */
    boolean isIPBan();

    /**
     * Is the {@link IPunishment} a Blacklist?
     *
     * @return {@link Boolean} Blacklist
     */
    boolean isBlacklist();

    /**
     * Is the {@link IPunishment} a Mute?
     *
     * @return {@link Boolean} Mute
     */
    boolean isMute();

    public PunishmentType getPunishmentType();

    public boolean isSilent();

    public boolean isRemovedSilent();

    public boolean isIp();

    public boolean isVoided();

    public boolean isShadow();

    public String getPunishmentID();

    public String getAddress();

    public List<IProof> getProof();

    public void setPunishmentType(PunishmentType punishmentType);

    public void setSilent(boolean silent);

    public void setRemovedSilent(boolean removedSilent);

    public void setIp(boolean ip);

    public void setVoided(boolean voided);

    public void setShadow(boolean shadow);

    public void setPunishmentID(String punishmentID);

    public void setAddress(String address);

    public void setProof(List<IProof> proof);
}
