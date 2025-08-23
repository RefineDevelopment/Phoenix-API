package xyz.refinedev.phoenix.handler;

import xyz.refinedev.phoenix.server.IServerData;

import java.util.UUID;

/**
 * @author Creaxx
 * @version Phoenix
 * @since 27/08/2024
 */

public interface IAnalyticsHandler {
    /**
     * Clean up the Analytics
     */
    void cleanUp();

    /**
     * Save the Player's Login time in cache
     *
     * @param uuid {@link UUID} Profile UUID
     */
    void addToLoggedIn(UUID uuid);

    /**
     * Save the duration of the Players session in cache
     *
     * @param uuid {@link UUID} Profile UUID
     */
    void saveLoggedInTime(UUID uuid);

    /**
     * Get the total Peak Players
     *
     * @return {@link Integer} Peak Players
     */
    int getTotalPeakPlayers();

    /**
     * Get the total Peak Players
     * a certain amount of days ago
     *
     * @param daysAgo {@link Integer} Days Ago
     * @return {@link Integer} Peak Players
     */
    int getTotalPeakPlayers(int daysAgo);

    /**
     * Get the Peak Players of the current {@link IServerData}
     *
     * @return {@link Integer} Peak Players
     */
    int getPeakPlayers();

    /**
     * Get the Peak Players of a {@link IServerData}
     *
     * @param serverData {@link IServerData} ServerData
     * @return {@link Integer} Peak Players
     */
    int getPeakPlayers(IServerData serverData);

    /**
     * Get the Peak Players of the current {@link IServerData}
     * a certain amount of days ago
     *
     * @param daysAgo {@link Integer} Days Ago
     * @return {@link Integer} Peak Players
     */
    int getPeakPlayers(int daysAgo);

    /**
     * Get the Peak Players of a {@link IServerData}
     * a certain amount of days ago
     *
     * @param serverData {@link IServerData} ServerData
     * @param daysAgo    {@link Integer} Days Ago
     * @return {@link Integer} Peak Players
     */
    int getPeakPlayers(IServerData serverData, int daysAgo);

    /**
     * Get the total average Playtime
     *
     * @return {@link Integer} Average Playtime
     */
    String getTotalAveragePlayTime(int daysAgo);

    /**
     * Get the total average Playtime difference
     * a certain amount of days ago
     *
     * @param daysAgo {@link Integer} Days Ago
     * @return {@link Integer} Average Playtime
     */
    String getTotalAveragePlayTimeDifference(int daysAgo);

    /**
     * Get the average Playtime of the current {@link IServerData}
     *
     * @return {@link Integer} Average Playtime
     */
    String getAveragePlayTime();

    /**
     * Get the average Playtime of a {@link IServerData}
     *
     * @param serverData {@link IServerData} ServerData
     * @return {@link Integer} Average Playtime
     */
    String getAveragePlayTime(IServerData serverData);

    /**
     * Get the average Playtime of the current {@link IServerData}
     * a certain amount of days ago
     *
     * @param daysAgo {@link Integer} Days Ago
     * @return {@link Integer} Average Playtime
     */
    String getAveragePlayTime(int daysAgo);

    /**
     * Get the average Playtime of a {@link IServerData}
     * a certain amount of days ago
     *
     * @param serverData {@link IServerData} ServerData
     * @param daysAgo    {@link Integer} Days Ago
     * @return {@link Integer} Average Playtime
     */
    String getAveragePlayTime(IServerData serverData, int daysAgo);

    /**
     * Get the average Playtime difference of a {@link IServerData}
     * a certain amount of days ago
     *
     * @param serverData {@link IServerData} ServerData
     * @param daysAgo    {@link Integer} Days Ago
     * @return {@link Integer} Average Playtime
     */
    String getAveragePlayTimeDifference(IServerData serverData, int daysAgo);

    /**
     * Update the Peak Player count
     *
     * @param players {@link Integer} Players
     */
    void updatePeakPlayers(int players);

    /**
     * Get the number of Logins in
     * a specific time frame
     *
     * @param days {@link Integer} Days
     * @return {@link Long} Login Count
     */
    long getLogins(int days);
}
