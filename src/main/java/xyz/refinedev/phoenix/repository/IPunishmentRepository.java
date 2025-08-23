package xyz.refinedev.phoenix.repository;

import xyz.refinedev.phoenix.profile.punishment.IPunishment;
import xyz.refinedev.phoenix.utils.repository.IOnlineCacheListRepository;

import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 05/01/2023
 * Project: Phoenix
 */

public interface IPunishmentRepository extends IOnlineCacheListRepository<UUID, IPunishment> {
}
