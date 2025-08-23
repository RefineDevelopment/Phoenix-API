package xyz.refinedev.phoenix.repository;

import xyz.refinedev.phoenix.profile.IProfile;
import xyz.refinedev.phoenix.utils.repository.IOnlineCacheRepository;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public interface IProfileRepository extends IOnlineCacheRepository<UUID, IProfile> {
    ConcurrentHashMap<UUID, IProfile> getOnlineCache();
}
