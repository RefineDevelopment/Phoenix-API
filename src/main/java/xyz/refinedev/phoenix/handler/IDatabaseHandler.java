package xyz.refinedev.phoenix.handler;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import redis.clients.jedis.JedisPool;
import xyz.refinedev.phoenix.utils.RedisCommand;
import xyz.refinedev.phoenix.utils.VoidAsyncRedisCommand;
import xyz.refinedev.phoenix.utils.VoidRedisCommand;
import xyz.refinedev.phoenix.utils.mysql.Table;

import java.util.function.Consumer;

public interface IDatabaseHandler {
    boolean isReconnecting();

    void setReconnecting(boolean bool);

    boolean enable();

    void disable();

    <T> T runRedisCommand(RedisCommand<T> redisCommand);

    void runRedisCommandAsync(VoidAsyncRedisCommand redisCommand);

    void executeRedisCommand(VoidRedisCommand redisCommand);

    void executeRedisCommand(VoidRedisCommand redisCommand, Consumer<Throwable> exceptionHandler);

    JedisPool getJedisPool();

    MongoDatabase getMongoDatabase();

    MongoCollection<Document> getProfiles();

    MongoCollection<Document> getGrants();

    MongoCollection<Document> getPunishments();

    MongoCollection<Document> getRanks();

    MongoCollection<Document> getLogins();

    MongoCollection<Document> getCommandLogs();

    MongoCollection<Document> getNotifications();

    MongoCollection<Document> getFilters();

    MongoCollection<Document> getTags();

    MongoCollection<Document> getTagCategories();

    MongoCollection<Document> getChatSnapshots();

    MongoCollection<Document> getChatLogs();

    MongoCollection<Document> getDisguiseHistory();

    MongoCollection<Document> getPunishmentLadders();

    MongoCollection<Document> getSecurity();

    MongoCollection<Document> getCustomTags();

    Table getProfilesTable();

    Table getGrantsTable();

    Table getPunishmentsTable();

    Table getRanksTable();

    Table getLoginsTable();

    Table getCommandLogsTable();

    Table getNotificationsTable();

    Table getFiltersTable();

    Table getTagsTable();

    Table getTagCategoriesTable();

    Table getChatSnapshotsTable();

    Table getChatLogsTable();

    Table getDisguiseHistoryTable();

    Table getPunishmentLaddersTable();

    Table getSecurityTable();

    Table getCustomTagsTable();
}
