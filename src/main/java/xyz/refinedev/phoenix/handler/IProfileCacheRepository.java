package xyz.refinedev.phoenix.handler;

import xyz.refinedev.phoenix.profile.IProfile;
import xyz.refinedev.phoenix.utils.repository.IMapRepository;

import java.util.UUID;

public interface IProfileCacheRepository extends IMapRepository<UUID, IProfile> {
}
