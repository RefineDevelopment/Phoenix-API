package xyz.refinedev.phoenix.utils;

import redis.clients.jedis.Jedis;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 9/2/2022
 * Project: Phoenix
 */

public interface VoidRedisCommand {

    void execute(Jedis jedis);

}