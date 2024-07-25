package xyz.refinedev.phoenix.profile.disguise;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

/**
 * This Project is the property of Refine Development © 2023
 * Redistribution of this Project is not allowed
 *
 * @author Creaxx
 * Created At: 07/12/2022
 * Project: Phoenix
 */

@Getter
@Setter
@RequiredArgsConstructor
public class DisguiseHistory {
    @SerializedName("_id")
    private final UUID id = UUID.randomUUID();

    private final long date = System.currentTimeMillis();

    private final UUID player;

    private final UUID rankId;
    private final String name;
    private final Skin skin;
}
