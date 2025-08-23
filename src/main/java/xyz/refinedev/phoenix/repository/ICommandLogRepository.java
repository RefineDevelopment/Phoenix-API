package xyz.refinedev.phoenix.repository;

import xyz.refinedev.phoenix.profile.commandlog.ICommandLog;
import xyz.refinedev.phoenix.utils.repository.IListRepository;

import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 2/1/2023
 */
public interface ICommandLogRepository extends IListRepository<UUID, ICommandLog> {
}
