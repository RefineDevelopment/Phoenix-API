package xyz.refinedev.phoenix.profile.other;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

/**
 * <p>
 * This Project is property of Refine Development.<br>
 * Copyright © 2023, All Rights Reserved.<br>
 * Redistribution of this Project is not allowed.<br>
 * </p>
 *
 * @author Creaxx
 * @since 2/1/2023
 */

@Getter
@RequiredArgsConstructor
public class CommandLog {

    @SerializedName("_id")
    private final UUID id = UUID.randomUUID();
    private final UUID issuedBy;
    private final String command;
    private final String server;
    private final long issuedOn = System.currentTimeMillis();

}
