package xyz.refinedev.phoenix.repository;

import xyz.refinedev.phoenix.profile.chatsnapshot.IChatSnapshot;
import xyz.refinedev.phoenix.utils.repository.IListRepository;

import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 3/26/2023
 */
public interface IChatSnapshotRepository extends IListRepository<UUID, IChatSnapshot> {
}
